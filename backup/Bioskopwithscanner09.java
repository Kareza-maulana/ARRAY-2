
import java.util.Scanner;

public class Bioskopwithscanner09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, kursi = 0;
        String nama, next;
        String penonton[][] = new String[2][3];
        boolean kursi_kosong= false;
        while(true){
        while (!kursi_kosong) {
            System.out.println("masukan nama penonton");
            nama = input.next();
            System.out.println("masukan baris");
            baris = input.nextInt();
            System.out.println("masukan kolom");
            kolom = input.nextInt();
            
            if(baris < 1 || kolom <1 || baris > penonton.length || kolom > penonton[0].length){
                System.out.println("maaf kursi yang anda pilih tidak tersedia");
                continue;}

             if (penonton[baris-1][kolom-1]==null){
                penonton[baris - 1][kolom - 1] = nama;
                kursi++;
            } else {
                System.out.println("maaf kursi sudah terisi, silahkan pilih kursi lain");
                
            }

             if ( kursi == penonton.length * penonton[0].length ) {
                System.out.println("===kursi telah terisi penuh===");
                break;
            }
           
           
        }

        System.out.println("apakah anda ingin melihat data penonton? (ya/tidak)");
        next = input.next();
        if (next.equalsIgnoreCase("ya")) {
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.print("****");
                    } else {
                    System.out.print(penonton[i][j] + "\t");
                    }
                }

                System.out.println();
            }
        }

        System.out.println("apakah anda ingin keluar? (ya/tidak)");
        next = input.next();
        if (next.equalsIgnoreCase("ya")) {
            System.out.println("terima kasih telah menggunakan program ini");

        }
    }

}}
