package charactere;

import moviments.*;
import strokes.*;
import weapons.*;

public abstract class Character{
	
	Moviment moviment;
	Stroke stroke;
	Weapon weapon;
	
	public abstract void type();
	
	public void move(Moviment moviment){
		moviment.mov();
	}
	public void stroke(Stroke stroke){
		stroke.str();
	}
	public void weapon(Weapon weapon){
		weapon.wea();
	}
	
}
