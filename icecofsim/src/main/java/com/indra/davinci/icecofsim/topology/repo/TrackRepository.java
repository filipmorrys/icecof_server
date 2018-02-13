package com.indra.davinci.icecofsim.topology.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.indra.davinci.icecofsim.topology.domain.Track;

public interface TrackRepository extends CrudRepository<Track, Long> {

	@Query("select t from Track t where t.initialNode = ?1 and t.finalNode = ?2")
	public List<Track> findBetweenNodes(String initialNode, String finalNode);
}
