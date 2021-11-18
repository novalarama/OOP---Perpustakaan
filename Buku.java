package OOP - Perpustakaan;

public class Buku {
    private String namaBuku;
    private int idBuku,stok;
    private double harga;
    
    public Buku(int idBuku, String namaBuku, int stok, double harga){
        this.idBuku = idBuku;
        this.namaBuku = namaBuku;
        this.stok = stok;
        this.harga = harga;
    }
    public int getIdBuku(){
        return idBuku;
    }
    public String getNamaBuku(){
        return namaBuku;
    }
    public int getStok(){
        return stok;
    }
    public double getHarga(){
        return harga;
    }

    public void kurangiStok() {
        this.stok--;
    }

}