package com.todolist;
import java.util.Arrays;
public class reversearay {
    public static void main(String[] args) {
        int[] array = new int[] {3,4,6,2,8,5,9};
        Arrays.sort(array);
        mainMenu(array);
        int[] array1 = new int[array.length];
        array1 = Arrays.copyOf(array, array1.length);
        mainMenu(array1);
        for (int i = 0;i < array1.length;i++){
            array1[i] = (array1.length -1) -i;
        }
        mainMenu(array);
        mainMenu(array1);
    }
    private static void mainMenu(int[] array){
        System.out.println("Array" + Arrays.toString(array));
    }
}
