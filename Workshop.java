public  abstract  class Workshop {

    public abstract workshopProduct createProduct(String productName);


    public workshopProduct produceProduct(String productName) {
        workshopProduct product = createProduct(productName);
        product.prepare();
        return product;
    }
}
