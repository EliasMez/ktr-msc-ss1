package main;
import character.*;
import exception.WeaponException;

public class Example {

	public static void main( String[] args ) {
		TestCharacter perso = new TestCharacter( " Jean - Luc " ) ;
		System.out.println( perso.getName() ) ;
		System.out.println( perso.getLife() ) ;
		System.out.println( perso.getAgility() );
		System.out.println( perso.getStrength() );
		System.out.println( perso.getWit() );
		System.out.println( perso.getRPGClass() );
		perso.tryToAttack( " my weapon " ) ;
		
		Warrior warrior = new Warrior( " Jean - Luc " );
		Mage mage = new Mage( " Robert " );
		warrior.tryToAttack( " hammer " );
		mage.tryToAttack( "  Magic " );
		warrior.moveRight () ;

		warrior.moveLeft();
		warrior.moveBack();
		warrior.moveForward();
		mage.moveRight();
		mage.moveLeft();
		mage.moveBack();
		mage.moveForward();

		warrior.tryToAttack( " screwdriver " );
		mage.tryToAttack( " hammer " );
		warrior.tryToAttack( " hammer " );
		warrior.tryToAttack( "" );
	}
}
