public class Vehicle {
    private double volume;
    private Colors colors;

    public Vehicle () { }

    public Vehicle(double volume, Colors colors) {
        this.colors = colors;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public Colors getColors(){
        return colors;
    }
}
