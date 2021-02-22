package character;
import exception.WeaponException;
import java.util.HashSet;

public class Mage extends Character {

	protected static final String RPGClass = "Mage";
    
	public Mage(String name) {
		super (name, RPGClass);
		proudMessage();
		this.life = 70;
		this.agility = 10;
		this.strength = 3;
		this.wit = 10;
		this.compatibleWeapons = new HashSet<String>();
		this.compatibleWeapons.add("magic");
		this.compatibleWeapons.add("wand");
	}

	/**
	 * Message prints when creating a character
	 *
	 */
	public void proudMessage() {
		super.proudMessage();
		System.out.println("May the gods be with me.");
	}

	/**
	 *
	 * @return a message prints when the character is attacking
	 */
	public String attackMessage(String weapon) {
		return "Feel the power of my " + weapon + " !";
	}

	/**
	 *
	 * @return a message prints when the character try to attack with a no compatible weapon
	 */
	public String exceptionNoCompatibleWeaponMessage(String weapon) {
		return " : I don ' t need this stupid " + weapon + "! Don't misjudge my powers !";
	}



	/**
	 * Describes the way the character moves 
	 *
	 */
	public String mannerMove() {
		return " furtively.";
	}

}
		
