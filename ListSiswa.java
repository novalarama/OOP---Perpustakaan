package OOP - Perpustakaan;

public class ListSiswa implements List{
    Siswa [] listSiswa = {
        new Siswa(1, "Joko","Malang","817387897371",true),
        new Siswa(2, "Santi","Surabaya","87281778178",true),
        new Siswa(3, "Wulan","Blitar","38329828423",true)
    };
    
    @Override
    public void view(){
        System.out.println("---------- LIST SISWA ----------");
        System.out.println("ID \t Nama \t\t Alamat \t\t Nomor \t\t Status \t");
        
        for (int i = 0; i < listSiswa.length; i++) {
            System.out.println(listSiswa[i].getIdSiswa()+" \t"+
                               listSiswa[i].getNama()+" \t"+
                               listSiswa[i].getAlamat()+" \t"+
                               listSiswa[i].getTelepon()+" \t"+
                               listSiswa[i].getStatus());
        }
    }
    public int cariSiswa(int id){
        int foundIndex = 0;
        
        for (int i = 0; i < listSiswa.length; i++) {
            if (listSiswa[i].getIdSiswa()==i) {
                foundIndex = i;
            }
        }
        return foundIndex;
    }
}