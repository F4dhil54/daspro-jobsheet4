import java.util.Scanner;

public class PemilihanBilangan04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========MENCARI ANGKA GENAP DAN GANJIL==========");

        System.out.println("masukan sebuah angka : ");
        int angka = sc.nextInt();\
        
        if(angka % 2 == 0){
            System.out.println("angka " + angka + "Termasuk bilangan genap");
        } else {
            System.out.println("angka " + angka + " Termasuk bilangan ganjil");
        }
    }
}

        // String hasil = (angka % 2 == 0) ? "adalah angka genap " : "adalah angka ganjil";
        // System.out.println("angka" + angka + hasil);
