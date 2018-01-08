package com.indra.davinci.icecofsim.issues.data;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(schema="usrtricecofsimhsrocc", name="ISSUE")
public class Issue {

	@Id
	@GeneratedValue
	private String id;
	
	private String code;
	
	private String description;
	
	private String type;
	
	private String subtype;
	
	private String state;
	
	private String initialNode;
	
	private String finalNode;
	
	private Date initialHour;
	
	private Date finalHour;
	
	private Date expectedFinalHour;

	@ElementCollection
	@CollectionTable(name = "ISSUE_TRACKS", joinColumns = @JoinColumn(name = "ISSUE_ID"))
	@Column(name = "TRACK_MNEMO")
	private Set<String> tracks;
	
	public Issue() {
		this.tracks = new HashSet<String>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Date getInitialHour() {
		return initialHour;
	}

	public void setInitialHour(Date initialHour) {
		this.initialHour = initialHour;
	}

	public Date getFinalHour() {
		return finalHour;
	}

	public void setFinalHour(Date finalHour) {
		this.finalHour = finalHour;
	}

	public Date getExpectedFinalHour() {
		return expectedFinalHour;
	}

	public void setExpectedFinalHour(Date expectedFinalHour) {
		this.expectedFinalHour = expectedFinalHour;
	}

	public Set<String> getTracks() {
		return tracks;
	}

	public void setTracks(Set<String> tracks) {
		this.tracks = tracks;
	}

	
	
}
