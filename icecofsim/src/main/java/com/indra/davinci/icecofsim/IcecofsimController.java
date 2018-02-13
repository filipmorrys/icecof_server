package com.indra.davinci.icecofsim;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.davinci.icecofsim.icecof.domain.Issue;
import com.indra.davinci.icecofsim.icecof.domain.WorkOnTrack;
import com.indra.davinci.icecofsim.icecof.repo.IssuesRepository;
import com.indra.davinci.icecofsim.icecof.repo.WorkOnTrackRepository;
import com.indra.davinci.icecofsim.process.InvalidPathException;
import com.indra.davinci.icecofsim.topology.domain.Node;
import com.indra.davinci.icecofsim.topology.domain.Track;
import com.indra.davinci.icecofsim.topology.repo.NodeRepository;
import com.indra.davinci.icecofsim.topology.repo.TrackRepository;

@RestController
@RequestMapping("/api")
public class IcecofsimController {
	
	Logger logger = Logger.getLogger(IcecofsimController.class);

	@Autowired
	private NodeRepository nodeRepository;

	@Autowired
	private TrackRepository trackRepository;
	
	@Autowired
	private IssuesRepository issuesRepository;
	
	@Autowired
	private WorkOnTrackRepository workOnTrackRepository;
	
	@CrossOrigin
	@RequestMapping("/nodes")
	public List<Node> getNodes() {
		logger.log(Level.INFO, "Received request: /nodes");
		
		List<Node> nodes = (List<Node>) nodeRepository.findAll(new Sort("sectionKp"));
		
		logger.log(Level.INFO, "Response for: /nodes =>"+nodes);
		return nodes;
	}
	
	@CrossOrigin
	@RequestMapping("/tracks/{initialNode}/{finalNode}") 
	public List<Track> getTracks(@PathVariable Long initialNode, @PathVariable Long finalNode) throws InvalidPathException {
		
		logger.log(Level.INFO, "Received request: /tracks/");
		
		// Obtenemos todos los nodos
		List<Node> nodePath = getNodePath(initialNode, finalNode);
		
		Node prev = null;
		Node curr = null;
		List<Track> tracks = new LinkedList<>();
		for(int i=0; i<nodePath.size(); i++) {
			if(curr != null) {
				prev = curr;
			}
			curr = nodePath.get(i);
			
			if(prev != null) {
				tracks.addAll(trackRepository.findBetweenNodes(prev.getMnemonic(), curr.getMnemonic()));
			}

			tracks.addAll(trackRepository.findBetweenNodes(curr.getMnemonic(), curr.getMnemonic()));
			
			
		}
		
		logger.log(Level.INFO, "Response for: /tracks => " + tracks);

		return tracks;
	}
	

	@CrossOrigin
	@PostMapping("/issues")
	private void saveIssue(@RequestBody Issue issue) {
		logger.log(Level.INFO, "Received request: POST /issues with params:"+issue);
		
		issuesRepository.save(issue);
		
		logger.log(Level.INFO, "Request: POST /issues processed");
		
	}
	
	@CrossOrigin
	@RequestMapping("/issues")
	public List<Issue> getIssues() {
		logger.log(Level.INFO, "Received request: /issues");
		
		List<Issue> issues = (List<Issue>) issuesRepository.findAll();
		
		logger.log(Level.INFO, "Response for: /nodes =>"+issues);
		return issues;
	}

	/**
	 * Devuelve un camino de nodos consecutivos desde el initialNode hasta el finalNode 
	 * en orden ascendente
	 *  
	 * @param initialNode
	 * @param finalNode
	 * @return
	 * @throws InvalidPathException
	 */
	private List<Node> getNodePath(Long initialNode, Long finalNode) throws InvalidPathException {
		List<Node> nodes = (List<Node>) nodeRepository.findAll(new Sort("sectionKp"));
		List<Node> nodePath = new LinkedList<Node>();
		
		boolean pathCompleted = false;
		for (Node n : nodes) {
			if (n.getId() == initialNode) {
				nodePath.add(n);
				if(initialNode == finalNode) {
					pathCompleted = true;
					break;
				}
				continue;
			}
			
			if(!nodePath.isEmpty()) {
				nodePath.add(n);
				if(n.getId() == finalNode) {
					pathCompleted = true;
					break;
				}
			}
		}
		
		if(!pathCompleted) {
			throw new InvalidPathException("Path not found between "+initialNode+" and "+finalNode);
		}

		return pathCompleted ? nodePath : null;
	}
	
	
	@CrossOrigin
	@RequestMapping("/wot") 
	public List<WorkOnTrack> getWorkOnTracks(){
		logger.log(Level.INFO, "Received request: /wot");
		return workOnTrackRepository.findAll();
	}
	
	@CrossOrigin
	@PostMapping("/wot") 
	public void saveWorkOnTracks(@RequestBody WorkOnTrack wot){
		logger.log(Level.INFO, "Received post: /wot " + wot);
		workOnTrackRepository.save(wot);
	}
}
