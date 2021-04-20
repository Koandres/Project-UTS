package UTS;
import java.util.Scanner;
public class No3 {
    public static void main (String[] args){
        int i, j, k, l, m, n, o, p;
        int matriksA[][]= new int[2][3];
        int matriksB[][]= new int[3][2];
        int transposeA[][] = new int[3][2];
        int transposeB[][] = new int[2][3];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah baris matriks A: ");
        m = scan.nextInt();
        System.out.print("Masukan jumlah kolom matriks A: ");
        n = scan.nextInt();
        System.out.println("Masukan elemen matriks A: ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                matriksA[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks A: ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print(matriksA[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                transposeA[j][i] = matriksA[i][j];
            }
        }
        System.out.println("Hasil transpose matriks A: ");
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                System.out.print(transposeA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Masukan jumlah baris matriks B: ");
        o = scan.nextInt();
        System.out.print("Masukan jumlah kolom matriks B: ");
        p = scan.nextInt();
        System.out.println("Masukan elemen matriks B: ");
        for(k = 0; k < o; k++){
            for(l = 0; l < p; l++){
                matriksB[k][l] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks B: ");
        for(k = 0; k < o; k++){
            for(l = 0; l < p; l++){
                System.out.print(matriksB[k][l] + "\t");
            }
            System.out.println();
        }
        for (k = 0; k < o; k++){
            for (l = 0; l < p; l++){
                transposeB[l][k] = matriksB[k][l];
            }
        }
        System.out.println("Hasil transpose matriks B: ");
        for(k = 0; k < p; k++){
            for(l = 0; l < o; l++){
                System.out.print(transposeB[k][l] + "\t");
            }
            System.out.println();
        }
    }
}
