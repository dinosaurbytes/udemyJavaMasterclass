package Section6OopPart1.ClassesPart1;

public class CarMain {
    public static void main(String[] args) {
        Car sportsCar = new Car();
        sportsCar.setModel("Lambo");
        sportsCar.setWheels(4);
        sportsCar.setEngine("V12");
        System.out.print(sportsCar.getModel() + ": ");
        sportsCar.wheelsAndEnginer();

        Car miniVan = new Car();
        miniVan.setModel("Dodge");
        miniVan.setWheels(4);
        miniVan.setEngine("V6");
        System.out.print(miniVan.getModel() + ": ");
        miniVan.wheelsAndEnginer();

    }
}
