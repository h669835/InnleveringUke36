package dat100.hvl.uke36;

/*
 * b)
 * Lag et nytt Eclipse prosjekt med en klasse der du limer inn koden ovenfor. 
 * Sjekk om du får forventet resultat.
 */

public class G4 {

	public static void main(String[] args) {

		int i;

		System.out.println("Test av repetisjonssetning.");
		System.out.println("***************************");

		i = 1;

		while (i <= 10) {
			System.out.println("Dette er linje nr. " + i);

			if (i == 4) {
				System.out.println();
			}

			if (i == 8) {
				System.out.println();
			}

			i = i + 1;
		}
	}
}