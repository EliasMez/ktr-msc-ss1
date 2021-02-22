package character;
import main.Movable;
import exception.WeaponException;
import java.util.HashSet;
import java.util.Set;

public abstract class Character implements Movable {

        protected String name;
	protected String RPGClass;
        protected int life;
        protected int agility;
        protected int strength;
        protected int wit;
	protected Set<String> compatibleWeapons;

	public Character(String name, String RPGClass) {
		this.RPGClass = RPGClass;
		this.name = name;
		this.life = 50;
		this.agility = 2;
		this.strength = 2;
		this.wit = 2;;
	}
	
	/**
	 * @return the RPGClass attribute
	 */
	public String getRPGClass() {
		return this.RPGClass;
	}

	/**
	 * @return the name attribute
	 */
        public String getName() {
                return this.name;
        }

	/**
	 * @return the life attribute
	 */
        public int getLife() {
                return this.life;
        }

	/**
	 * @return the agility attribute
	 */
        public int getAgility() {
                return this.agility;
        }

	/**
	 * @return the strength attribute
	 */
        public int getStrength() {
                return this.strength;
        }

	/**
	 * @return the wit attribute
	 */
        public int getWit() {
                return this.wit;
        }

	/**
	 * return a set of weapons compatible with the class character
	 *
	 * @return the compatibleWeapons attribute
	 */
	public Set<String> getCompatibleWeapons() {
		return this.compatibleWeapons;
	}

	
	/**
	 * Describes the way the character moves 
	 *
	 */
	public abstract String mannerMove();
	

	/**
	 * Move of the character to the right 
	 *
	 */
	public final void moveRight() {
	System.out.println(this.getName() + " : moves right" + mannerMove());
	}

	/**
	 * Move of the character to the left 
	 *
	 */
	public final void moveLeft() {
	System.out.println(this.getName() + " : moves left" + mannerMove());
	}

	/**
	 * Move of the character forward 
	 *
	 */
	public final void moveForward() {
	System.out.println(this.getName() + " : moves forward" + mannerMove());
	}

	/**
	 * Move of the character back 
	 *
	 */
	public final void moveBack() {
	System.out.println(this.getName() + " : moves back" + mannerMove());
	}

	/**
	 * the character unsheathes his weapon
	 *
	 */
	public final void unsheathe() {
		System.out.println(this.getName() + " : unsheathes his weapon.");
	}


	/**
	 * Message prints when creating a character
	 *
	 */
	public void proudMessage() {
		System.out.print(this.name + " : ");
	}

	/**
	 *
	 * @return a message prints when the character is attacking
	 */
	public abstract String attackMessage(String weapon);

	/**
	 *
	 * @return a message prints when the character try to attack with a no compatible weapon
	 */
	public abstract String exceptionNoCompatibleWeaponMessage(String weapon);

	/**
	 * attack of the character
	 *
	 * @param weapon the weapon with which the character attacks
	 * @throws weaponException if the param is empty string or if the weapon is not compatible with the character 
	 *
	 */
	public void attack(String weapon) throws WeaponException {
                System.out.println( this.name + " : Rrrrrrrrr ....");
		if (weapon.isEmpty())
			throw new WeaponException(this.getName() + "I refuse to fight with my bare hands.");
		else weapon = weapon.replaceAll("\\s", "").toLowerCase();
		if (this.getCompatibleWeapons().contains(weapon))
			System.out.println(attackMessage(weapon));
		else throw new WeaponException( this.getName() + exceptionNoCompatibleWeaponMessage(weapon));
        }

	/**
	 * Try to attack and catch the exception if there is one
	 *
	 */
	public void tryToAttack(String weapon) {
		try {
			this.attack(weapon);
		} catch ( WeaponException e ) {
			System.out.println( e.getMessage() );
		}
	}

	/**
	 * Describes the character
	 *
	 * @return a string that describes the character
	 *
	 */
	public String toString() {
		return this.getRPGClass() + this.getName();
	}

	/**
	 * tests if the instance if equals to an other object
	 *
	 * @param o the other object to compare with the instance
	 * @return true if the instance is equals to the param, false otherwise
	 */
	public boolean equals(Object o) {
		if (o instanceof Character) {
			Character other = (Character) o;
			return (this.getRPGClass() == other.getRPGClass()) && (this.getName() == other.getName());
		} else return false;
	}

}

 

