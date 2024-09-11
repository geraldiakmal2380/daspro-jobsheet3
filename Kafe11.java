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

        System.out.println("value dari diskon : " +diskon);

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
        int nominalint =((int)nominalbayar);
        byte totalbyte = ((byte)nominalbayar);

        System.out.println("Keanggotaan Pelanggan : "+keanggotaan);
        System.out.println("Item Pembelian : "+jlmkopi +" kopi "+jmlteh+" Teh "+jlmroti + " roti ");
        System.out.println("Nominal Bayar Rp "+nominalbayar);
        System.out.println("Nominal Bayar(int) Rp "+nominalint);
        System.out.println("Nominal Bayar(total byte) Rp "+totalbyte);




    }
    
}
