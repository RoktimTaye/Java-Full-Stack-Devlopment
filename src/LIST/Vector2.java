package LIST;

import java.util.List;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        List<String> MyVector = new Vector<>();
        MyVector.add("Roktim");
        MyVector.add("Rohan");
        MyVector.add("Ishan");
        MyVector.add("Abhay");
        MyVector.add("Vaishaly");

        System.out.println("List : "+MyVector);

        MyVector.addFirst("Priya");

        System.out.println("List : "+MyVector);

        MyVector.addLast("Priyanka");

        System.out.println("List : "+MyVector);

        MyVector.removeFirst();

        System.out.println("List : "+MyVector);

        MyVector.removeLast();

        System.out.println("List : "+MyVector);

    }
}
