package local.restaurant3;

public class Plate {

    private int salesPrice;
    private int costProduction;
    private String name;

    /**
     * @return the salesPrice
     */
    public int getSalesPrice() {
        return salesPrice;
    }

    /**
     * @param salesPrice the salesPrice to set
     */
    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getCostProduction() {
        return costProduction;
    }

    public void setCostProduction(int costProduction) {
        this.costProduction = costProduction;
    }
}
