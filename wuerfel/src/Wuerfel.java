
public class Wuerfel {

	public static void main(String[] args) {
		
		int n = 2; // Anzahl der Seiten des Würfels
		int k = 5; // Zum gewinnen notwendige Anzahl
		int s = 100000; // Anzahl der Spiele
		
		int anzahlWuerfe=0; // Zähler, der die Würfe zählt, bis das Siegereignis k-mal aufgetreten ist -> Wieder auf 0 gesetzt
		boolean gewonnen=false;
		double zwischenspeicher=0; //Summe der Anzahl der Würfe, 
		int zwischensieg=0;
		
		
		//führt ein Spiel nacheinander aus
		for(int i=0; i<s;i++) {
			//generierter Würfelwurf
			int ergebnis;
			//Anzahl der geworfenen Male
			
			while(gewonnen!=true)
			{
				//solange das Zielergebnis bleibt, dann führe nochmal Wurf durch
				do{
					ergebnis = (int) (Math.random()*n+1);
					anzahlWuerfe++;
					if(ergebnis==n){
						zwischensieg++;
					}
					//wenn das Zwischenergebnis 
					if(zwischensieg==k) {
						gewonnen = true;
						break;
					}
				}while(ergebnis==n) ;
				zwischensieg=0;
			}
			gewonnen=false;
			zwischenspeicher += anzahlWuerfe;
			anzahlWuerfe=0;
			
			
		}
		//System.out.println("Die gesuchte Zahl wurde "+siegereignis+"x gewürfelt.");
		//System.out.println("Es wurde insgesamt "+anzahlWuerfe+"x gewürfelt.");
//		System.out.println("Eine Seite wurde "+wieOftKommtDieSchleife+"x "+k+"x hintereinander gewürfelt.\n\n");
//		System.out.println("Anzahl der Seiten des Würfels: "+n);
//		System.out.println("Zum gewinnen notwendige Anzahl: "+k);
//		System.out.println("Anzahl der Wiederholungen: "+s+"\n");
//		System.out.println("Zähler, wie oft die gesuchte Zahl "+k+"x hintereinander aufgetreten ist: "+wieOftKommtDieSchleife);
//		System.out.println("Zwischenspeicher: "+zwischenspeicher);
		double finale = (zwischenspeicher / s);
		
		System.out.println(finale);
		
	}

}
