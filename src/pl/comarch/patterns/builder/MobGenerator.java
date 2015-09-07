package pl.comarch.patterns.builder;

public class MobGenerator {
	IMobBuilder builder;
	
	public void prepareMob(IMobBuilder builder){
		this.builder = builder;
	}
	
	public Mob getMob(){
		builder.setAttackPoints();
		builder.setDefencePoints();
		builder.setHealtPoints();
		builder.setName();
		printMob(builder.getMob());
		return builder.getMob();
	}
	
	public void printMob(Mob m){
		System.out.println(m.getName());
		System.out.println("Attack: " + m.getAttackPoints());
		System.out.println("Defence: " + m.getDefencePoints());
		System.out.println("Healt: " + m.getHealtPoints());
		System.out.println("-------------------------------");
	}
}
