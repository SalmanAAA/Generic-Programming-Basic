public class ElectronicItem extends Item<Electronic> {
    public ElectronicItem(Electronic data) {
        super(data);
    }

    @Override
    public void ship(Electronic item, String fromWarehouse, String destinationAddress) {
        System.out.println("Kirim AMANexpress elektronik: " + item.toString() +
                " dari " + fromWarehouse + " ke " + destinationAddress);
    }
}