package com.indra.davinci.icecofsim.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;;

/**
 * Clase que representa un nodo de la topología
 * @author fdrodriguez
 *
 */
@Entity
@Table(name="TOPO_NT_E_NODE")
@SecondaryTable(
		name="TOPO_NT_E_NETCONN", 
		pkJoinColumns=@PrimaryKeyJoinColumn(name="NODE_ID")
)
public class Node {
	
	@Id
	private Long id;
	
	private String mnemonic;
	
	private String name;
	
	private String shortName;
	
	@Column(table="TOPO_NT_E_NETCONN")
	private Long sectionKp; 

	public Node() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Long getSectionKp() {
		return sectionKp;
	}

	public void setSectionKp(Long sectionKp) {
		this.sectionKp = sectionKp;
	}


	@Override
	public String toString() {
		return "Node [id=" + id + ", mnemonic=" + mnemonic + ", name=" + name + ", shortName=" + shortName
				+ ", sectionKp=" + sectionKp + "]";
	}
}
