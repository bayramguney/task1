public class Car {
    public String name;
    public String color;
    public double engine;
    public int door;
    public String origin;

    public double totalWeightOfTheCar() {
        return engine * door;
    }

    public String toString() {
        String output = "";
        output += "Name : " + name + "\n";
        output += "Engine : " + engine + "\n";
        output += "Color  : " + color + "\n";
        output += "Door : " + door + "\n";
        output += "Origin : " + origin + "\n";
        output += "Average car weight :" + totalWeightOfTheCar() + "\n";
        return output;


    }

    public static class Carmain {
        public static void main(String[] args) {

            Car vehicle = new Car();
            vehicle.name = "Bmw";
            vehicle.color = "Green";
            vehicle.origin = "Germany";
            vehicle.door = 4;
            vehicle.engine=2.8;


            double weightOfCase = vehicle.totalWeightOfTheCar();
            System.out.println("Car weigth : " + weightOfCase);
            System.out.println("---------------------");
            String output = vehicle.toString();
            System.out.println(output);

        }
    }
}