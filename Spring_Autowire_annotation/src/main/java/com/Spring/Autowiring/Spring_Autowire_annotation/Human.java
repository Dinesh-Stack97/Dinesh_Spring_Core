package com.Spring.Autowiring.Spring_Autowire_annotation;

public class Human {
	private Heart heart;
	
	

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping()
	{
		heart.pump();
	}

}
