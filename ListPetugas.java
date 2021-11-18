package OOP - Perpustakaan;

public class ListPetugas implements List{
    // pemberian nilai pada array "list" dengan tipe class Petugas
    Petugas[] list = {
      new Petugas(1, "Akbar", "Jakarta", "089911817771"),
      new Petugas(2, "Rama", "Malang", "0887611445221"),
      new Petugas(3, "Krisna", "Jakarta", "086766651121")
    };
    
    // method untuk menampilkan data list petugas
    @Override
    public void view(){
        System.out.println("---------- LIST PETUGAS ----------");
        System.out.println("ID \t Nama \t Alamat \t Jabatan");
        // membuat perulangan
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdPetugas()+" \t "
            + list[i].getNama()+ " \t "
            + list[i].getAlamat() + " \t "
            + list[i].getTelepon());
            
        }
    }
    
    //membuat method untuk mencari data petugas
    public int cariPetugas(int id){
        int foundIndex = 0;
        // pencarian data berdasarkan id
        for (int i = 0; i < list.length; i++) {
            // jika id yang dicari ditemukan
            if (list[i].getIdPetugas()==id) {
                foundIndex = i; // menyimpan nilai index dari data yang ditemukan
            }
        }
        return foundIndex;
    }
}