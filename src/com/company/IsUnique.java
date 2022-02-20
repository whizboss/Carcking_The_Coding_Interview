package com.company;

import java.util.Locale;

/*
    An algorithm to determine if a string has all unique characters.
 */
public class IsUnique {

    boolean isUnique;

    boolean checkIsUnique(String s){
        System.out.println("String: "+s);
        int n = s.length();
        s = s.toLowerCase(Locale.ROOT);
        //Iterate through S
        for(char c : s.toCharArray()){
            System.out.println(c + ": " + s.substring(s.indexOf(c)+1));
            //if c is found in the Substring of s
            if(s.substring(s.indexOf(c)+1).contains(""+c)){
                isUnique = false;
                break;
            }else{
                isUnique = true;
            }
        }
        System.out.println(isUnique);
        return isUnique;
    }
}
