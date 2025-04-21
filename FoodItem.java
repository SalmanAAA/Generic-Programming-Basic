public class FoodItem extends Item<Food> {
    public FoodItem(Food data) {
        super(data);
    }

    @Override
    public void ship(Food item, String fromWarehouse, String destinationAddress) {
        System.out.println("Kirim CEPATexpress makanan: " + item.toString() +
                " dari " + fromWarehouse + " ke " + destinationAddress);
    }
}