public final class BMW extends Car{

    private String condition;
    private Fuel fuel;

    public BMW() { }

    public BMW(String name, CarTypes carTypes, double volume, Colors colors, int yearOfIssue,
               String condition, Fuel fuel) {
        super(name, carTypes, volume, colors, yearOfIssue);
        this.condition = condition;
        this.fuel = fuel;
    }

    public String getInfo() {
        return "Название авто: " + super.getName() + "\n Кузов: " + super.getCarTypes()
                + "\n Объём: " + super.getVolume() + "\n Цвет: " + super.getVolume()
                + "\nГод выпуска: " + super.getYearOfIssue() + "\n Состояние: " + condition
                + "\n Вид топлива: " + fuel.getFuel();
    }

    @Override
    public void makePrice(String price, int num) {
        super.makePrice(price, num);
    }
}
