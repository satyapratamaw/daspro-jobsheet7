import java.util.Scanner;
public class ModifikasiSiakadFor26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa :");
        int jumlah =  sc.nextInt();
        int tertinggi = 0;
        int terendah = 100;
        int lulus = 0;
        int tidakLulus = 100;

        for (int i = 1; i <= jumlah; i++ ) {
            System.out.println("Masukkan nila mahasiswa ke-" + i + ": ");
            int nilai = sc.nextInt();
            
            if(nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            }
            else{
                tidakLulus++;
            }
            System.out.println("Nilai tertinggi :" + tertinggi);
            System.out.println("Nilai terendah :" + terendah);
            System.out.println("Mahasiswa lulus :" + lulus);
            System.out.println("Mahasiswa tidak lulus :" + tidakLulus);
        }
    }
}
