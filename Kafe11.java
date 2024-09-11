import java.util.Scanner;//impor library scanner

public class Kafe11 {
    public static void main(String args[]){

        boolean keanggotaan;
        int jlmkopi, jmlteh, jlmroti;
        double 
        hargakopi= 12000, 
        hargateh = 7000, 
        hargaroti= 20000;
        float diskon=10/100f; 
        double totalharga, nominalbayar;

        Scanner pilihan = new Scanner(System.in);

        System.out.print("Masukan keanggotaan(True/False) : ");
        keanggotaan = pilihan.nextBoolean();

        System.out.print("Masukan jumlah pembelian kopi : ");
        jlmkopi = pilihan.nextInt();

        System.out.print("Masukan jumlah pembelian teh : ");
        jmlteh = pilihan.nextInt();

        System.out.print("Masukan Jumlah Pembelian Roti : ");
        jlmroti = pilihan.nextInt();

        totalharga = (jmlteh*hargateh + jlmkopi*hargakopi + jlmroti*hargaroti);

        nominalbayar = totalharga - (totalharga*diskon);

        System.out.println("Keanggotaan Pelanggan : "+keanggotaan);
        System.out.println("Item Pembelian : "+jlmkopi +" kopi "+jmlteh+" Teh "+jlmroti + " roti ");
        System.out.println("Nominal Bayar Rp "+nominalbayar);




    }
    
}
