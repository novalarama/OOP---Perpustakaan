package OOP - Perpustakaan;

public class ListBuku implements List{
    Buku [] listBuku = {
        new Buku(1, "Pulang",2,80000),
        new Buku(2,"Detik-detik",4,100000),
        new Buku(3,"Bumi",2,50000),
        new Buku(4,"Si anak gembala",4,150000),
        new Buku(5,"Rumusk",5,60000),
    };
    @Override
    public void view(){
        System.out.println("--------- LIST BUKU ----------");
        System.out.println("ID \t Judul \t\t Stok");
    
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i].getIdBuku()+" \t"+
                                listBuku[i].getNamaBuku()+" \t"+
                                listBuku[i].getStok()+" \t"+
                                listBuku[i].getHarga());
           }
    }
    public int cariBuku(int id){
        int foundIndex = 0;
        // pencarian data berdasarkan id
        for (int i = 0; i < listBuku.length; i++) {
            //jika id yang dicari ditemukan
            if (listBuku[i].getIdBuku()==id) {
                foundIndex = i; // menyimpan nilai index dari data yang ditemukan
            }
        }
        return foundIndex;
    }
    
    void kurangiStok() {
        
    }
}