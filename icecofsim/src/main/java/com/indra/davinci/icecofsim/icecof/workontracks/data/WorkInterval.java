package com.indra.davinci.icecofsim.icecof.workontracks.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "USRTRICECOFSIMHSROCC", name = "WOT_INTERVAL")
@SequenceGenerator(name = "WOTINTERVALSEQ", sequenceName = "SEQ_WOT_INTERVAL", schema = "USRTRICECOFSIMHSROCC")
public class WorkInterval {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WOTINTERVALSEQ")
	private Integer id;

	private Long startTime;
	
	private Long endTime;
	
	private String traject;
	
	private int startPk;
	
	private int endPk;
	
	private String startNode;
	
	private String endNode;
	
	private String startNodeInclude;
	
	private String endNodeInclude;
	
	private String circAffected;
	
	@OneToMany(targetEntity=TracksById.class, cascade=CascadeType.ALL)
	private List<TracksById> tracksByIds;
	
	@OneToMany(targetEntity=TracksByType.class, cascade=CascadeType.ALL)
	private List<TracksByType> tracksByTypes;
	

	public WorkInterval() {
		super();
	}

	/**
	 * @return the startTime
	 */
	public Long getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTimeDate
	 */
	public Long getEndTime() {
		return endTime;
	}

	/**
	 * @param endTimeDate
	 *            the endTimeDate to set
	 */
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the traject
	 */
	public String getTraject() {
		return traject;
	}

	/**
	 * @param traject
	 *            the traject to set
	 */
	public void setTraject(String traject) {
		this.traject = traject;
	}

	/**
	 * @return the startPk
	 */
	public int getStartPk() {
		return startPk;
	}

	/**
	 * @param startPk
	 *            the startPk to set
	 */
	public void setStartPk(int startPk) {
		this.startPk = startPk;
	}

	/**
	 * @return the endPk
	 */
	public int getEndPk() {
		return endPk;
	}

	/**
	 * @param endPk
	 *            the endPk to set
	 */
	public void setEndPk(int endPk) {
		this.endPk = endPk;
	}

	/**
	 * @return the startNode
	 */
	public String getStartNode() {
		return startNode;
	}

	/**
	 * @param startNode
	 *            the startNode to set
	 */
	public void setStartNode(String startNode) {
		this.startNode = startNode;
	}

	/**
	 * @return the endNode
	 */
	public String getEndNode() {
		return endNode;
	}

	/**
	 * @param endNode
	 *            the endNode to set
	 */
	public void setEndNode(String endNode) {
		this.endNode = endNode;
	}

	/**
	 * @return the startNodeInclude
	 */
	public String getStartNodeInclude() {
		return startNodeInclude;
	}

	/**
	 * @param startNodeInclude
	 *            the startNodeInclude to set
	 */
	public void setStartNodeInclude(String startNodeInclude) {
		this.startNodeInclude = startNodeInclude;
	}

	/**
	 * @return the endNodeInclude
	 */
	public String getEndNodeInclude() {
		return endNodeInclude;
	}

	/**
	 * @param endNodeInclude
	 *            the endNodeInclude to set
	 */
	public void setEndNodeInclude(String endNodeInclude) {
		this.endNodeInclude = endNodeInclude;
	}

	/**
	 * @return the circAffected
	 */
	public String getCircAffected() {
		return circAffected;
	}

	/**
	 * @param circAffected
	 *            the circAffected to set
	 */
	public void setCircAffected(String circAffected) {
		this.circAffected = circAffected;
	}

	/**
	 * @return the aTracksById
	 */
	public List<TracksById> getTracksByIds() {
		return tracksByIds;
	}

	/**
	 * @param aTracksById
	 *            the aTracksById to set
	 */
	public void setaTracksById(List<TracksById> tracksByIds) {
		this.tracksByIds = tracksByIds;
	}

	/**
	 * @return the aTracksByType
	 */
	public List<TracksByType> getTracksByTypes() {
		return tracksByTypes;
	}

	/**
	 * @param aTracksByType
	 *            the aTracksByType to set
	 */
	public void setaTracksByType(List<TracksByType> tracksByTypes) {
		this.tracksByTypes = tracksByTypes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WorkInterval [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", traject=" + traject + ", startPk=" + startPk + ", endPk=" + endPk + ", startNode=" + startNode
				+ ", endNode=" + endNode + ", startNodeInclude=" + startNodeInclude + ", endNodeInclude="
				+ endNodeInclude + ", circAffected=" + circAffected + ", tracksByIds=" + tracksByIds
				+ ", tracksByTypes=" + tracksByTypes + "]";
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


	/**
	 * @param tracksByIds the tracksByIds to set
	 */
	public void setTracksByIds(List<TracksById> tracksByIds) {
		this.tracksByIds = tracksByIds;
	}


	/**
	 * @param tracksByTypes the tracksByTypes to set
	 */
	public void setTracksByTypes(List<TracksByType> tracksByTypes) {
		this.tracksByTypes = tracksByTypes;
	}
}
