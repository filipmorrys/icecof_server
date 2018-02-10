package com.indra.davinci.icecofsim.icecof.issues.data;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="USRTRICECOFSIMHSROCC", name="ISSUE")
@SequenceGenerator(
	name="ISSUES",
	sequenceName="SEQ_ISSUES",
	schema="USRTRICECOFSIMHSROCC"
)
public class Issue {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "ISSUES")
	private Integer id;
	
	private String code;
	
	private String description;
	
	private String type;
	
	private String subtype;
	
	private String state;
	
	private String initialNode;
	
	private String finalNode;
	
	private Long initialHour;
	
	private Long finalHour;
	
	private Long expectedFinalHour;

	@ElementCollection
	@CollectionTable(
		name="ISSUE_TRACKS",
		schema="USRTRICECOFSIMHSROCC",
		joinColumns=@JoinColumn(name="ISSUE_ID")
	)
	@Column(name="TRACK_MNEMO", table="ISSUE_TRACKS")
	private List<String> tracks;
	
	public Issue() {
		this.tracks = new LinkedList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInitialNode() {
		return initialNode;
	}

	public void setInitialNode(String initialNode) {
		this.initialNode = initialNode;
	}

	public String getFinalNode() {
		return finalNode;
	}

	public void setFinalNode(String finalNode) {
		this.finalNode = finalNode;
	}

	public Long getInitialHour() {
		return initialHour;
	}

	public void setInitialHour(Long initialHour) {
		this.initialHour = initialHour;
	}

	public Long getFinalHour() {
		return finalHour;
	}

	public void setFinalHour(Long finalHour) {
		this.finalHour = finalHour;
	}

	public Long getExpectedFinalHour() {
		return expectedFinalHour;
	}

	public void setExpectedFinalHour(Long expectedFinalHour) {
		this.expectedFinalHour = expectedFinalHour;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	
	public void addTrack(String track) {
		this.tracks.add(track);
	}
}
