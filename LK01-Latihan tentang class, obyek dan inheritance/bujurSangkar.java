class bujurSangkar extends bidangDuaDimensi{
    int sisi;

    public bujurSangkar(String nama, int sisi){
        super(nama);
        this.sisi = sisi;
    }

    @Override
    void luas(){
        int hasil = sisi * sisi;
        System.out.println("Luas " + nama + ": " + hasil);
    }
}