package OMSDemo.domain;

/**
 * User for the spring thymeleaf order form to save form data about our client
 * and product before creating StoreOrder instance. The fields should be set
 * according to the data in the database(e.g. Dropdown menu populated from
 * database). OrderTransfer should never contain IDs that are not in our
 * database.
 *
 * @author Janar
 *
 */
public class OrderTransfer {

    private long securityCode;
    private long barCode;

    public OrderTransfer(long securityCode, long barCode) {
        this.securityCode = securityCode;
        this.barCode = barCode;
    }

    public long getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(long securityCode) {
        this.securityCode = securityCode;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }
}
