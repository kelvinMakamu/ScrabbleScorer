/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KMAKAMU
 */
public class ScrabbleTest {
    
    public ScrabbleTest() {
    }
    
    @Test
    public void calculateScore_returnScoreForASingleLetter_Integer(){
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }
    
    @Test
    public void calculateScore_returnScoreForTwoLetter_Integer(){
        Scrabble testScrabble = new Scrabble();
        Integer expected  = 2;
        assertEquals(expected, testScrabble.calculateScore("ae"));
    }
    
    
    
}
