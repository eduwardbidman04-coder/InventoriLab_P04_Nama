package model;

public class Barang {
    private String kode;
    private String nama;
    private int jumlahTersedia;
    
    public Barang(String kode, String nama, int jumlahTersedia){
        if (kode == null || kode.trim().isEmpty()){
            throw new IllegalArgumentException("kode barang wajib diisi.");
        }
        if(nama == null || nama.trim().isEmpty()){
            throw new IllegalArgumentException("Nama barang wajibb diisi.");
        }
        if (jumlahTersedia < 0){
            throw new IllegalArgumentException("Jumlah awal tidak boleh negatif.");
        }
        this.kode = kode.trim();
        this.nama = nama.trim();
        this.jumlahTersedia = jumlahTersedia;
    }
    public String getkode() { return kode;}
    public String getname() { return nama; }
    public int getJumlahTersedia() { return jumlahTersedia; }
        }
    
