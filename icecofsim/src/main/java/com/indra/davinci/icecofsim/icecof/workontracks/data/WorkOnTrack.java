package com.indra.davinci.icecofsim.icecof.workontracks.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "USRTRICECOFSIMHSROCC", name = "WOT")
@SequenceGenerator(name = "WOTSEQ", sequenceName = "SEQ_WOT", schema = "USRTRICECOFSIMHSROCC")
public class WorkOnTrack {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WOTSEQ")
	private Integer id;
	
	private String description;
	
	private String contractor;
	
	@Column(name = "CLASS")
	private String workOnTrackClass;
	
	private String personContact;
	
	private String phone;
	
	private String responsable;

	private String occupationZone;

	private int issueId;
	
	@OneToMany(targetEntity=WorkInterval.class, cascade=CascadeType.ALL)
	private List<WorkInterval> workIntervals;


	public WorkOnTrack() {
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
