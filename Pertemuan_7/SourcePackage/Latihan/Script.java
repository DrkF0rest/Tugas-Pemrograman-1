import java.util.Scanner;

public class Script {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Statement 1
        System.out.println("Jurusan \nA. Teknik Informatika \nB. Tidak Valid");
        
        String pilihan = "";
        System.out.print("Masukkan pilihan (A/B): ");
        pilihan = input.nextLine();

        String jurusan = "";
        String nama = "";
        String shift = "";
        
        // Statement 2
        if (pilihan.equalsIgnoreCase("A")) {
            jurusan = "Teknik Informatika";
            
            System.out.print("Masukkan Nama: ");
            nama = input.nextLine();
            
            System.out.print("Masukkan Shift \n1. Reg A \n2. Reg B \n3. Reg CK \n4. Reg CS \n");
            System.out.print("Masukkan Reg (1-4): ");
            int reg = input.nextInt();
            
            switch (reg) {
                case 1:
                    shift = "Reg A";
                    break;
                case 2:
                    shift = "Reg B";
                    break;
                case 3:
                    shift = "Reg CK";
                    break;
                case 4:
                    shift = "Reg CS";
                    break;
                default:
                    shift = "Reg A";
                    break;
            }
        } else if (pilihan.equalsIgnoreCase("B")) {
            System.out.println("Pilihan tidak valid");
            input.close();
        }
        
        // Statement 4
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Shift: " + shift);
        
        input.close();
    }
}