package com.best;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BG276137 on 2017/12/29
 */
public class Test1 {
    public static void main(String[] args){
        System.out.println(args);
        List<String> strs = new ArrayList<String>(10);
        int i=0;
        while (true){
            String str = String.valueOf(i++);
            System.out.println(str);
            strs.add(String.valueOf(i++).intern());
        }
    }
}
