package au.edu.usc.mathgame;
import java .util.Random;
import java.util.Scanner;
public class Question {
    private int X=3;
    private int Y=5;
    private String operator;
    private int answer;
    int c=0;
    public Question(int value1,int value2, String op)
    {X=value1;Y=value2;
    operator=op;
    }

    public void showQuestion() {


        Random rand = new Random();

        for(int i=0;i<5;i++)
        {
             X = rand.nextInt(12) + 1;
             Y = rand.nextInt(12);
            int R=rand.nextInt(4);


            if(R==1)
            {operator="+"; answer=X+Y;}

            if(R==2)
            {operator="-";answer=X-Y;}
            if (R==3)
            {operator="*";answer=X*Y;}
            if(R==0)
            {operator="/";answer=X/Y;}

            System.out.println("what is " + X +operator+ Y + "?");
            Scanner input=new Scanner(System.in);
            int response = input.nextInt();

            System.out.println(checkAnswer(response));
        System.out.println("YOUR SCORE is " + c);
    }}

    public boolean checkAnswer(int response) {
        if (response ==0)
        {return false;}

        if (response == answer) {

        c++;
        return(true);

    } else {

        return(false);
    }

}}



