import java.util.Arrays;
public class Begruesung {
	public static void main (String[] args) {


		int Alter = Integer.parseInt (args[0]);

		String Name = (args[1]);
		

		
		
		System.out.println(args[2] == "W");
		System.out.println(args[2] instanceof String);
		System.out.println("W" instanceof String);
				
		System.out.println(Arrays.toString(args));
		String Geschlecht = (args[2]);

		if (Alter<18) {

			System.out.println	("HI KIDS");
		
		}
		else if (Alter >= 18 && Geschlecht == "W") {

			System.out.println("HI MADAM " + Name);

		}
//		else if (Alter>18 && Geschlecht== "M") {
//
//			System.out.println("HI SIR" + Name);
		}
	}
//}
