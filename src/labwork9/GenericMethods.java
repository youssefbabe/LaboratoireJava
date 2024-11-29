package labwork9;

import java.util.List;

public class GenericMethods {
    public static <T> void printArray(List<T> array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}