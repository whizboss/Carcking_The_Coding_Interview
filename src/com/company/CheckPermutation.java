package com.company;

import java.util.Locale;

public class CheckPermutation {
    /*
    Given two strings, decide if one is a permutation of the other.
     */
    boolean isPermutation;

    boolean checkPermutation(String a, String b){
        //Convert a and b to lowercase
        a = a.toLowerCase(Locale.ROOT);
        b = b.toLowerCase(Locale.ROOT);

        //Check that strings a and b are equal in length
        if(a.length() == b.length()){
            //Check if there's a character in a that's not in b
            int n = a.length();
            for (char c : a.toCharArray()){
//                System.out.println(c+ ": ");
                if(!b.contains(""+c)){
                    isPermutation = false;
                    break;
                }else{
                    isPermutation = true;
                }
            }
        }else{
            isPermutation = false;
        }
        System.out.println(isPermutation);
        return isPermutation;
    }
}
