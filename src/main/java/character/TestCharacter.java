package character;
import java.util.HashSet;

public class TestCharacter extends Character {

	public TestCharacter(String name) {
		super (name, "character");
		this.compatibleWeapons = new HashSet<String>();
		
	}

	public String attackMessage(String weapon) { return "";}

	public String mannerMove() { return "";}

	public String exceptionNoCompatibleWeaponMessage(String weapon) {return "";}

}
