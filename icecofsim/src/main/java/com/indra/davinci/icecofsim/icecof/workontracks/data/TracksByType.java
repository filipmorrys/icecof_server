package com.indra.davinci.icecofsim.icecof.workontracks.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "USRTRICECOFSIMHSROCC", name = "WOT_TRACKS_TYPE")
@SequenceGenerator(name = "WOTTRACKSTYPESEQ", sequenceName = "SEQ_WOT_TRACKS_TYPE", schema = "USRTRICECOFSIMHSROCC")
public class TracksByType {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WOTTRACKSTYPESEQ")
	private Integer id;

	private String type;

	private String cutType;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
		return "TracksByType [id=" + id + ", type=" + type + ", cutType=" + cutType + "]";
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
