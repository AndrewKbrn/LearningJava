public class FactoryTest{
    public static void main(String[] args) {
        FactoryCar factoryCar = new FactoryCar();
        Car toyota = factoryCar.create("Toyota");
        Car audi = factoryCar.create("Audi");
        Car tesla = factoryCar.create("Tesla");
        toyota.drive();
        audi.drive();
        tesla.drive();
    }
}
interface Car{
    void drive();
}

class FactoryCar{
    public Car create(String carMark){
        switch (carMark){
            case "Audi":
                return new Audi();
            case "Toyota":
                return new Toyota();
            case "Tesla":
                return new Tesla();
            default: return null;
        }
    }
}
class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Tesla implements Car{

    @Override
    public void drive() {
        System.out.println("drive Tesla");
    }
}