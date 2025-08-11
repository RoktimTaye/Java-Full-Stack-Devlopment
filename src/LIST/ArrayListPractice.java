import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Banana");
        fruitsList.add("Apple");
        fruitsList.add("Orange"); // Add element
        fruitsList.remove(2); // Remove element
        fruitsList.set(1,"Guava"); // Set element
        for (String fruit : fruitsList) { // Iterateion of th List
            System.out.println("- " + fruit);
        }
        System.out.println("List of frouits : "+ fruitsList);
    }

}
