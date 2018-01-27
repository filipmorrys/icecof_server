package com.indra.davinci.icecofsim.workontracks.data;

import java.util.List;

public class WorkInterval {
	private String intervalId;
	private Long startTime;
	private Long endTimeDate;
	private String traject;
	private int startPk;
	private int endPk;
	private String startNode;
	private String endNode;
	private String startNodeInclude;
	private String endNodeInclude;
	private String circAffected;
	private List<TracksById> tracksByIds;
	private List<TracksByType> tracksByTypes;

	public WorkInterval() {
		super();
	}

	/**
	 * @return the intervalId
	 */
	public String getIntervalId() {
		return intervalId;
	}

	/**
	 * @param intervalId
	 *            the intervalId to set
	 */
	public void setIntervalId(String intervalId) {
		this.intervalId = intervalId;
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
	public Long getEndTimeDate() {
		return endTimeDate;
	}

	/**
	 * @param endTimeDate
	 *            the endTimeDate to set
	 */
	public void setEndTimeDate(Long endTimeDate) {
		this.endTimeDate = endTimeDate;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WorkInterval [intervalId=" + intervalId + ", startTime=" + startTime + ", endTimeDate=" + endTimeDate
				+ ", traject=" + traject + ", startPk=" + startPk + ", endPk=" + endPk + ", startNode=" + startNode
				+ ", endNode=" + endNode + ", startNodeInclude=" + startNodeInclude + ", endNodeInclude="
				+ endNodeInclude + ", circAffected=" + circAffected + ", tracksByIds=" + tracksByIds
				+ ", tracksByTypes=" + tracksByTypes + "]";
	}
}
