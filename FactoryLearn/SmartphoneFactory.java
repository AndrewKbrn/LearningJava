public class SmartphoneFactory implements Factory{
    public Smartphone createSmartphone(String smartphoneModel){
        return switch (smartphoneModel){
            case "IPhone" -> new IPhone();
            case "Sumsung" -> new Sumsung();
            default -> null;
        };
    }

    @Override
    public void getInfo() {
        System.out.println("We make smartphones");
    }
}
