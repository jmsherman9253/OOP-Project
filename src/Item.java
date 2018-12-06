import java.util.Date;

public interface Item {
    static final String manufacturer = "OracleProduction";

    void setProductionNumber(int productionNumber);

    void setName(String name);

    String getName();

    Date getManufactureDate();

    int getSerialNumber();

    void setManufacturer(String manufacturer);
}
