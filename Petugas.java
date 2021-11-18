package OOP - Perpustakaan;
public class Petugas extends Person{
    private int idPetugas;
    
    public Petugas(int idPetugas, String nama, String alamat, String telepon){
        super(nama, alamat, telepon);
        this.idPetugas = idPetugas;
    }
    //implementasi enkapsulasi, membuat method utk mengakses data private "idPetugas"
    public int getIdPetugas(){
        return idPetugas;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getTelepon(){
        return telepon;
    }
}