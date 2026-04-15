import java.util.Scanner;

public class Script {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // Statement 1
        System.out.println("Jurusan \nA. Teknik Informatika \nB.Tidak Valid");
        String Pilihan = "";
        System.out.print("Masukkan pilihan (A/B): ");
        Pilihan = input.nextLine();

        String Jurusan = "";
        String Nama = "";
        String Shift = "";
        
        // Statement 2
        if (Pilihan.equalsIgnoreCase("A")) {
            Jurusan = "Teknik Informatika";
            System.out.print("Masukkan Nama: ");
            Nama = input.nextLine();
            System.out.print("Masukkan Shift \n1. Reg A \n2. Reg B \n3. Reg CK \n4. Reg CS \n");
            System.out.print("Masukkan Reg (1-4): ");
            int Reg = input.nextInt();
            switch (Reg) {
                case 1:
                    Shift = "Reg A";
                    break;
                case 2:
                    Shift = "Reg B";
                    break;
                case 3:
                    Shift = "Reg CK";
                    break;
                case 4:
                    Shift = "Reg CS";
                    break;
                default:
                    Shift = "Reg A";
            }
        } else if (Pilihan.equalsIgnoreCase("B")) {
            System.out.println("Pilihan tidak valid");
            input.close();
        }
        // Statement 4
        System.out.println("Nama: " + Nama);
        System.out.println("Jurusan: " + Jurusan);
        System.out.println("Shift: " + Shift);
        
        input.close();
    }
}