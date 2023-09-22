import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {

        System.out.print("Entrer un nombre : ");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        float resultat = 1;

        for (int i = 1; i <= nombre; i++) {

            System.out.print("Entrer le nombre " + i + ": ");
            Scanner nb = new Scanner(System.in);
            int nbre = nb.nextInt();
            resultat *= nbre;
        }
        System.out.println(resultat);

        // System.out.println(tab[i]);
    }
}