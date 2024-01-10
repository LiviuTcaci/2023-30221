package ro.utcn;

public class Device {
    private String BrandName;
    private double price;
    private String currency;
    public void powerOn(){
        System.out.println("Powering on...");
    }
    public String getBrandName() {
        return BrandName;
    }
    public void setBrandName(String brandName) {
        this.BrandName = brandName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    //Suprascriere metoda
    public String getExtraData(){
        return "Extra data from device";
    }

}
