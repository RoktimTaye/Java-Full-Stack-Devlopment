package LIST;

import java.util.List;
import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack<String> MyStack = new Stack<>();
        MyStack.add("Roktim");
        MyStack.add("Raman");
        MyStack.add("Rakesh");
        MyStack.add("Rohit");
        MyStack.add("Rahul");
        MyStack.add("Riyan");

        System.out.println("Name List : "+MyStack);

        MyStack.addFirst("Rockey");

        System.out.println("List : "+MyStack);

        MyStack.addLast("Rayan");

        System.out.println("List : "+MyStack);

        MyStack.removeFirst();
        System.out.println("List : "+MyStack);

        MyStack.removeLast();
        System.out.println("List : "+MyStack);

        MyStack.push("Asish");

        System.out.println("List : "+MyStack);

        MyStack.pop();
        System.out.println("List : "+MyStack);
    }
}
