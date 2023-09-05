package com.demo.lamda.ex;

public class GreeterApp {

	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		
		greeter.greetUser(new GoodMorning());
		
		greeter.greetUser(()->"Good Evening");

	}

}

class GoodMorning implements Greet{

	@Override
	public String greetMessage() {
		// TODO Auto-generated method stub
		return "Good Morning";
	}
	
}
