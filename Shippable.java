public interface Shippable<T> {
    void ship(T item, String fromWareHouse, String destinationAddress);
}
