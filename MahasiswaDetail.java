public class MahasiswaDetail extends Mahasiswa{
    protected String jurusan;
    protected String matkulles;
    protected int angkatan;
    
    public int getAngkatan(){
        return this.angkatan;
    }
    public void setAngkatan(int angkatan){
        this.angkatan = angkatan;
    }
    public String getMatkulles(){
        return this.matkulles;
    }
    public void setMatkulles(String matkulles){
        this.matkulles = matkulles;
    }
    public int getAngkatan(String id){
        String sAngkatan = id.substring(0,4);
        int iAngkatan = Integer.parseInt(sAngkatan);
        setAngkatan(iAngkatan);
        return iAngkatan;
    }
    ///INI DIEDIT YA SEYENG
    //ID = nomer induk mahasiswa, kalo kampusku kan 201624,201625, 201626
    //kamu ganti sesuai idnya mahasiswa dikampusmu
    public String getJurusan(String id){
        String temp = id.substring(4,6);//ini kalo aku dua angka terakhir jadinya 4, 6
        int iTemp = Integer.parseInt(temp);
        
        if(iTemp==25){
            return "Teknik Informatika";
        }
        else if(iTemp==24){
            return "Jurusan lain";
        }
        return null;
    }

    public int getBiayaLes(String id){
        int angkatan = getAngkatan(id);
        if(angkatan == 2016){
            return 130000;
        }
        else if(angkatan == 2017){
            return 140000;    
        }
        else if(angkatan == 2018){
            return 150000;
        }
        return 0;
    }
    public String datadiri(String id, String nama){
        return "Selamat! Mahasiswa "+nama+" dengan id "+id+" telah terdaftar";
    }
}
