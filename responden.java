import java.util.Scanner;

public class responden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
    int[][] responden = new int[3][2];
   int[] jumlah_per_responden = new int[2];
   int[] jumlah_per_pertanyaan = new int[3];
   int total = 0;
    for(int i=0; i<responden.length; i++){
        System.out.println(" RESPONDEN KE-"+(i+1));
        for(int j=0; j<responden[i].length; j++){
            System.out.print("MASUKAN JAWABAN PERTANYAAN KE-"+(j+1)+"(1-5)"+" = ");
            responden[i][j] = input.nextInt();

            jumlah_per_responden[j] += responden[i][j]; 
            jumlah_per_pertanyaan[i] += responden[i][j];
            total += responden[i][j];

        }
     }
     for(int i=0; i<responden.length; i++){
        double rata_responden = (double)jumlah_per_responden[i] / responden[i].length;
        System.out.println("RATA-RATA RESPONDEN KE-"+(i+1)+" = "+rata_responden);
       }
       for(int j=0; j<responden[j].length; j++){
        double rata_pertanyaan = (double)jumlah_per_pertanyaan[j] / responden.length;
        System.out.println("RATA-RATA PERTANYAAN KE-"+(j+1)+" = "+rata_pertanyaan);
       }

       double rata_keseluruhan = (double) total / (responden.length * responden[0].length);
       System.out.println("RATA-RATA KESELURUHAN = "+rata_keseluruhan);

     
}}
