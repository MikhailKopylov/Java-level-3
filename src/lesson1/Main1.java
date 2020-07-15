package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        task1();

        task2();
    }


    private static void task1() {
        String[] strings = new String[]{"one", "two", "three", "for", "five"};
        String[] list = changeElements(strings, 1, 3);
        System.out.println(Arrays.toString(list));
    }

    public static <T> T[] changeElements(T[] list, int indexFirstElement, int indexSecondElement) {
        T tempElement = list[indexFirstElement];
        list[indexFirstElement] = list[indexSecondElement];
        list[indexSecondElement] = tempElement;
        return list;
    }

    private static void task2() {
        List<Integer> list = convertArrayToList(1, 2, 3, 5, 7);
        System.out.println(list);

        List<String> stringList = convertArrayToList("step", "run", "jump");
        System.out.println(stringList);
    }

    public static <T> List<T> convertArrayToList(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }
}

