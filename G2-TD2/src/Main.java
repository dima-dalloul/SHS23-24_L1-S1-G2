import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercice2();
    }

    static void exercice1(){
        Scanner s = new Scanner(System.in);
        float x, y;

        System.out.print("Entrez un premier nombre : ");
        x = s.nextFloat();

        System.out.print("Entrez un second nombre : ");
        y = s.nextFloat();

        // 1ère version : une manière d'écrire if-else-if
        if ( x < y ) {
            System.out.print(x + " < " + y);
        }  else {
            if ( x == y){
                System.out.print(x + " = " + y);
            } else {
                System.out.print(x + " > " + y);
            }
        }


        // 2nde version : une autre manière d'écrire if-else-if
        /*
        if ( x < y ) {
            System.out.print(x + " < " + y);
        }  else if ( x == y){
            System.out.print(x + " = " + y);
        } else {
            System.out.print(x + " > " + y);
        }*/

        s.close();
    }

    static void exercice2(){
        Scanner s = new Scanner(System.in);
        double a, b, c;

        System.out.print("Quelle est  la valeur de a? ");
        a = s.nextDouble();
        System.out.print("Quelle est  la valeur de b? ");
        b = s.nextDouble();
        System.out.print("Quelle est  la valeur de c? ");
        c = s.nextDouble();

        // 1ère version: conditions ligne par ligne
        if(a < b && b < c){     // a < b < c
            System.out.print( a + " < " + b + " < " + c);
        } else if (a < c && c < b){     // a < c < b
            System.out.print( a + " < " + c + " < " + b);
        } else if (b < a && a < c){     // b < a < c
            System.out.print( b + " < " + a + " < " + c);
        } else if (b < c && c < a){     // b < c < a
            System.out.print( b + " < " + c + " < " + a);
        } else if (c < a && a < b){     // c < a < b
            System.out.print( c + " < " + a + " < " + b);
        } else {    // c < b < a
            System.out.print( c + " < " + b + " < " + a);
        }


        // 2nde version: conditions imbriquées
        if ( a < b ){
            if ( c < a ){          // Cas c > a < b
                System.out.println(c + " < " + a + " < " + b);
            } else if (c < b) {     // Cas où c >= a ici
                System.out.println(a + " < " + c + " < " + b);
            } else {            // Cas  c > a et c > b
                System.out.println(a + " < " + b + " < " + c);
            }
        } else {
            if (c < b){         // cas c < b < a
                System.out.println(c + " < " + b + " < " + a);
            } else if (c < a) {     // Cas où c >= b ici
                System.out.println(b + " < " + c + " < " + a);
            } else {        // Cas b < a < c
                System.out.println(b + " < " + a + " < " + c);
            }
        }

        s.close();
    }
}
