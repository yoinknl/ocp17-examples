package review09_10;

import java.util.List;

public class Puzzle05 {

    // Which parameter type results in a working program? (Choose all that apply)
    // A. List<? extends Number> list
    // B. List<? super Number> list
    // C. List<Number> list
    // D. List<Object> list

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4);
        List<Double> doubleList = List.of(1.5, 2.5, 3.5);
        
        printNumbers(intList);
        printNumbers(doubleList);
    }
    
    public static void printNumbers(/* Complete the parameter */ list) {
        for (Number num : list) {
            System.out.print(num + " ");
        }
    }
}