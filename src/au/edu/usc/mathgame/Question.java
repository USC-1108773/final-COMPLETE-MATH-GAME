package au.edu.usc.mathgame;
import java .util.Random;
import java.util.Scanner;
public class Question {
    private int value1=3;
    private int value2=5;
    private String operator;
    private int answer;
    public Question(int value1,int value2)
    {value1=3;
    value2=5;}

    public void showQuestion() {


        Random rand = new Random();

        for(int i=0;i<5;i++)
        {
            int X = rand.nextInt(12) + 1;
            int Y = rand.nextInt(12);
            {
                System.out.println("what is " + X + "+" + Y + "?");
            }
            public void checkAnswer() {
                Scanner input=new Scanner(System.in);
            int response = input.nextInt();
            int correct=X+Y;
            if (response == correct)
            {
                System.out.println("yes you are right");

            }
            else {
                System.out.println("no answer is wrong");}}}}}



