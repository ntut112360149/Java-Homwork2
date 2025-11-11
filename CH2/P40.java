package CH2;

import java.io.IOException;
import java.lang.reflect.Array;

public class P40 {
    public static void main(String[] args) throws IOException {
        int[] intArray = (int[]) Array.newInstance(int.class, 3);

        Array.setInt(intArray, 0, 123);
        Array.setInt(intArray, 1, 456);
        Array.setInt(intArray, 2, 789);

        System.out.println("intArray[0]: " + Array.getInt(intArray, 0));
        System.out.println("intArray[1]: " + Array.getInt(intArray, 1));
        System.out.println("intArray[2]: " + Array.getInt(intArray, 2));
    }
}
