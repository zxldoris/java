package com.hxlxz.zxl;

import java.util.HashSet;
import java.util.Set;

public class Player {
	public String ID;
	public String name;
	public Set<Player> PlayerCard;
	public Player(String ID,String name){
		this.ID = ID;
		this.name = name;
		this.PlayerCard = new HashSet<Player>();
	}
}
