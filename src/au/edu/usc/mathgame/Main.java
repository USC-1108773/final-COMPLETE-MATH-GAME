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
        {

            Question q1 = new Question(3,5);
            q1.showQuestion();}
        {
    Question response=new Question(3,5);
        response.checkAnswer();
        }}}






