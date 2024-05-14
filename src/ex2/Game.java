package ex2;

public class Game {

	// Constantes
	final String right = "Derecha";
	final String left = "Izquierda";
	final String up = "Arriba";
	final String down = "Abajo";

	Player player1 = new Player();

	public void movement(String m) {

		switch (m) {

		case right:
			player1.setX(player1.getX() + 1);
			System.out.println(player1.getX() + ", " + player1.getY());
			break;

		case left:
			player1.setX(player1.getX() - 1);
			System.out.println(player1.getX() + ", " + player1.getY());
			break;

		case up:
			player1.setY(player1.getY() - 1);
			System.out.println(player1.getX() + ", " + player1.getY());
			break;

		case down:
			player1.setY(player1.getY() + 1);
			System.out.println(player1.getX() + ", " + player1.getY());
			break;

		}

	}
}
