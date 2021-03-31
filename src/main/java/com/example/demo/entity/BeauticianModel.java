package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BeauticianDetails")
public class BeauticianModel{
 
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="Beautician_id")
 private int id;
 
 @Column(name="Beautician_experience")
 private String Expereince;
 
 @Column(name="Organisation")
 private String Organisation;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getExpereince() {
	return Expereince;
}

public void setExpereince(String expereince) {
	Expereince = expereince;
}

public String getOrganisation() {
	return Organisation;
}

public void setOrganisation(String organisation) {
	Organisation = organisation;
}

@Override
public String toString() {
	return "Role [id=" + id + ", Expereince=" + Expereince + ", Organisation=" + Organisation + "]";
}


}
