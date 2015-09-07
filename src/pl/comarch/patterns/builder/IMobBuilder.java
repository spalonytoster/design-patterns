package pl.comarch.patterns.builder;

public interface IMobBuilder {

	public void setName();
	public void setDefencePoints();
	public void setHealtPoints();
	public void setAttackPoints();
	public void setDef();
	public Mob getMob();
}
