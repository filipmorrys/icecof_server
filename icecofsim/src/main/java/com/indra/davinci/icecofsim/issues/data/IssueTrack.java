package com.indra.davinci.icecofsim.issues.data;

import javax.persistence.Embeddable;

@Embeddable
public class IssueTrack {

	private String trackMnemo;
	
	public IssueTrack() {
	}

	public String getTrackMnemo() {
		return trackMnemo;
	}

	public void setTrackMnemo(String trackMnemo) {
		this.trackMnemo = trackMnemo;
	}

}
