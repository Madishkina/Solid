public class Apple extends Product implements Food {
    //класс Apple описывает только данный фрукт, к другим не имеет отношения
    private final String name = "Яблоки";
    private final int price = 80;

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
        System.out.println("Яблоки проданы");
    }
}
