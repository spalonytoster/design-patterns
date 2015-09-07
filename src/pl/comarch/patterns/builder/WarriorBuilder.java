package pl.comarch.patterns.builder;

public class WarriorBuilder implements IMobBuilder {

	private Mob mob;
	public WarriorBuilder() {
		mob = new Mob();
	}
	
	@Override
	public void setName() {
		mob.setName("Warrior");
	}

	@Override
	public void setDefencePoints() {
		mob.setDefencePoints(5);
	}

	@Override
	public void setHealtPoints() {
		mob.setHealtPoints(40);
	}

	@Override
	public void setAttackPoints() {
		mob.setAttackPoints(8);
	}
	
	@Override
	public void setDef() {
		mob.setDef(true);
	}

	@Override
	public Mob getMob() {
		return mob;
	}
	

}
