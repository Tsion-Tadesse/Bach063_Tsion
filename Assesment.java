import java.util.Scanner;
class Assesment_01{
  public static void main(String[] args) { 
    //calling for testing purposes
    isPrimeNum(8);
      sumOfNaturalNum();
      multiplicationOfNum(9);
      factorial(6);
      Scanner in = new Scanner(System.in);
  System.out.print("Enter the first num:");
  int n = in.nextInt();
  System.out.print("Enter the second num:");
  int m = in.nextInt();
  power(n, m);
      
   System.out.println("Enter a number: ");
   int n = in.nextInt();
   reverse(n);
      
    System.out.println("Enter a number: ");
   int n = in.nextInt();
   evenOddSum(n);
      
   System.out.println("Enter a positive integer: ");
   int n = in.nextInt();
   isPrime(n);
   
    countPos();
    
    countPosNegZero();
  }
  public static boolean isPrimeNum(int n){
    boolean isPrime;
    int count = 0;
    for(int i=1; i<n; i++){
      if(n%i == 0){
        count +=1;
      }
    }
    if(count > 1){
      isPrime = false;
    }else{
      isPrime = true;
    }
    return isPrime;
  }
  public static void printListOfPrime(){
    for(int i=1; i<=10; i++){
      if(isPrimeNum(i) == true){
        System.out.println(i);
      }
    }
    }
    public static void sumOfNaturalNum(){
    int sum =0;
    for(int i=1; i<=10; i++){
      sum += i;
    }
    System.out.println("The sum of the first 10 natural number: " + sum);
  }
  public static void multiplicationOfNum(int n){
  for(int i=1; i<=12; i++){
    System.out.println(n + "*" + i + " = " + i*n);
  }
}
    public static void factorial(int n){
  int fact = 1;
  for(int i=1; i<=n; i++){
    fact *= i;
  }
  System.out.println(fact);
}
    public static void power(int n, int m){
  int power = 1; 
  for(int i=0; i<m; i++){
    power *= n;
  }
  System.out.println(power);
}
  public static void reverse(int n){
int r, sum =0;
  while(!(n==0)){
    r = n%10;
    sum = sum*10+r;
    n = n/10;
  }
  System.out.println(sum);
}
    public static void evenOddSum(int n){
  int oddSum = 0, evenSum=0;
   for(int i=1; i<=n; i++){
     if(i%2 == 0){
       evenSum += i;
     }else{
       oddSum += i;
     }
   }
    System.out.println("Even Sum is " + evenSum);
    System.out.println("Odd Sum is " + oddSum);
}
  public static void isPrime(int n){
  int count = 0;
    for(int i=1; i<n; i++){
      if(n%i == 0){
        count +=1;
      }
    }
    if(count > 1){
      System.out.println("The number is not prime");
    }else{
       System.out.println("The number is prime");
    }
}
    //fix it
    public static void hcf(int n, int m){
  int common_factor=0;
  int divider =0; 
  int divider_two=0;
    for(int i=2; i>=n; i++){
      if(n%i == 0){
        divider = n/i;
        System.out.println(divider);
      }
      for(int j=2; j>=n; j++){
      if(m%j == 0){
        divider_two = m/j;
        System.out.println(divider_two);
      }
      }
      if(divider == divider_two){
        common_factor = divider;
      }
    }
      System.out.println("The HCF is" + common_factor);
}
    public static void displaySum(int n1, int n2){
   Scanner in = new Scanner(System.in);
   int sum = 0;
    String choice;
   do{
     System.out.println("Enter the first number:");
     n1 = in.nextInt();
    System.out.println("Enter the second number:");
     n2 = in.nextInt();
     sum = n1 + n2;
     System.out.println("The sum is: " + sum);
     
     System.out.print("would you like to continue enter 'n' for no");
     choice = in.nextLine();
   }while(choice != "n");
 }


public static void countPos(){
    Scanner in = new Scanner (System.in);
    int count = 0;
    int n; 
    do{
      System.out.println("Enter a number");
      n =in.nextInt();
      if(n>0){
        count +=1;
    }
    }while(n!=0);
    System.out.println("The number of positive numbers are" + count);
    
  }
  public static void countPosNegZero(){
    Scanner in = new Scanner (System.in);
    int zero_count = 0;
    int pos_count = 0;
    int neg_count = 0;
    int n;
    do{ 
      System.out.println("Enter a number");
      n =in.nextInt();
      if(n>0){
        pos_count +=1;
      }else if(n<0){
        neg_count += 1;
      }else if(n==0){
        zero_count += 1;
      }else{
        System.out.println("Invalid input");
      }
        
    }while(n!=10000);
    System.out.println("The number of positive numbers are" + pos_count);
        System.out.println("The number of negative numbers are" + neg_count);
        System.out.println("The number of zeros are" + zero_count);
  }
  }
