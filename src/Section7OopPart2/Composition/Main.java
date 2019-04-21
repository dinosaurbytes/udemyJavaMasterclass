package Section7OopPart2.Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "120V", dimensions);


        Monitor theMonitor = new Monitor("27inch", "acer", 27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor,theMotherboard);
        thePC.getMonitor().drawPixelAt(1500,1200,"blue");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        //thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedRoom = new Bedroom("Brian", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.getLamp().turnOn();
        bedRoom.makeBed();


    }
}
