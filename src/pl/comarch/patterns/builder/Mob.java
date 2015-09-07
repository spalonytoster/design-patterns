package pl.comarch.patterns.builder;

public class Mob {
	private String name;
	private int defencePoints;
	private int healtPoints;
	private int attackPoints;
	private boolean def;
	public Mob(){
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDefencePoints() {
		return defencePoints;
	}

	public void setDefencePoints(int defencePoints) {
		this.defencePoints = defencePoints;
	}

	public int getHealtPoints() {
		return healtPoints;
	}

	public void setHealtPoints(int healtPoints) {
		this.healtPoints = healtPoints;
	}

	public int getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public boolean isDef() {
		return def;
	}

	public void setDef(boolean def) {
		this.def = def;
	}
	
	
}
