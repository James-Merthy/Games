package PierreFeuilleCiseaux;

import java.util.Objects;
import java.util.Scanner;


public class game {

    public static void main(String[] args) {


        String p = "pierre";
        String f = "feuille";
        String c = "ciseaux";
        String[] tableauBot = {p, f, c};

        Scanner scanner = new Scanner(System.in);
        int compteurJoueur = 0;
        int compteurBot = 0;


        boolean GameOver = false;

        System.out.println("**** Pierre , Feuille , Ciseaux ************************************************************");
        System.out.println("****!!! Attention bien écrire au clavier * papier * * feuille* *ciseaux* !!!******");
        System.out.println("**** vous jouez contre un bot le premier a 3 point gagne bonne chance ! ********************");

        int i = 0;

        while (!GameOver) {


            String TableauDesScore = " Score **** | bot : " + compteurBot + " | player : " + compteurJoueur + " |";

            System.out.println(TableauDesScore);

            int bot = (int) (Math.random() * tableauBot.length);


            System.out.println("**** pierre , feuille , ciseaux ************************************************************");
            String PierreFeuileCiseaux = scanner.nextLine();


            if (!Objects.equals(PierreFeuileCiseaux, p) && !Objects.equals(PierreFeuileCiseaux, f) && !Objects.equals(PierreFeuileCiseaux, c)) {

                System.out.println("attention erreur recommencez !!!!");

            } else {


                System.out.println("player: " + PierreFeuileCiseaux);
                System.out.println(("bot : " + tableauBot[bot]));


            }

            if (Objects.equals(PierreFeuileCiseaux, p) && Objects.equals(tableauBot[bot], p)) {

                System.out.println("match null");


            } else if (Objects.equals(PierreFeuileCiseaux, f) && Objects.equals(tableauBot[bot], f)) {
                System.out.println("match null");


            } else if (Objects.equals(PierreFeuileCiseaux, c) && Objects.equals(tableauBot[bot], c)) {
                System.out.println("match null");


                /*
                  quand le joueur gagne
                 */
            } else if (Objects.equals(PierreFeuileCiseaux, p) && Objects.equals(tableauBot[bot], c)) {

                compteurJoueur++;


                /*
                  quand le bot gagne
                 */
            } else if (Objects.equals(PierreFeuileCiseaux, p) && Objects.equals(tableauBot[bot], f)) {

                compteurBot++;


            } else if (Objects.equals(PierreFeuileCiseaux, f) && Objects.equals(tableauBot[bot], p)) {

                compteurJoueur++;


            } else if (Objects.equals(PierreFeuileCiseaux, f) && Objects.equals(tableauBot[bot], c)) {

                compteurBot++;


            } else if (Objects.equals(PierreFeuileCiseaux, c) && Objects.equals(tableauBot[bot], p)) {

                compteurBot++;

            } else if (Objects.equals(PierreFeuileCiseaux, c) && Objects.equals(tableauBot[bot], f)) {


                compteurJoueur++;


            }

            if (compteurBot == 3) {

                System.out.println("Vous avez perdu !");
                System.out.println("****Score final  *** | bot: " + compteurBot + " | player : " + compteurJoueur + "****");


                GameOver = true;
            } else if

            (compteurJoueur == 3) {


                System.out.println("vous avez garner ! ");

                System.out.println("****Score final  *** | bot: " + compteurBot + " | player : " + compteurJoueur + " | ****");

                GameOver = true;


            }


        }
    }
}


