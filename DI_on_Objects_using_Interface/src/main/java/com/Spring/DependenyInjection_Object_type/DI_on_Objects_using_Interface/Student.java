package com.Spring.DependenyInjection_Object_type.DI_on_Objects_using_Interface;

public class Student {



	private Cheat cheat;

     public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
     public void cheating()
	{
         cheat.cheat();
	}

}
