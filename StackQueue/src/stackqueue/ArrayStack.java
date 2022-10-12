package stackqueue;

import java.util.Arrays;

public class ArrayStack implements IArrayStack {

    private final int ARRAY_LENGHT_INCREASE_RATE = 2;//The array's increase rate
    private int arrayInitialValue = ARRAY_LENGHT_INCREASE_RATE * ARRAY_LENGHT_INCREASE_RATE * ARRAY_LENGHT_INCREASE_RATE;
    private String[] stackArray = new String[arrayInitialValue];
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
        //System.out.println("lenght " + stackArray.length + " index " + topIndex);
        if (isFull()) {
            stackArray = Arrays.copyOf(stackArray, stackArray.length * ARRAY_LENGHT_INCREASE_RATE);
            //System.out.println("pushif lenght " + stackArray.length + " index " + topIndex);
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
            //System.out.println("pop " + stackArray.length + " index " + topIndex);
            if (stackArray.length == (topIndex + 1) * ARRAY_LENGHT_INCREASE_RATE * ARRAY_LENGHT_INCREASE_RATE && stackArray.length > arrayInitialValue) {
                stackArray = Arrays.copyOf(stackArray, stackArray.length / ARRAY_LENGHT_INCREASE_RATE);
                //System.out.println("popif " + stackArray.length + " index " + topIndex);
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
