package stackqueue;

import java.util.Arrays;

public class ArrayStack implements IArrayStack {

    private String[] stackArray = new String[8];
    private int topIndex;

    ArrayStack() {
        topIndex = -1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public boolean push(String value) {
        System.out.println("lenght " + stackArray.length + " index " + topIndex);
        if (isFull()) {
            stackArray = Arrays.copyOf(stackArray, stackArray.length * 2);
            System.out.println("pushif lenght " + stackArray.length + " index " + topIndex);
        }
        topIndex++;
        stackArray[topIndex] = value;
        return true;
    }

    @Override
    public String pop() {
        if (!isEmpty()) {
            String value = stackArray[topIndex];
            topIndex--;
            System.out.println("pop " + stackArray.length + " index " + topIndex);
            if (stackArray.length / 4 == topIndex + 1 && stackArray.length > 8) {
                stackArray = Arrays.copyOf(stackArray, stackArray.length / 2);
                System.out.println("popif " + stackArray.length + " index " + topIndex
                );
            }
            return value;
        }
        return "";
    }

    @Override
    public String peek() {
        if (!isEmpty()) {
            return stackArray[topIndex];
        }
        return "";
    }

    @Override
    public String show() {
        if (isEmpty()) {
            return "";
        } else {
            String showArray = "";
            for (int i = 0; i <= topIndex; i++) {
                showArray = showArray + stackArray[i] + "|";
            }
            return showArray;
        }
    }

    private boolean isFull() {
        if (topIndex < stackArray.length - 1) {
            return false;
        }
        return true;
    }
}
