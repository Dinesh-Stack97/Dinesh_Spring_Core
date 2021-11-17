package com.Spring.AtAutowiring_anoot.Spring_atAtowire_prj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	//@Autowired
	//-->spring first tries to resolve using by type and then by name
	private Heart heart;
	
	
    //@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
    @Autowired
    @Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping()
	{
		heart.pump();
	}

}
