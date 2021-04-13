package com.codingdojo.objectmaster2;

public class Samurai extends Human{
	private static int counter;
	
	public Samurai() {
		 health = 200;
		 counter++;
	}
	
	public void deathBlow(Human human) {
		System.out.println("Samurai dishes out a death blow and kills human.");
		this.health /= 2;
	}
	public void meditate() {
		System.out.println("Samurai meditates... huuummmmm...");
		this.health *= 2;
	}
	public void howMany() {
		System.out.println("There are " + counter + " amount of Samurai.");
	}
}
