package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Player {
	@Id
	private int player_Id;
	private String player_name;
	@OneToOne
	private Country country;
		
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(int player_Id, String player_name) {
		super();
		this.player_Id = player_Id;
		this.player_name = player_name;
	}
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getPlayer_Id() {
		return player_Id;
	}
	public void setPlayer_Id(int player_Id) {
		this.player_Id = player_Id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	@Override
	public String toString() {
		return "Player [player_Id=" + player_Id + ", player_name=" + player_name + "]";
	}
	

}
