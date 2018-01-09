package com.indra.davinci.icecofsim.issues.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ISSUE_TRACKS", schema="USRTRICECOFSIMHSROCC")
@SequenceGenerator(name="SEQ_ISSUE_TRACKS", sequenceName="SEQ_ISSUE_TRACKS", initialValue=1, allocationSize=100)
public class IssueTrack {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String trackMnemo;
	
	public IssueTrack() {
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTrackMnemo() {
		return trackMnemo;
	}

	public void setTrackMnemo(String trackMnemo) {
		this.trackMnemo = trackMnemo;
	}

}
