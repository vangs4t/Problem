import java.util.Arrays;
import java.util.Scanner;
//mencari nilai terkecil dalam array
public class Nilai {
    public static void main(String[] args){
        nilaiTerkecil();
    }
    public static void nilaiTerkecil(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah element array");
        int length = input.nextInt();
        int[] array1 = new int[length];
        System.out.println("Masukan element array");
        for (int i = 0;i < length;i++){
            array1[i] = input.nextInt();
        }
        for (int j = 0;j < length;j++){
            System.out.print("");
        }
        System.out.println(Arrays.toString(array1));
        input.close();
        int[] array2 = Arrays.copyOf(array1, array1.length);
        Arrays.sort(array2);
        System.out.println("Nilai terkecil nya adalah");
        System.out.println(array2[0]);

    }
}
