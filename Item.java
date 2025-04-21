public class Item<T> implements Shippable<T> {
    private T data;

    public Item(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public void ship(T item, String fromWarehouse, String destinationAddress) {
        System.out.println("Mengirim " + item.toString() + " dari " +
                fromWarehouse + " ke " + destinationAddress);
    }
}
