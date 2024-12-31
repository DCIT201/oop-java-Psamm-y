import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerID;
    private String customerName;
    private String email;
    private String contact;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    private List<String> history;

    public Customer( String customerName,String email,String contact){
        this.customerName=customerName;
        this.email=email;
        this.contact=contact;
        this.history=new ArrayList<>();
    }


}
