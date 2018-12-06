import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

    int serialNumber;
    String manufacturer;
    Date manufacturedOn;
    String name;

    static int currentProductNumber = 1;

    public Product() {
        name = "N/A";
        serialNumber = 0;
        manufacturer = "N/A";
        manufacturedOn = null;
    }

    /**
     * Gets the values for name, serialNumber, and manufacturedOn
     *
     * @param name
     */
    public Product(String name) {
        this.name = name;
        serialNumber = currentProductNumber++;
        currentProductNumber++;
        manufacturedOn = new Date();
    }

    /**
     * Sets the serial number for the product
     *
     * @param productionNumber
     */
    public void setProductionNumber(int productionNumber) {
        currentProductNumber = productionNumber;
    }

    /**
     * Sets the name of the product
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name for the product and returns its value to name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the manufactured date and returns its value to manufacturedOn.
     *
     * @return
     */
    public Date getManufacturedDate() {
        return manufacturedOn;
    }

    /**
     * Gets the serial number and returns its value to serialNumber.
     *
     * @return
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * Prints out the information for the product
     *
     * @return
     */
    public String toString() {
        return "Manufacturer  : " + manufacturer + "\n"
                + "Serial Number : " + serialNumber + "\n"
                + "Date          : " + manufacturedOn + "\n"
                + "Name          : " + name + "\n";
    }

    public int compareTo(Product p1) {
        return this.getName().compareTo(p1.getName());
    }

}
