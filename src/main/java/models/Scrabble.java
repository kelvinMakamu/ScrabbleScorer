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
    
    public Integer calculateScore(String word){
        char[] letters = word.toUpperCase().toCharArray();
        Map<Character,Integer> mapScores = scoringMapping();
        Integer result = 0;
        for(int i=0; i<letters.length;i++){
            if(mapScores.containsKey(letters[i])){
                result += mapScores.get(letters[i]);
            }
        }
        return result;
    }
    
    public Map<Character,Integer> scoringMapping (){
        Map<Character,Integer> mapScores = new LinkedHashMap<>();
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
        return mapScores;
    }
}
