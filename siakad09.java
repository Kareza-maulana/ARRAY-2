import java.util.Scanner;

public class siakad09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====MASUKAN JUMLAH MAHASISWA ");
        int jumlahMhs = input.nextInt();
        System.out.println("====MASUKAN JUMLAH MATA KULIAH ");
        int jumlahMatkul = input.nextInt();
        int [][] nilaiMhs= new int[jumlahMhs][jumlahMatkul];
        int nilai_permhs = 0;
        System.out.println("===input nilai mahasiswa=== ");
        for (int i=0 ; i<nilaiMhs.length; i++){
            System.out.println("masukan nilai mahasiswa ke "+(i+1));
            for (int j=0 ; j<nilaiMhs[i].length; j++){
                System.out.print("nilai mata kuliah ke "+(j+1)+" : ");
                nilaiMhs[i][j]= input.nextInt();
                 nilai_permhs += nilaiMhs[i][j];

            }
            System.out.println("rata rata nilai mahasiswa ke "+(i+1)+" adalah : "+(nilai_permhs/nilaiMhs[i].length));
        }
        System.out.println("===RATA RATA NILAI MATA KULIAH=== ");
        for (int j=0 ; j<nilaiMhs[0].length; j++){
            int nilai_permatkul = 0;
            for (int i=0 ; i<nilaiMhs.length; i++){
                nilai_permatkul += nilaiMhs[i][j];
            }
            System.out.println("rata rata nilai mata kuliah ke "+(j+1)+" adalah : "+(nilai_permatkul/nilaiMhs.length));
        }  



       
    }
    
}
