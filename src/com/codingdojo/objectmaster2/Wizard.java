package com.codingdojo.objectmaster2;

public class Wizard extends Human{
	public Wizard() {
		 health = 50;
		 intelligence = 8;
	}
	
	public void heal(Human human) {
		 human.health += this.intelligence;
	}
	
	public void fireBall(Human attackedHuman) {
		attackedHuman.health -= this.intelligence * 3;
	}
}
