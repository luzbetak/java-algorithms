package com.kevinluzbetak;

import java.util.*;
/*
Two Two Distinct Integer Permutation
[(1 6), (2 5), (1 5), (2 4), (3 4), (3 5), (2 6), (3 6), (4 5), (1 2), (1 4), (2 3), (1 3), (5 6), (4 6)]
 */
public class TwoDistinctIntegerPermutation {

    /*-----------------------------------------------------------------------*/
    public static Set<String> getIntegerPermutation(int[] num) {

        HashSet<String> result = new HashSet<>();

        for(int i=0; i < num.length-1; i++) {
            for(int j=1; j < num.length; j++) {
                if(num[i] !=  num[j]) {
                    if(num[i] > num[j]) {
                        result.add("(" + num[j]+ " " + num[i] + ")");
                    } else {
                        result.add("(" + num[i] + " " + num[j] + ")");
                    }
                }
            }
        }
        return result;
    }
    /*-----------------------------------------------------------------------*/

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        Set<String> result = getIntegerPermutation(num);
        System.out.println(result);

    }
}
