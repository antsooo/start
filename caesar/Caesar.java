
public class Caesar {

	public static void main(String[] args) {
		//Für jedes eingegebenes Argument wird die Schleife 1x durchgeführt (Startet bei 1, da erste Stelle der Schlüssel ist)
		for (int j=1; j<args.length; j++) {
			String parameter = args[j];
			
			char[] buchstaben = parameter.toCharArray();

			int n = Integer.parseInt(args[0]);
			//Rest, falls die Eingabe über 26 ist
			n = n%26;
			//Verschlüsselung um n-Stellen
			if(n>=0) {
				//Geht die Buchstaben von dem char-Array des eingegebenen Strings alle einzeln durch
				for(int i=0; i<buchstaben.length; i++) {
					//Buchstabenverschiebung im Normalfall - alle Buchstaben zwischen A bis (Z - Schlüssel) oder a bis (z - Schlüssel)
					if(buchstaben[i] >= 'A' && buchstaben[i] <= 'Z'-n || buchstaben[i] >= 'a' && buchstaben[i] <='z'-n) {
						buchstaben[i] += n;
					}//Buchstabenverschiebung im Randfall - alle Buchstaben, die über die ASCII-Tabelle in ein Sonderzeichen gehen würden
					else if(buchstaben[i] > 'Z'-n && buchstaben[i] <= 'Z' || buchstaben[i] > 'z'-n && buchstaben[i] <= 'z') {
						//da Alphabet 26 Buchstaben hat muss die Stelle in der ASCII-Tabelle angepasst werden
						buchstaben[i] += n-26;
					}
					
					System.out.print(buchstaben[i]);
					
					
				}
				System.out.println();
			}//Entschlüsselung um n-Stellen
			else if(n<0) {
				for(int i=0; i<buchstaben.length; i++) {
					//Buchstabenverschiebung im Normalfall - alle Buchstaben zwischen (A - Negativschlüssel) bis Z oder (a - Negativschlüssel) bis z
					if(buchstaben[i] >= 'A'-n && buchstaben[i] <= 'Z' || buchstaben[i] >= 'a'-n && buchstaben[i] <='z') {
						buchstaben[i] += n;
					}//Buchstabenverschiebung im Randfall - alle Buchstaben, die über die ASCII-Tabelle in ein Sonderzeichen gehen würden
					else if(buchstaben[i] >= 'A' && buchstaben[i] <= 'A'-n || buchstaben[i] >= 'a' && buchstaben[i] <= 'a'-n) {
						//da Alphabet 26 Buchstaben hat muss die Stelle in der ASCII-Tabelle angepasst werden
						buchstaben[i] += n+26;
					}
					
					System.out.print(buchstaben[i]);
					
					
				}
				//Zeilenweise Ausgabe
				System.out.println();
			}
			
		}
		
		
	}

}
