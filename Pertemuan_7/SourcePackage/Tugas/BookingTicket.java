import java.util.Scanner;

public class BookingTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Statement 1
        System.out.println("Sistem Pemesanan Tiket Bioskop \nA. Pesan Tiket \nB. Batal");
        
        String pilihan = "";
        System.out.print("Masukkan pilihan (A/B): ");
        pilihan = input.nextLine();

        String statusPemesanan = "";
        String namaPenonton = "";
        String jenisStudio = "";
        
        // Statement 2
        if (pilihan.equalsIgnoreCase("A")) {
            statusPemesanan = "Pesan Tiket";
            
            System.out.print("Masukkan Nama Penonton: ");
            namaPenonton = input.nextLine();
            
            System.out.print("Pilih Tipe Studio \n1. Studio Reguler \n2. Studio Premiere \n3. Studio IMAX \n4. Studio 4DX \n");
            System.out.print("Masukkan Pilihan (1-4): ");
            
            int pilihanStudio = input.nextInt();
            switch (pilihanStudio) {
                case 1:
                    jenisStudio = "Studio Reguler";
                    break;
                case 2:
                    jenisStudio = "Studio Premiere";
                    break;
                case 3:
                    jenisStudio = "Studio IMAX";
                    break;
                case 4:
                    jenisStudio = "Studio 4DX";
                    break;
                default:
                    jenisStudio = "Studio Reguler (Default)";
                    break;
            }
        } else if (pilihan.equalsIgnoreCase("B")) {
            System.out.println("Pilihan tidak valid / Dibatalkan");
            input.close();
        }
        
        // Statement 4
        System.out.println("\n--- Struk Tiket ---");
        System.out.println("Nama Penonton   : " + namaPenonton);
        System.out.println("Status          : " + statusPemesanan);
        System.out.println("Tipe Studio     : " + jenisStudio);
        System.out.println("-------------------");
        
        input.close();
    }
}
