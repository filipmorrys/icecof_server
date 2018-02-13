package com.indra.davinci.icecofsim.icecof.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "USRTRICECOFSIMHSROCC", name = "WOT_TRACKS_ID")
public class TracksById {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="WOTTRACKSIDSEQ")
	@SequenceGenerator(name = "WOTTRACKSIDSEQ", schema = "USRTRICECOFSIMHSROCC", sequenceName="SEQ_WOT_TRACKS_ID" )
	private Integer id;

	private String trackId;

	private String cutType;

	/**
	 * @return the trackId
	 */
	public String getTrackId() {
		return trackId;
	}

	/**
	 * @param trackId
	 *            the trackId to set
	 */
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	/**
	 * @return the cutType
	 */
	public String getCutType() {
		return cutType;
	}

	/**
	 * @param cutType
	 *            the cutType to set
	 */
	public void setCutType(String cutType) {
		this.cutType = cutType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TracksById [id=" + id + ", trackId=" + trackId + ", cutType=" + cutType + "]";
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

}
