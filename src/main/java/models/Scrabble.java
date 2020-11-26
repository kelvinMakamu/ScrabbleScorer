/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author KMAKAMU
 */
public class Scrabble {
    
    Map<Character,Integer> mapScores;
    
    public Scrabble() {
        this.mapScores = new LinkedHashMap<>();
        mapScores.put('A',1);
        mapScores.put('E',1);
        mapScores.put('I',1);
        mapScores.put('O',1);
        mapScores.put('U',1);
        mapScores.put('L',1);
        mapScores.put('N',1);
        mapScores.put('R',1);
        mapScores.put('S',1);
        mapScores.put('T',1);
        mapScores.put('D',2);
        mapScores.put('G',2);
        mapScores.put('B',3);
        mapScores.put('C',3);
        mapScores.put('M',3);
        mapScores.put('P',3);
        mapScores.put('F',4);
        mapScores.put('H',4);
        mapScores.put('V',4);
        mapScores.put('W',4);
        mapScores.put('Y',4);
        mapScores.put('K',5);
        mapScores.put('J',8);
        mapScores.put('X',8);
        mapScores.put('Q',10);
        mapScores.put('Z',10);
    }
     
    public Integer calculateScore(String word){
        char[] letters = word.toUpperCase().toCharArray();
        Integer result = 0;
        for(int i=0; i<letters.length;i++){
            if(this.mapScores.containsKey(letters[i])){
                result += this. mapScores.get(letters[i]);
            }
        }
        return result;
    }

}
