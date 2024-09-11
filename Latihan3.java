import java.util.Scanner;
class Latihan3 {
    public static void main(String[] args) {
        double upah_kerja,jam_kerja,totaluangNopajakNobonus;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("Masukan total jam kerja per hari karyawan: ");
        jam_kerja = inputan.nextDouble();
        
        System.out.println("Masukan total upah kerja: ");
        
        upah_kerja = inputan.nextDouble();
        
        totaluangNopajakNobonus = jam_kerja*upah_kerja ;
        
        System.out.println("Total dari gaji karyawan per bulan adalah Rp "+totaluangNopajakNobonus);
    }
}