# Bioskop Ticket Booking System

Aplikasi berbasis **CLI (Command Line Interface)** yang ditulis menggunakan bahasa Java untuk merepresentasikan sistem pemesanan tiket bioskop sederhana. Program ini merupakan bagian dari tugas Pemrograman 1 (Pertemuan 7).

## 📌 Flow & System Architecture

Program interaktif ini dirancang menggunakan struktur kontrol flow dasar di Java, yaitu **Nested If-Else** yang dipadukan dengan **Switch-Case**.

Berikut adalah rancangannya:

1. **Main Menu**
   - Saat program dijalankan, pengguna akan disajikan menu utama:
     - `A. Pesan Tiket`
     - `B. Batal`
   - Program meminta *input* dari pengguna (`A` atau `B`).
   
2. **Conditional Logic based on Input**
   - **Jika pengguna memilih `A` (Pesan Tiket):**
     - Program memanggil metode `nextLine()` untuk menerima *input String* berupa nama penonton.
     - Selanjutnya, program akan menampilkan daftar pilihan 4 tipe studio:
       1. Studio Reguler
       2. Studio Premiere
       3. Studio IMAX
       4. Studio 4DX
     - Pengguna memasukkan *input Integer* (`1-4`) melalui pemanggilan `nextInt()`.
     - Menggunakan blok `switch-case`, program akan mapping tipe studio sesuai angka *input* (Dengan blok `default` ke Reguler untuk *error handling* ringan jika angka di luar rentang).
   - **Jika pengguna memilih `B` (Batal):**
     - Program mem-print `Pilihan tidak valid / Dibatalkan` dan akan langsung melewati alur pemesanan dengan memanggil metode `close()`.

3. **Output Summary**
   - Setelah selesai melakukan pengisian nilai *variables*, program akan mencetak "Struk Tiket" (Output).
   - *Variables* yang di-print di akhir adalah:
     - Nama Penonton
     - Status Pemesanan
     - Tipe Studio

## 🛠️ Environment Requirements
- **Java Development Kit (JDK)** 8 atau yang lebih baru.
- **Scanner Class** dari package `java.util.Scanner`.

## 🚀 How to Run

1. Buka **Terminal** atau **Command Prompt** ke dalam *directory* di mana file `BookingTicket.java` berada.
2. Compile file `.java` tersebut menggunakan perintah *compiler*:
   ```bash
   javac BookingTicket.java
   ```
3. Run atau eksekusi *bytecode* yang telah di-compile:
   ```bash
   java BookingTicket
   ```
4. Ikuti instruksi pada layar *console* dengan memberikan *input* berformat *String* atau *Integer*.

## 📝 Learning References
Program ini mengaplikasikan konsep fundamental dalam Java:
- Menggunakan `Scanner` object untuk memproses **System Input** (Standard Input Stream `System.in`).
- Menggunakan skema flow control **If-Else if** dan struktur percabangan **Switch-Case** yang dilengkapi `break;`.
- Mengikuti standar konvensi *naming* Java seperti **camelCase** untuk *variable* dan **PascalCase** untuk nama *Class*.
