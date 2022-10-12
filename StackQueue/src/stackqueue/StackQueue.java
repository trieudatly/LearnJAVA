package stackqueue;

public class StackQueue {

    public static void main(String[] args) {
//ArrayStack 
        ArrayStack arrayStack = new ArrayStack();
//code for testing.
//        int loop = 200;
//        int loopPop = loop;
//        while (loop > 0) {
//            System.out.println(arrayStack.push("facebook.com"));
//            loop--;
//        }
//        while (loopPop > 0) {
//            System.out.println(arrayStack.pop() + "\n");
//            loopPop--;
//        }
        System.out.println(arrayStack.push("google.com"));
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.push("dantri.vn"));
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.push("tuoitre.com"));
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.push("facebook.com"));
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.show());
        System.out.println("pop= " + arrayStack.pop() + "\n");
        System.out.println(arrayStack.show());
        System.out.println("\n");
//linked ListStack 
//        LinkedListStack linkedListStack = new LinkedListStack();
//        System.out.println(linkedListStack.push("google.com"));
//        System.out.println(linkedListStack.peek());
//        System.out.println(linkedListStack.push("dantri.vn"));
//        System.out.println(linkedListStack.peek());
//        System.out.println(linkedListStack.push("tuoitre.com"));
//        System.out.println(linkedListStack.peek());
//        System.out.println(linkedListStack.push("facebook.com"));
//        System.out.println(linkedListStack.show());
//
//        System.out.println(linkedListStack.pop() + "\n");
//        System.out.println(linkedListStack.show());
//
//        System.out.println(linkedListStack.pop() + "\n");
//        System.out.println(linkedListStack.show());
//
//        System.out.println(linkedListStack.pop() + "\n");
//        System.out.println(linkedListStack.show());
//
    }

}
