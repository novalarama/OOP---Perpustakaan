package OOP - Perpustakaan;

/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class Peminjaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        // membuat variabel untuk menampung data inputan
        String key;
    
        // membuat boolean untuk mengecek program berjalan
        boolean stay = true;
    
        //pembuatan object yg berisi daftar buku
        ListBuku listBuku = new ListBuku();
        
        //pembuatan object yg berisi daftar siswa
        ListSiswa listSiswa = new ListSiswa();
    
        //pembuatan object yg berisi daftar petugas
        ListPetugas listPetugas = new ListPetugas();
    
        while (stay) {            
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------");
            System.out.println(" ");
            System.out.println("+====-------------- Perpustakaan  -------------====+");
            System.out.println("1. List Siswa");
            System.out.println("2. List Petugas");
            System.out.println("3. List Buku");
            System.out.println("4. Peminjaman");
            System.out.println("5. exit");
            System.out.print("Pilih menu: ");
            int menu=input.nextInt();
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------");
            System.out.println(" ");
            
            if (menu == 1) {
                listSiswa.view();
                System.out.print("Press any key and enter...");
                key = input.next();
            } else if(menu == 2) {
                listPetugas.view();
                System.out.print("Press any key and enter...");
                key = input.next();
            } else if (menu == 3){
                listBuku.view();
                System.out.print("Press any key and enter...");
                key = input.next();
            } else if (menu == 4){
                System.out.println("--------- PERPUSTAKAAN ----------"); System.out.println(" ");
                // menyiapkan variabel slected
                int selectedIDPetugas, selectedIDSiswa, selectedIDBuku;
                
                 // menampilkan daftar petugas, masyarakat, barang
                listPetugas.view(); System.out.println(" ");
                listSiswa.view(); System.out.println(" ");
                listBuku.view(); System.out.println(" ");
                
                // input untuk Petugas
                System.out.print("Masukkan ID Petugas \t: ");
                selectedIDPetugas = input.nextInt();
                // "foundIndex" menyimpan posisi index
                int foundIndex = listPetugas.cariPetugas(selectedIDPetugas);
                // "selectedPetugas" menyimpan data
                Petugas selectedPetugas = listPetugas.list[foundIndex];
                
                // input untuk Siswa
                System.out.print("Masukan ID Siswa \t: ");
                selectedIDSiswa= input.nextInt();
                // "foundIndex" menyimpan posisi index
                foundIndex = listSiswa.cariSiswa(selectedIDSiswa);
                // "selectedMasyarakat" menyimpan data
                Siswa selectedSiswa = listSiswa.listSiswa[foundIndex];
                
                // Logika percabangan, jika true --> lanjut
                if (selectedSiswa.isStatus()) {
                    //proses perubahan status siswa
                    listSiswa.listSiswa[foundIndex].changeStatus();
                            
                    //menampilkan data buku
                    listBuku.view();

                    System.out.print("Pilih ID buku yang dipinjam: ");
                    selectedIDBuku = input.nextInt();
                    foundIndex = listBuku.cariBuku(selectedIDBuku);

                    //"selectedBuku" menyimpan data client yg dipilih
                    Buku selectedBuku = listBuku.listBuku[foundIndex];

                    System.out.println("--- List Peminjaman ---");
                    System.out.println("Judul Buku: " + selectedBuku.getNamaBuku());
                    System.out.println("Peminjam: " + selectedSiswa.getNama());

                    //proses pengurangan stok
                    listBuku.listBuku[foundIndex].kurangiStok();
                    listBuku.view();
                    
                    
                } else {
                    System.out.println("Maaf anda masih punya tanggungan buku");
                }
                
                System.out.println("Press any key and enter...");
                key = input.next();
                
            } else if(menu == 5){
                //variabel "stay" diset false menyebabkan program berhenti
                stay = false;
            }
        }
    }
    
       
}