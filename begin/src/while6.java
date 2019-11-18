
public class while6 {

	public static void main(String[] args) {

		int zaehler=0;

		int zufallszahl =  1 + (int) (Math.random()*6);
		
		
		
		
		
		while (zufallszahl!=6) {
		zaehler++;
		
		zufallszahl =  1 + (int) (Math.random()*6);
		}
		System.out.println(zaehler);
	
	}
}
