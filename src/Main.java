import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Porsche 911", CarTypes.COUPE, 3.5, Colors.SILVER, 1993);
        System.out.println(car1.getInfo());
        car1.makePrice("Очень высокая стоимость!!!");
        System.out.println("************************************");

        BMW bmw3 = new BMW("BMW 3i", CarTypes.COUPE, 2.5, Colors.SILVER, 2015,
                "Б/у", new Fuel("Бензин"));
        System.out.println(bmw3.getInfo());
        bmw3.makePrice("Нормальная цена.");
        System.out.println("************************************");

        BMW bmw5 = new BMW("BMW 530", CarTypes.SEDAN, 3.0, Colors.BLACK, 2020,
                "Новый", new Fuel("Дизель"));
        System.out.println(bmw5.getInfo());
        bmw3.makePrice("Высокая цена.", 2);
        System.out.println("************************************");
    }
}
