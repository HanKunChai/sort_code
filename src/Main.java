import java.util.Scanner;
import sort.*;

public class Main {
    public static int[] data = {2,1,5,6,7,4,9,6,8,4,1};
    private static Scanner stdin = new Scanner(System.in);
    public static void main(String[] args){
        buble_sort sort1 = new buble_sort();
        Select_sort sort2 = new Select_sort();
        Insertion_Sort sort3 = new Insertion_Sort();
        Shell_Sort sort4 = new Shell_Sort();
        Merge_sort sort5 = new Merge_sort();
        System.out.print("[");
        for (int value: data) System.out.print(value+" ");
        System.out.print("]"+"\n");
        sort5.sort(data);
        System.out.print("[");
        for (int value: data) System.out.print(value+" ");
        System.out.print("]"+"\n");

    }
}
