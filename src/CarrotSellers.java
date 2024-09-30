import java.time.LocalDate;

public class CarrotSellers {    private LocalDate birthday;
    private int numberOfSignedContracts;
    private double totalQuantityOfCarrotSale;
    private String cityOfSellerSeat;
    private String vehicleRegistrationMark;
    private double companyVehicleConsumption;
    private String name;
    private String addressOfSeller;//created classes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressOfSeller() {
        return addressOfSeller;
    }

    public void setAddressOfSeller(String addressOfSeller) {
        this.addressOfSeller = addressOfSeller;
    }
}

