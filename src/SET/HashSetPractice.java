package SET;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<String> MySet = new HashSet<>();
        MySet.add("Roktim");
        MySet.add("Rohan");
        MySet.add("Rohit");
        MySet.add("Raman");
        MySet.add("Ramesh");
        MySet.add("Ramesh");
        System.out.println("Name List : "+MySet);
        for (String Names : MySet){
            System.out.println("NAMES : "+Names);
        }
    }
}
