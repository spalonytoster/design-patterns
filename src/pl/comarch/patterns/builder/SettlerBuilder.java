package pl.comarch.patterns.builder;

public class SettlerBuilder implements IMobBuilder {

	private Mob mob;
	public SettlerBuilder() {
		mob = new Mob();
	}
	
	@Override
	public void setName() {
		mob.setName("Settler");
	}

	@Override
	public void setDefencePoints() {
		mob.setDefencePoints(100);
	}

	@Override
	public void setHealtPoints() {
		mob.setHealtPoints(30);
	}

	@Override
	public void setAttackPoints() {
		mob.setAttackPoints(2);
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
