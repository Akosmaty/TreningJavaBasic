package com.kosmatka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest {
    public static void listTesting(){

      List list = new ArrayList();
      list.add("asdasd");
      list.add("asda2");
      list.add("asdasd");

        for(int i=0; list.size()>i; i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
