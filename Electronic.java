public class Electronic {
    private String model;

    public Electronic(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Elektronik: " + model;
    }
}