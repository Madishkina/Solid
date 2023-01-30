public class Bread extends Product implements Food {
    private final String name = "Хлеб";
    private final int price = 30;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void sale() {
        System.out.println("Хлеб продан");
    }
}
