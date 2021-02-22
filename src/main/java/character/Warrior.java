package character;
import java.util.HashSet;
import exception.WeaponException;

public class Warrior extends Character {
    
	protected static final String RPGClass = "Warrior";

	public Warrior(String name) {
		super (name, RPGClass);
		proudMessage();
		this.life = 100;
		this.agility = 8;
		this.strength = 10;
		this.wit = 3;
		this.compatibleWeapons = new HashSet<String>();
		this.compatibleWeapons.add("sword");
		this.compatibleWeapons.add("hammer");
	}


	/**
	 * Message prints when creating a character
	 *
	 */
	public void proudMessage() {
		super.proudMessage();
		System.out.println("My name will go down in history !");
	}

	/**
	 *
	 * @return a message prints when the character is attacking
	 */
	public String attackMessage(String weapon) {
		return "I ' ll crush you with my " + weapon + " !";
	}

	/**
	 *
	 * @return a message prints when the character try to attack with a no compatible weapon
	 */
	public String exceptionNoCompatibleWeaponMessage(String weapon) {
		return " : A " + weapon + "?? What should I do with this ?!";
	}
        
	

	/**
	 * Describes the way the character moves 
	 *
	 */
	public String mannerMove() {
		return " like a bad boy.";
	}

}

