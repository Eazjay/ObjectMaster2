package com.codingdojo.objectmaster2;

public class HumanTest {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Ninja n = new Ninja();
		Samurai s = new Samurai();
		
		w.heal(s);
		w.fireBall(n);
		w.displayHealth();
		
		
		n.steal(w);
		n.runaway();
		n.displayHealth();
		
		
		s.deathBlow(n);
		s.meditate();
		s.howMany();
		s.displayHealth();
	}
}
