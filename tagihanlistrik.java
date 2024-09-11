import java.util.Scanner;

public class tagihanlistrik {
    public static void main(String[] args) {
        double penggunaanlistrik,tagihan;
        int userinput;
        Scanner inputan = new Scanner(System.in);

    System.out.print("Masukan penggunaan listrik dalam kWh :");
    penggunaanlistrik = inputan.nextDouble();
    tagihan = penggunaanlistrik*1500;
    if (penggunaanlistrik <= 500) {
            System.out.println("penggunaan listrik tidak melebihi 500 kWh");
            System.out.println("Tagihan listrik anda adalah Rp "+tagihan);
    }
    else{  
             
            System.out.println("penggunaan listrik melebihi 500 kWh");
            System.out.println("Tagihan listrik anda adalah Rp "+tagihan); 
            }     
        }
    }
                    
   
