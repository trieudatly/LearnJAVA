package stackqueue;

public class StackQueue {

    public static void main(String[] args) {
//ArrayStack 
        ArrayStack arrayStack = new ArrayStack();
        System.out.println(arrayStack.push("google.com"));
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.push("dantri.vn"));
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.push("tuoitre.com"));
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.push("facebook.com"));
        System.out.println(arrayStack.show());

        System.out.println(arrayStack.pop() + "\n");
        System.out.println(arrayStack.show());

        System.out.println(arrayStack.pop() + "\n");
        System.out.println(arrayStack.show());

        System.out.println(arrayStack.pop() + "\n");
        System.out.println(arrayStack.show());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        //ArrayStack 
        LinkedListStack linkedListStack = new LinkedListStack();
        System.out.println(linkedListStack.push("google.com"));
        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.push("dantri.vn"));
        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.push("tuoitre.com"));
        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.push("facebook.com"));
        System.out.println(linkedListStack.show());

        System.out.println(linkedListStack.pop() + "\n");
        System.out.println(linkedListStack.show());

        System.out.println(linkedListStack.pop() + "\n");
        System.out.println(linkedListStack.show());

        System.out.println(linkedListStack.pop() + "\n");
        System.out.println(linkedListStack.show());
    }

}
