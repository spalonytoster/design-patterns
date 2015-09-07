package pl.comarch.patterns.builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class World {

	private static List<Mob> mobs = new ArrayList<>(5);
	
	public static void main(String[] args) {
		
		int settlers = 2;
		int warriors = 3;
		int invaders = 3;
		mobs.clear();
		MobGenerator generator = new MobGenerator();

		for(int i=0; i<settlers; i++){
			generator.prepareMob(new SettlerBuilder());
			mobs.add(generator.getMob());
		}
		for(int i=0; i<warriors; i++){
			generator.prepareMob(new WarriorBuilder());
			mobs.add(generator.getMob());
		}
		for(int i=0; i<invaders; i++){
			generator.prepareMob(new InvaderBuilder());
			mobs.add(generator.getMob());
		}
		
		
	}
}
