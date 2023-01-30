public class Phone extends Product implements Device, Mobile {
    //Interface Segregation Principle - применяем разные интерфейсы вместо одного
    //Dependency Inversion Principle - разделив интерфейсы нет зависимости от их общей функциональности,
    //тепер можем менять интерфейсы один на другой
    private final String name = "Телефон";
    private final int price = 100;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void enable() {
        System.out.println("Телефон в корзине");
    }

    @Override
    public void carry() {
        System.out.println("Телефон куплен");
    }
}
