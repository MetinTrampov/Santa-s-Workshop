public class DollFactory extends Workshop  {

    @Override
    public workshopProduct createProduct(String productName) {
        if(productName == "Кукла Барби") {
            return new ElsaDoll();
        }
        if(productName == "Кукла Елза") {
            return new BarbieDoll();
        }
        System.out.println("Неразпозната кукла");
        return null;
    }

}
