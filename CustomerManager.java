import java.util.Scanner;
import cogent.com.repo;
import com.cogent.bean;

class CustomerManager {
    CustomerRepo cr = new CustomerRepo();
  public static void main(String[] args) {
    System.out.println("***************************");
    System.out.println(" CUSTOMER MANAGMENT SYSTEM");
    System.out.println("***************************");
    System.out.println("1. Add Customer ");
    System.out.println("2. View All Customer ");
    System.out.println("3. Search Customer By Id");
    System.out.println("4. Exit");
    Scanner in = new Scanner(System.in);
    int choice;
    do{
      System.out.println("Enter your choice: ");
      choice = in.nextInt();
      switch(choice){
        case 1:
          System.out.println("User selected 1");
              cr.addCustomer();
          break;
        case 2:
          System.out.println("User selected 2");
               cr.viewAllCustomer();
          break;
        case 3:
          System.out.println("User selected 3");
              Scanner in = new Scanner(System.in);
              System.out.println("Enter the customer id: ");
              long id = in.nextLong();
              cr.searchCustomerById(id):
          break;
        default:
          break;
      }
    }while(choice != 4);
  }
}

