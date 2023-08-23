import java.util.Scanner;

public class girilenSayidanKucukIkininKuvvetiBulma {
    public static void main(String[] args) {
        Scanner two = new Scanner(System.in);
        int n;
        System.out.print("Sınır Sayıyı Giriniz: ");
        n = two.nextInt();
        /*for (int i = 1; i < n; i *= 2) {
            System.out.println(i);
        }*/

        int i =1;
        /*do{
            i *= 2;
            System.out.println(i);
        }while(i < n );*/

        while(i<n){
            System.out.println(i);
            i *= 2;
        }

    }
}
