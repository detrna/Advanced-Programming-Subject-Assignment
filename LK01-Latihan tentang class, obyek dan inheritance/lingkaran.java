class lingkaran extends bidangDuaDimensi{
    int radius;

    public lingkaran(String nama, int radius){
        super(nama);
        this.radius = radius;
    }

    @Override
    void luas(){
        double hasil = radius * radius * Math.PI;
        System.out.printf("Luas %s: %.2f%n", nama, hasil);
    }
}