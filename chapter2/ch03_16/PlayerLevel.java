package ch03_16;

public abstract class PlayerLevel {
	protected int count;
	
	abstract void run();
	abstract void jump();
	abstract void turn();
	abstract void showLevelMessage();
	
	public void go(int count) {
		for(int i= 0; i< count; i++) {
			jump();
		}
		turn();
	}
}
