package stackqueue;

//import java.util.ArrayList;
public class LinkedListStack implements ILinkedListStack {

    private class Node {

        String value;
        Node next;

        Node(String value) {
            this.value = value;
        }
    }
    Node topNode;

    LinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public boolean push(String value) {
        Node newNode = new Node(value);
        newNode.next = topNode;
        topNode = newNode;
        return true;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            return "";
        } else {
            String value = topNode.value;
            topNode = topNode.next;
            return value;
        }
    }

    @Override
    public String peek() {
        if (isEmpty()) {
            return "";
        } else {
            return topNode.value;
        }
    }

    @Override
    public String show() {
        if (isEmpty()) {
            return "";
        }
        Node n = topNode;
        String showArray = "";
        while (n != null) {
            showArray = showArray + n.value + "|";
            n = n.next;
        }
        return showArray;
//        Node temp = topNode;
//        ArrayList<String> tempList = new ArrayList<>();
//        while (temp != null) {
//            tempList.add(temp.value);
//            temp = temp.next;
//        }
//        String showArray = "";
//        for (int i = tempList.size() - 1; i >= 0; i--) {
//            showArray = showArray + tempList.get(i) + "|";
//        }
//        return showArray;
    }

}
