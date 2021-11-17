package com.Spring.AtAutowiring_anoot.Spring_atAtowire_prj;

public class Heart {
	
	private String nameOfAnimal;
	private int noOfHeart;
	
	
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}



	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}



	public int getNoOfHeart() {
		return noOfHeart;
	}



	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}



	public void pump()
	{
		System.out.println("Your Heart is pumping");
		System.out.println("Alive");
		
		System.out.println("Name of Animal "+nameOfAnimal+"no of Heart "+noOfHeart);
	}

}
