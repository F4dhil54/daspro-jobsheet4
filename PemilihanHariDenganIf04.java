import java.util.Scanner;

public class PemilihanHariDenganIf04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Angka Hari");
        int angka = sc.nextInt();

        String hasil;

        if(angka <= 5) {
            hasil = "weekday";
        } else if (angka <=7) {
            hasil = "weekend";
        } else {
            hasil = "invalid number";
        }
        
        System.out.println("Angka : " + angka + " is a " + hasil);

    }
}
