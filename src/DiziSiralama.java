import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        int n;

        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n=input.nextInt();

        int[] list=new int[n];
        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i=0;i<n;i++){
            System.out.print((i+1)+". Elemanı : ");
            list[i]=input.nextInt();
        }

        Arrays.sort(list);

        System.out.print("Sıralama : ");
        for(int value:list){
            System.out.print(value+" ");
        }
    }
}
