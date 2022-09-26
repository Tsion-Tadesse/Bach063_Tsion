package cogent.com.repo;
import com.cogent.bean;
import java.util.Scanner;
import java.util.*;

class CustomerRepo{
    CustomerBean cb = new CustomerBean();
  public void addCustomer(CustomerBean customerBean){
    long id;
    String name;
    String proceed;
    Scanner in = new Scanner(System.in);
    do{
    System.out.println("Please enter customer ID:");
    id = in.nextLong();
    cb.getCustomerID(id);
    System.out.println("Please enter customer name:");
    name = in.nextLine();
    cb.setCustomerName(name);
    System.out.println("Customer added successfully!");
    System.out.println("Do you want to add more customer? Press Y or N");
    proceed = in.nextLine();
    }while(proceed != 'N');     
  }
  public void viewAllCustomer(){
    int row = 100;
    System.out.println("Customer ID \t Customer Name");
    for(int i=0; i<row; i++){
        System.out.println(cb.getCustomerId + "\t" + cb.getCustomerName);
      }
  }
  public void searchCustomerById(long id){
    String choice;
    int row = 100;
    int column = 2;
    do{
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the customer id: ");
      id = in.nextLong();
      for(int i=0; i<row; i++){
          if(id == cb.getCustomerID ){
            System.out.println(cb.getCustomerID + "\t" + cb.getCustomerName);
        }
      }
      choice = in.nextLine();
      System.out.println("Press Y to Search More and Press N to go to main menu");
    }while(choice != "N");
    
  }
}