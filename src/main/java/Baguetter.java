public class Baguetter extends Product implements Food {
    //Open Closed Principle - имплементируя интерфейс Food добавляем
    // классу функциональности, не изменяя его код
    private final String name = "Багет";
    private final int price = 70;

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
        System.out.println("Багет продан");
    }
}