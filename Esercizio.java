import java.util.scanner;
public class Esercizio{
Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n;
        double limiteCrediti;
        double media, somma;
        
        System.out.println("Inserire il numero di studenti: ");
        n = input.nextInt();
        String[] studenti = new String[n];
        double[] voti = new double[n], crediti = new double[n];
        
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Nome " + (i + 1) + "° studente: ");
            studenti[i] = input.nextLine();
            System.out.println("Voto " + (i + 1) + "° studente: ");
            voti[i] = input.nextDouble();
            System.out.println("Crediti " + (i + 1) + "° studente: ");
            crediti[i] = input.nextDouble();
        }
        somma = 0;
        for (i = 0; i <= n - 1; i++) {
            somma = somma + voti[i];
        }
        media = somma / n;
        limiteCrediti = 6;
        System.out.println("Elenco alunni con votazione superiore alla media " + media + " e con almeno " + limiteCrediti + " crediti.");
        for (i = 0; i <= n - 1; i++) {
            if (voti[i] > media) {
                if (crediti[i] >= 6) {
                    System.out.println("Lo studente " + studenti[i] + " ha voto " + voti[i] + " e " + crediti[i] + " crediti");
                }
            }
        }
    }
}