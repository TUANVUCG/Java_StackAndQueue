package Pracetice_2;

public class GenericStackClient {

    private static void stackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");

        System.out.println("Size is : " + stack.size());
        while (!stack.isEmpty()) {
            System.out.printf("%s", stack.pop());
        }
    }


    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Size of Integer Stack : " + stack.size());
        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2.Stack of String ");
        stackOfIString();
    }
}

