package application;

import charactere.*;
import charactere.Character;
import moviments.*;
import strokes.*;
import weapons.*;

public class App {

	public static void main(String[] args) {
		
		Character assassin = new Assassin();
		assassin.type();
		assassin.move(new BringDown());
		assassin.weapon(new Knife());
		assassin.stroke(new Jab());
		System.out.println("Changing tatics");
		assassin.move(new Jump());
		assassin.weapon(new Bazuca());
		assassin.stroke(new Kick());
		System.out.println("------------>");
		
		Character fighter = new Fighter();
		fighter.type();
		fighter.move(new Run());
		fighter.weapon(new Pistol());
		fighter.stroke(new LongFist());
		System.out.println("Changing tatics");
		fighter.move(new TurnLeft());
		fighter.weapon(new Staff());
		fighter.stroke(new SupermanPunch());
		System.out.println("------------>");
		
		Character tpmWoman = new TPMWoman();
		tpmWoman.type();
		tpmWoman.move(new Run());
		tpmWoman.weapon(new Chinela());
		tpmWoman.stroke(new Uppercut());
		System.out.println("Changing tatics");
		tpmWoman.move(new TurnRight());
		tpmWoman.weapon(new Pistol());
		tpmWoman.stroke(new LongFist());
		System.out.println("------------>");
		
		tpmWoman.type();
		tpmWoman = new Gunner();
		tpmWoman.type();
		
		System.out.println("------------>");
		
		assassin.type();
		assassin = new Mage();
		assassin.type();
		
	}

}
