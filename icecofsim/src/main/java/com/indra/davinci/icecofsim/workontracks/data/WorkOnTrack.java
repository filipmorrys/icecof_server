package com.indra.davinci.icecofsim.workontracks.data;

import java.util.List;

public class WorkOnTrack {

	private int id;
	private String description;
	private String contractor;
	private String workOnTrackClass;
	private String personContact;
	private String phone;
	private String responsable;
	private String occupationZone;
	private int issueId;
	private List<WorkInterval> workIntervals;

	public WorkOnTrack() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the contractor
	 */
	public String getContractor() {
		return contractor;
	}

	/**
	 * @param contractor
	 *            the contractor to set
	 */
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	/**
	 * @return the workOnTrackClass
	 */
	public String getWorkOnTrackClass() {
		return workOnTrackClass;
	}

	/**
	 * @param workOnTrackClass
	 *            the workOnTrackClass to set
	 */
	public void setWorkOnTrackClass(String workOnTrackClass) {
		this.workOnTrackClass = workOnTrackClass;
	}

	/**
	 * @return the personContact
	 */
	public String getPersonContact() {
		return personContact;
	}

	/**
	 * @param personContact
	 *            the personContact to set
	 */
	public void setPersonContact(String personContact) {
		this.personContact = personContact;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the responsable
	 */
	public String getResponsable() {
		return responsable;
	}

	/**
	 * @param responsable
	 *            the responsable to set
	 */
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	/**
	 * @return the occupationZone
	 */
	public String getOccupationZone() {
		return occupationZone;
	}

	/**
	 * @param occupationZone
	 *            the occupationZone to set
	 */
	public void setOccupationZone(String occupationZone) {
		this.occupationZone = occupationZone;
	}

	/**
	 * @return the issueId
	 */
	public int getIssueId() {
		return issueId;
	}

	/**
	 * @param issueId
	 *            the issueId to set
	 */
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	/**
	 * @return the workIntervals
	 */
	public List<WorkInterval> getWorkIntervals() {
		return workIntervals;
	}

	/**
	 * @param workIntervals
	 *            the workIntervals to set
	 */
	public void setWorkIntervals(List<WorkInterval> workIntervals) {
		this.workIntervals = workIntervals;
	}

}
