package collectionInJava;

import java.util.Stack;

// Last in first out.

public class StackEx {
    public static void main(String[] args){
        Stack<String> stack=new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);
        System.out.println("Top most the elements "+stack.peek());
        System.out.println("Top most the elements and the removing "+stack.pop());
        System.out.println("After removing the elements "+stack);
    }
}
