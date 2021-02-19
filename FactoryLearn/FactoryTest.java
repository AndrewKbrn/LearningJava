public class FactoryTest{
    public static void main(String[] args) {
    Factory[] factories = {new AbstractFactory().createFactory("Car")
            ,new AbstractFactory().createFactory("Smartphone")};
        for (Factory info: factories) {
            info.getInfo();
        }
        
    Car[] cars = {new Tesla(), new Audi(), new Toyota()};
        for (Car action: cars) {
            action.drive();
        }

    Smartphone[] smartphones = {new IPhone(), new Sumsung()};
        for (Smartphone info: smartphones) {
            info.getInfo();
        }
    }
}








