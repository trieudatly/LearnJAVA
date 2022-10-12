package stackqueue;

import java.util.Arrays;

public class ArrayStack implements IArrayStack {
    /**Array's increase rate*/
    private final int ARRAY_LENGHT_INCREASE_RATE = 2;
    /**Array's initial value*/
    private int arrayInitialValue = ARRAY_LENGHT_INCREASE_RATE * ARRAY_LENGHT_INCREASE_RATE * ARRAY_LENGHT_INCREASE_RATE;
    /**Array for handling the stack*/
    private String[] stackArray = new String[arrayInitialValue];
    /**The top index of the stack */
    private int topIndex;

    ArrayStack() {
        topIndex = -1;
    }
/**Check if the stack's array is empty */
    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

/** Add a string value to the top of the stack's array and return true.
 * If the array is full, then increase the array's length based on ARRAY_LENGHT_INCREASE_RATE.*/
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
/**Return the String value at the top of the stack's array and decrease the top index.
 * After that, if the array's lenght is too long, then reduce it base on ARRAY_LENGHT_INCREASE_RATE to save space.
 * Return blank if the stack is empty. 
*/
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
/**Return the String value at the top of the stack's array.*/
    @Override
    public String peek() {
        if (!isEmpty()) {
            return stackArray[topIndex];
        }
        return "";
    }
/**Return a String of all value of the stack's array.*/
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
/**Check if the stack's array is full */
    private boolean isFull() {
        if (topIndex < stackArray.length - 1) {
            return false;
        }
        return true;
    }
}
