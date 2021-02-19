public class AbstractFactory {
    public Factory createFactory(String typeOfFactory){
        return switch (typeOfFactory){
            case "Car" -> new CarFactory();
            case "Smartphone" -> new SmartphoneFactory();
            default -> null;
        };
    }
}
