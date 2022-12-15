package OperacoesPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sand {

    public static String[] removeElement(String[] arr, String item) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.remove(item);
        return list.toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        String item = "C";
 
        arr = removeElement(arr, item);
        System.out.println(Arrays.toString(arr));
    }
}
