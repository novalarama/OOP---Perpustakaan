package OOP - Perpustakaan;

public class Siswa extends Person{
    private int idSiswa;
    private boolean status;
    
    public Siswa(int idSiswa, String nama, String alamat, String telepon, boolean status){
        super(nama, alamat, telepon);
        this.idSiswa = idSiswa;
        this.status = status;
    }

   
    public int getIdSiswa(){
        return idSiswa;
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
    public void changeStatus(){
        this.status =!this.status;
    }
    public String getStatus(){
        if (status) {
            return "Buku sudah dikembalikan";
        }else{
            return "Buku masih dipinjam";
        }
    }
    public boolean isStatus(){
        return status;
    }
}