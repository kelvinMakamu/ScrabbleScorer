/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScrabbleScorer;

import java.util.Scanner;
import models.Scrabble;

/**
 *
 * @author KMAKAMU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scrabbleInput = new Scanner(System.in);
        System.out.println("Please enter a word to play scrabble");
        String  input = scrabbleInput.next();
        Scrabble playScrabble = new Scrabble();
        Integer scrabbleScore = playScrabble.calculateScore(input);
        System.out.println("The Scrabble Score for the word "+input+" is "+scrabbleScore);
    }
    
}
