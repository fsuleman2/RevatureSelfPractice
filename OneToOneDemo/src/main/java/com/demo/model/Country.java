package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Country {
	@Id
	private int country_Id;
	private String country_name;
	@OneToOne(mappedBy = "country")
	private Player player;//player_player_id
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	public Country(int country_Id, String country_name) {
		super();
		this.country_Id = country_Id;
		this.country_name = country_name;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public int getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(int country_Id) {
		this.country_Id = country_Id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	@Override
	public String toString() {
		return "Country [country_Id=" + country_Id + ", country_name=" + country_name + "]";
	}
	
}
