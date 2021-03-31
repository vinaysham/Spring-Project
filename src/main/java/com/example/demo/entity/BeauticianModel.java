package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BeauticianModel {
	@Id
	@GeneratedValue
	private String id;
	private String name;
	private String experience;
	private String lawfirmName;
	
	
	
	public BeauticianModel(String id, String name, String experience, String lawfirmName) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
		this.lawfirmName = lawfirmName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getLawfirmName() {
		return lawfirmName;
	}
	public void setLawfirmName(String lawfirmName) {
		this.lawfirmName = lawfirmName;
	}
	@Override
	public String toString() {
		return "BeauticianModel [id=" + id + ", name=" + name + ", experience=" + experience + ", lawfirmName="
				+ lawfirmName + "]";
	}
	
	
}
