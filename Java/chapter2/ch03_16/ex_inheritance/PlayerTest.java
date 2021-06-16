package ch03_16.ex_inheritance;

public class PlayerTest {

	public static void main(String[] args) {
		Player player= new Player();
		player.upgradeLevel(new BeginnerLevel());
		player.play();
		player.upgradeLevel(new AdvancedLevel());
		player.play();
		player.upgradeLevel(new SuperLevel());
		player.play();
	}

}
