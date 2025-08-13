package SET;

import java.util.*;
//Dosent have methods addfirst, addlast or removefirst or removelast as no order is here only sorting.
public class TreeSetPractice {
    public static void main(String[] args) {
        Set<String> MyTSet = new TreeSet<>();
        MyTSet.add("Roktim");
        MyTSet.add("Ayan");
        MyTSet.add("Bornil");
        MyTSet.add("Chinmay");
        MyTSet.add("Dinesh");
        MyTSet.add("Eshan");
        System.out.println("List : "+MyTSet);
//        MyTSet.remove("Ayan");
        TreeSet<String> FirstNumber = (TreeSet<String>) MyTSet;
        FirstNumber.first();
        System.out.println("First element : "+FirstNumber.first());


    }
}
