
public class Zufall3 {

	public static void main(String[] args) {
		
		int zufallszahl;
		
		zufallszahl = 1 + (int) (Math.random()*6);
		
		if (zufallszahl == 3) {
			System.out.println("gewonnen, du hast eine 3 gewürfelt");
	}

		else if (zufallszahl>3) {
			System.out.println("du darfst nochmal");
		}
		
		else if(zufallszahl<3) {
			System.out.println("leider verloren");
		}
		
		
}
}