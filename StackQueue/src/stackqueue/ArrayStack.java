package stackqueue;

import java.util.Arrays;

public class ArrayStack implements IArrayStack {

    private String[] stackArray = new String[0];
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
        stackArray = Arrays.copyOf(stackArray, stackArray.length + 1);
        topIndex++;
        stackArray[topIndex] = value;
        return true;
    }

    @Override
    public String pop() {
        if (!isEmpty()) {
            String value = stackArray[topIndex];
            stackArray = Arrays.copyOf(stackArray, stackArray.length - 1);
            topIndex--;
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
}
