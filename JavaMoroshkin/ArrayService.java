package JavaMoroshkin;
public class ArrayService {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr)
            if (i % 2 == 0)
                System.out.print( i+ ",");

    }
}
