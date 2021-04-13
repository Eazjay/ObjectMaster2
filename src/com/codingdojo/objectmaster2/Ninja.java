package com.codingdojo.objectmaster2;

public class Ninja extends Human{
	public Ninja() {
		 stealth = 10;
	}
	
	public void steal(Human human) {
		human.health -= this.stealth += this.health;
		System.out.println("Ninja steals health: " + health);
	}
	public void runaway() {
		System.out.println("Ninja runsaway.");
		health -= 10;
	}
}
