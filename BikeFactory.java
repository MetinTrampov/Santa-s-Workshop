public class BikeFactory extends  Workshop {

    @Override
    public workshopProduct createProduct(String productName) {
        if(productName == "Синьо Колело") {
            return new BlueBike();
        }
        if(productName == "Зелено колело") {
            return new GreenBike();
        }else {
            System.out.println("Неразпознато колело");
            return null;
        }
    }
}
