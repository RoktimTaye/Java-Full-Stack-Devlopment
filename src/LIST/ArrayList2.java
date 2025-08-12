package LIST;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<String> MyArrayList = new ArrayList<>();
        MyArrayList.add("Roktim");
        MyArrayList.add("Roaman");
        MyArrayList.add("Roshni");
        MyArrayList.add("Rishi");
//        MyArrayList.remove(2);
        MyArrayList.set(2,"Riya");
        System.out.println("Name List : "+MyArrayList);
    }
}
