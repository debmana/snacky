package com.deborasroka.snacky;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "snacks")
public class Snack {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_tbl")
	private Integer id;

	@Column(name="name_tbl")
	private String name;
	@Column(name="sweet_tbl")
	private int sweet;
	@Column(name="salty_tbl")
	private int salty;
	@Column(name="sour_tbl")
	private int sour;
	@Column(name="bitter_tbl")
	private int bitter;
	@Column(name="spicy_tbl")
	private int spicy;
	
	
	@Override
	public String toString() {
		return "Snack [id=" + id + ", name=" + name + ", sweet=" + sweet + ", salty=" + salty + ", sour=" + sour
				+ ", bitter=" + bitter + ", spicy=" + spicy + "]";
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSweet() {
		return sweet;
	}
	
	public void setSweet(int sweet) {
		this.sweet = sweet;
	}
	
	public int getSalty() {
		return salty;
	}
	
	public void setSalty(int salty) {
		this.salty = salty;
	}
	
	public int getSour() {
		return sour;
	}
	
	public void setSour(int sour) {
		this.sour = sour;
	}
	
	public int getBitter() {
		return bitter;
	}
	
	public void setBitter(int bitter) {
		this.bitter = bitter;
	}
	
	public int getSpicy() {
		return spicy;
	}
	
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}

	
	
	
}
