package Odev1;/*	Bir	zar	oyununda	atılan	üç	zara	göre	kullanıcılar	puan	kazanmaktadır.
Kullanıcı	sırasıyla	1,	2	ve	3	tuşlarına	bastığında	sırayla	1.,	2.	ve	3.		zarın	atıldığı	ve
	aşağıdaki	kurallara	göre	kazanılan	puanı	ekrana	yazdıran	bir	program	yazınız.
	• Üç	zar	da	6	ise	20	puan
	• Üç	zar	da	aynıysa	(ama	6	değilse)	10	puan
	• Üç	zardan	herhangi	ikisi	aynıysa	5	puan
 */
import java.util.Scanner;
public class DiceGame {
    public static int rollTheDice(){

        double rand =Math.random();
        int diceNumber = (int) (6*rand+1);
       //return  6;
        return diceNumber;
    }
    public static void main (String args[]) {
        int key1;
        int key2;
        int key3;
        Scanner input = new Scanner(System.in);
            System.out.println("First Player!The game will start when you press 1.");
            System.out.println("Please press 1");

        if (input.nextInt() != 1) {
            System.out.println("You press the wrong key.");
        }
        key1 = rollTheDice();
        System.out.println("First dice is = " + key1 + "'dır.");
        System.out.println("Second Player!The game will start when you press 2.");
        System.out.println("Please press 2!");

        if (input.nextInt() != 2) {
            System.out.println("You press the wrong key.");
        }
        key2 = rollTheDice();
        System.out.println("Second dice is = " + key2 + "'dır.");
        System.out.println("Third Player!The game will start when you press 3.");
        System.out.println("Please press 3!");

        if (input.nextInt() != 3){
            System.out.println("You press the wrong key.");
    }
        key3 = rollTheDice();
        System.out.println("Third dice is = " + key3 + "'dır.");
        if (key1 == key2 && key2 == key3) {
            System.out.println("You gain 20 points");
        } else if (key1 == key2 && key2== key3  && key1 != 6) {
            System.out.println("You gain 10 points");
        } else if (key1 == key2 || key1 == key3||key2==key3) {
            System.out.println("You gain 5 points.");
        }else {
            System.out.println("You gain 0 points");
            System.out.println("Lost!");


        }
    }




}
