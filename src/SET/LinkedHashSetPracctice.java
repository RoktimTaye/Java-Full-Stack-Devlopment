package SET;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPracctice {

    public static void main(String[] args) {
        Set<String> MyLHSet = new LinkedHashSet<>();
        MyLHSet.add("Roktim");
        MyLHSet.add("Rahul");
        MyLHSet.add("Riya");
        MyLHSet.add("Riyana");
        MyLHSet.add("Rayan");
        System.out.println("Name List : "+MyLHSet);
        MyLHSet.remove("Rahul");
        System.out.println("New List : "+MyLHSet);
        System.out.println("Size of Set : "+MyLHSet.size());
    }

}
