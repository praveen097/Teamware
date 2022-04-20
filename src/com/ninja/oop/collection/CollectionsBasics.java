package com.ninja.oop.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CollectionsBasics {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(3);
        list.add(3);
        System.out.println("Size is " + list.size());
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " -> ");
        }
        System.out.println("END");
        System.out.println("Using list iterator :");
        ListIterator<Integer> listItr = list.listIterator();
        while(listItr.hasNext()){
            System.out.print(listItr.next() + " -> ");
        }
        System.out.println("END");
        while(listItr.hasPrevious()){
            System.out.print(listItr.previous() + " -> ");
        }
        System.out.println("START");
    }
}
