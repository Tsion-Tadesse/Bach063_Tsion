import java.util.Scanner;
import java.util.*;

public class CustomerBean{
  private long customerId;
  private String customerName;
  
  public void setCustomerId(long customerId){
    this.customerId = customerId;
  }
  public long getCustomerId(){
    return customerId;
  }
  public void setCustomerName(String customerName){
    this.customerName = customerName;
  }
  public String getCustomerName(){
    return customerName;
  }
}