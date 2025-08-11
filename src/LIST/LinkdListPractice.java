package LIST;

import java.util.LinkedList;

public class LinkdListPractice {
    public static void main(String[] args) {
        LinkedList<String> FruitList = new LinkedList<>();
        FruitList.add("Appple");
        FruitList.add("Bnana");
        FruitList.add("Cherry");
        FruitList.add("Straberry");
        FruitList.add("Appple");
        FruitList.addFirst("Orange"); // Add at first Position
        FruitList.addLast("Watermellon"); // Add to thee Last

        for (String planet : FruitList) { // iteration of while LinkdList
            System.out.println("- " + planet);
        }
        System.out.println("Fruit List : "+FruitList);
    }
}
