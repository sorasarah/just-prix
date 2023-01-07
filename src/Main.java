import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //nombre d'essais
        int tryNum = 5;
        //catégorie
        String[] cat = {"Dress", "Car", "House"};
        /* random d'un tableau
        * int catRandom = new Random().nextInt(0,2);
        * */
        if(tryNum > 0){
            for (String i : cat) {
                if (i == "Dress" && tryNum > 0) {
                    System.out.println("------------GUESS DRESS PRICE-----------------");
                    System.out.println("------------The price is between 5 and 80-----------------");
                    int dressP = new Random().nextInt(5, 80);
                    System.out.println(dressP); //pour connaître la valeur
                    do {
                        //je crée une entrée de valeur
                        Scanner scan = new Scanner(System.in);
                        int numberScan = scan.nextInt();

                        //Afficher message si c'est moins
                        if (numberScan < dressP) {
                            System.out.println("It's more ! GUESS AGAIN");
                        }
                        //Afficher message si c'est plus
                        if (numberScan > dressP) {
                            System.out.println("It's less! GUESS AGAIN");
                        }
                        if (numberScan == dressP) {
                            System.out.println("BRAVO ! YOU GUESS WELL");
                            break;
                        }
                        tryNum--;
                    } while (tryNum > 0);
                }
                if (i == "Car" && tryNum > 0) {
                    System.out.println("------------GUESS CAR's PRICE-----------------");
                    System.out.println("------------The price is between 5.000 and 75.000-----------------");
                    int carP = new Random().nextInt(50, 750)*100;
                    System.out.println(carP); //pour connaître la valeur
                    while (tryNum > 0) {
                        //je crée une entrée de valeur
                        Scanner scan = new Scanner(System.in);
                        int numberScan = scan.nextInt();

                        //Afficher message si c'est moins
                        if (numberScan < carP) {
                            System.out.println("It's more ! GUESS AGAIN");
                        }
                        //Afficher message si c'est plus
                        if (numberScan > carP) {
                            System.out.println("It's less! GUESS AGAIN");
                        }
                        if (numberScan == carP) {
                            System.out.println("BRAVO ! YOU GUESS WELL");
                            break;
                        }
                        tryNum--;
                    }
                }
                if (i == "House" && tryNum > 0) {
                    System.out.println("------------GUESS House's PRICE-----------------");
                    System.out.println("------------The price is between 90.000 and 500.000-----------------");
                    int houseP = new Random().nextInt(90, 500)*1000;
                    System.out.println(houseP); //pour connaître la valeur
                    while (tryNum > 0) {
                        //je crée une entrée de valeur
                        Scanner scan = new Scanner(System.in);
                        int numberScan = scan.nextInt();

                        //Afficher message si c'est moins
                        if (numberScan < houseP) {
                            System.out.println("It's more ! GUESS AGAIN");
                        }
                        //Afficher message si c'est plus
                        if (numberScan > houseP) {
                            System.out.println("It's less! GUESS AGAIN");
                        }
                        if (numberScan == houseP) {
                            System.out.println("BRAVO ! YOU GUESS WELL");
                            break;
                        }
                        tryNum--;
                    }
                }
        }
        if(tryNum == 0){
            System.out.println("GAME OVER");
        }

        //initialisation de vie
            //perte de vie lancer minuteur 30 min
            //faire une condition si nb vie < 5 au bout de 3Omin tu + 1
            //si vie = 5 minuteur 0
            if(tryNum < 5){
                LocalTime timeLife = LocalTime.now();
                System.out.println(timeLife);
                int minute = timeLife.getMinute();
                System.out.println(minute);
               /*if (){
                System.out.println(timeLife);
                tryNum++;
                }*/
            }


    }
    }
}