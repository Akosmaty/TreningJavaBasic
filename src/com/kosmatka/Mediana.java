package com.kosmatka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mediana {
    public void mediana(){
        Random random = new Random();
        int x = random.nextInt(100);
        int mediana;

        List list = new ArrayList<Integer>();
        for (int i = 0; i<x; i++) {
            list.add(random.nextInt(100));
        }

        Collections.sort(list);
        if (list.size()%2==0){
            int half = list.size()/2;
           System.out.println(list.get(half));

        }
        else {
            int firstHalf = (list.size() / 2) + 1;
            int secoundHalf = (list.size() / 2);
            int medina = ((Integer)list.get(firstHalf)+(Integer)list.get(secoundHalf))/2;
            System.out.println("medaina "+ medina);
        }

    }
}
