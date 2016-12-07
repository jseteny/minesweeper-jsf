package hu.tigra.jee.model;

public class Car {
    private final String Id;
    private final String Brand;
    private final int Year;
    private final String Color;
    private final int Price;
    private final boolean SoldState;

    public Car(String Id, String Brand, int Year, String Color, int Price, boolean SoldState) {

        this.Id = Id;
        this.Brand = Brand;
        this.Year = Year;
        this.Color = Color;
        this.Price = Price;
        this.SoldState = SoldState;
    }

    public int cell(int n) {
        return n;
    }

    public String getId() {
        return Id;
    }

    public String getBrand() {
        return Brand;
    }

    public int getYear() {
        return Year;
    }

    public String getColor() {
        return Color;
    }

    public int getPrice() {
        return Price;
    }

    public boolean isSoldState() {
        return SoldState;
    }
}
