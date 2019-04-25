package au.edu.usc.mathgame;
import java.util.Random;
import java.util.Scanner;


/**
 * this is a simple math game for grade 3-5.
 *
 * @author rubal
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i=0;i<5;i++){

            int X = rand.nextInt(12) + 1;
            int Y = rand.nextInt(12);



            {
                System.out.println("what is " + X + "+" + Y + "?");
            }

            int correct = X + Y;

            Scanner input = new Scanner(System.in);
            int response = input.nextInt();
            if (response == correct)
            {
                System.out.println("yes you are right");
            } else {
                System.out.println("no answer is wrong");
            }


        }}}





