package UTS;
public class No1 {
    public static void ShellSort(int[]arr){
        int n=arr.length;
        int C,M;
        int jarak,i,j,kondisi;
        boolean Sudah=true;
        int temp;
        C=0;
        M=0;
        jarak=n;
        while (jarak>=1){
            jarak=jarak/2;
            Sudah = true;
            while(Sudah){
                Sudah=false;
                for(j=0;j<n-jarak;j++){
                    i=j+jarak;
                    C++;
                    if(arr[j]>arr[i]){
                        temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        Sudah=true;
                    }
                }
            }
        }
    }    
    public static void tampil(int data[]){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void search(int [] A){
        int Data = 8;
        int batasawal = 0;
        int batasakhir = A.length -1;
        int ketemu = 0;
        int point = 0;
        while ((batasawal<=batasakhir)&&(ketemu ==0)){
            point = (batasawal+batasakhir)/2;
            System.out.println("Indeks Pointer : " + point);
            if (A[point]==Data){
                ketemu = 1;
                
            }else{
                if (Data < A[point]){
                    System.out.println("Cari di kiri");
                    batasakhir = point -1;
                }else{
                    System.out.println("Cari di kanan");
                    batasawal = point + 1;
                }
            }
        }
        if(ketemu ==1){
            System.out.println("Data "+Data+" telah ditemukan pada indeks ke "+point);
            System.out.println("kesimpulan : data ditemukan");
        }else{
            System.out.println("kesimpulan : data tidak ditemukan");
        }
      
    }
    
    public static void main(String[]args){
        int A[]={3, 10, 4, 2, 8, 13};
        No1.tampil(A);
        No1.ShellSort(A);
        No1.tampil(A);
        No1.search(A);
    }
}
