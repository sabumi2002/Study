package ch03_16.ex_inheritance;

public class Player {
	PlayerLevel level;
	
	public void getLevel() {
		this.level.showLevelMessage();
	}
	void upgradeLevel(PlayerLevel playerLevel) {
		this.level= playerLevel;
	}
	void play() {
		
		getLevel();
		this.level.go(level.count);
	}
}
