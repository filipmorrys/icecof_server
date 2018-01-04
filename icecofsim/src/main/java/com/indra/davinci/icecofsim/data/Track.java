package com.indra.davinci.icecofsim.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Representa una via de la topología
 * @author fdrodriguez
 *
 */
@Entity
@Table(name="TOPO_NT_E_NODETRACK")
public class Track {
	
	public static final int TRACK_TYPE_STATION = 0;
	public static final int TRACK_TYPE_CIRCULATION = 1;
	
	@Id
	private Long id;
	
	private String mnemonic;
	
	@Column(name="TECHNICAL_NUMBER")
	private String name;
	
	@Column(name="NODETRACKTYPE")
	private String trackType;
	
	@Column(name="START_MNEMO_NODE")
	private String initialNode;
	
	@Column(name="END_MNEMO_NODE")
	private String finalNode;

	public Track() {
		super();
	}

	public String getMnemonic() {
		return mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrackType() {
		return trackType;
	}

	public void setTrackType(String trackType) {
		this.trackType = trackType;
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

	@Override
	public String toString() {
		return "Track [id=" + id + ", mnemonic=" + mnemonic + ", name=" + name + ", trackType=" + trackType
				+ ", initialNode=" + initialNode + ", finalNode=" + finalNode + "]";
	}

}
