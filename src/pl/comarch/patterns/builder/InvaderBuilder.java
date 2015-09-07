package pl.comarch.patterns.builder;

public class InvaderBuilder implements IMobBuilder {

	private Mob mob;
	public InvaderBuilder() {
		mob = new Mob();
	}
	
	@Override
	public void setName() {
		mob.setName("Invader");
	}

	@Override
	public void setDefencePoints() {
		mob.setDefencePoints(2);
	}

	@Override
	public void setHealtPoints() {
		mob.setHealtPoints(30);
	}

	@Override
	public void setAttackPoints() {
		mob.setAttackPoints(12);
	}


	@Override
	public Mob getMob() {
		return mob;
	}

	@Override
	public void setDef() {
		mob.setDef(false);
	}
	

}
