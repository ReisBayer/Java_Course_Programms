package Aufgaben;

import java.nio.file.Paths;
import java.util.Scanner;

public class Faust {

    public static void main(String[] args) throws Exception {

        String file = "C:\\Users\\ReisBayer\\Desktop\\Programmierung\\LernKurs\\faut1.txt";

        Scanner input = new Scanner(Paths.get(file));

        int countI = 0;
        int countU = 0;
        while(input.hasNext()){
            String word = input.next();
            word = word.toLowerCase();
            word = word.replaceAll("[^a-z]", "");


            if(word.equals("ich")){
                countI++;
            }
            else if(word.equals("du")){
                countU++;
            }


        }

        System.out.println("Ich kam " + countI + " vor.");
        System.out.println("Du kam " + countU + " vor.");

    }
}
