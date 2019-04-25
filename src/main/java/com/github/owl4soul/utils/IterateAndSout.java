package com.github.owl4soul.utils;

import java.util.Iterator;
import java.util.List;

public class IterateAndSout {
    public static void iterateAndSoutNews(List<? extends Object> list) {
        Iterator it = list.iterator();
        int counter = 0;
        while (it.hasNext()) {
            counter++;
            Object[] iterated = (Object[]) it.next();
            Integer id = Integer.parseInt(String.valueOf(iterated[0]));
            String name = String.valueOf(iterated[1]);
            String content = String.valueOf(iterated[2]);
            String date = String.valueOf(iterated[3]);
            String category = String.valueOf(iterated[4]);
            System.out.println("# " + counter + ". >> " + id + " | " + name + " | " + content + " | " + date + " | " + category);
        }
    }
}
