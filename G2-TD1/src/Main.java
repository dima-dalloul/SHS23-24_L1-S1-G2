import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello G2!");

        double largeur, hauteur, surfacePot, aire, nbPots;

        Scanner s = new Scanner(System.in);
        System.out.print("Largeur du mur svp : ");
        largeur = s.nextDouble();

        System.out.print("Hauteur du mur svp : ");
        hauteur = s.nextDouble();

        System.out.print("Surface couverte par le pot svp : ");
        surfacePot = s.nextDouble();

        aire = hauteur * largeur;

        nbPots = Math.ceil ( aire / surfacePot);

        System.out.print("Vous devez prévoir " + nbPots + " pour couvrir les " + aire  + " m2.");

    }

    static void exo1(){
        int entier;
        Scanner s = new Scanner(System.in);
        System.out.println("Veuillez écrire un entier svp : ");
        entier = s.nextInt();

        //int resultat = entier * entier;
        int resultat = (int) Math.pow(entier, 2);

        System.out.println("Le carré de " + entier + " est " + resultat);
    }
}