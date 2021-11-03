package com.kosmatka;

import java.awt.*;
import java.lang.reflect.Array;

public class SortkingStrings {
    public static void StringSorter(String word){

        String reverstWord ="";

       for(int i = word.length()-1; i >= 0; i--){
        reverstWord = reverstWord + word.charAt(i);

        }

        System.out.println(reverstWord);


    }
}
