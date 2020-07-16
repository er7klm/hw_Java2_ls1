public class Car extends Vehicle {
    private String name;
    private CarTypes carTypes;
    private int yearOfIssue;

    public Car() { }

    public Car(String name, CarTypes carTypes, double volume, Colors colors, int yearOfIssue) {
        super(volume, colors);
        this.name = name;
        this.carTypes = carTypes;
        this.yearOfIssue = yearOfIssue;
    }

    public CarTypes getCarTypes() {
        return carTypes;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getName() {
        return name;
    }

    public void makePrice(String price, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(price);
        }
    }

    public final void makePrice(String price) { System.out.println(price); }

    public String getInfo(){
        return "Название авто: " + name + "\n Кузов: " + carTypes + "\n Объём: " + super.getVolume()
                + "\n Цвет: " + super.getColors() + "\nГод выпуска: " + yearOfIssue;
    }

}
