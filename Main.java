public class Main {
    public static void main(String[] args) {
        // Data barang
        Food borax = new Food("Bakso Borax");
        Electronic hp = new Electronic("HP Xiaomi 15");

        // Objek kurir untuk barang
        FoodItem kirimanMie = new FoodItem(borax);
        ElectronicItem kirimanHp = new ElectronicItem(hp);

        // Proses pengiriman
        kirimanMie.ship(borax, "Cakung DC", "Bandung, Jawa Barat");
        kirimanHp.ship(hp, "Gudang Utama Jakarta", "Padang, Sumatera Barat");
    }
}
