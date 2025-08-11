package LIST;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> MyStack = new Stack<>();
        MyStack.push("Roktim");
        MyStack.push("Ahan");
        MyStack.push("Ishan");
        MyStack.pop();
        System.out.println("Name List : "+MyStack);
    }
}
