public class CarFactory implements Factory {
    public Car createCar(String carMark){
        return switch (carMark) {
            case "Audi" -> new Audi();
            case "Toyota" -> new Toyota();
            case "Tesla" -> new Tesla();
            default -> null;
        };
    }

    @Override
    public void getInfo() {
        System.out.println("We make cars");
    }
}