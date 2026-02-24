public class App {
    public static void main(String[] args) {
        bidangDuaDimensi bujurSangkar1 = new bujurSangkar("Bujur Sangkar 1", 4);
        bidangDuaDimensi lingkaran1 = new lingkaran("Lingkaran 1", 4);

        bujurSangkar1.luas();
        bujurSangkar1.info();

        lingkaran1.luas();
        lingkaran1.info();
    }
}
