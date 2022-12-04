package com.JavaCore.Collection;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        final List<Integer> l1 = new ArrayList<>();
        final List<Integer> l2 = new ArrayList<>();
        l1.add(1); l1.add(2); l1.add(3); l1.add(4); l1.add(5);
        for (Integer integer : l1) {
            l2.add(integer);
        }
        l1.removeAll(l1);
        System.out.println(l1);
        System.out.println(l2);
    }
}
