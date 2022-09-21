   /*
@Author Tsion Tadesse
@Date 09-21-2022
*/

import java.util.Scanner;
class Day03 {
  public static void main(String[] args) {
    //method call to check the methods
    evenOdd();
  maxNum(4,5);
  swapNums(5, 6);
  swapNumWithNoVar(7,6);
    maxOfThree(3, 1, 5);
    findVowelConsonant('e');
    evenOddTernary(7);
  }
  //find if the number is even or odd
  public static void evenOdd(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = in.nextInt();
    if(n%2 == 0 && n>2){
      System.out.println("The number is even");
    }else{
      System.out.println("The number is odd");
    }
  }
  
  //find the max of two numbers
  public static void maxNum(int a, int b){
    if(a>b){
      System.out.println("The max number is " + a);
    }else if(a<b){
       System.out.println("The max number is " + b);
    }else{
       System.out.println("The numbers are equal");
    }
  }
  public static void swapNums(int n, int m){
    int c = n;
    n=m;
    m=c;
    System.out.println("First Number after Swap =" + n + "& Second Number after swap=" + m);
  }
  public static void swapNumWithNoVar(int n, int m){
    n = m + n;
    m = n- m;
    n = n-m;
    System.out.println("First Number after Swap =" + n + "& Second Number after swap=" + m);
  }
  public static void evenOddTernary(int n){
   String isEvenOdd = (n%2 == 0 && n>2) ? "even" : "Odd"; 
    System.out.println("The number is " + isEvenOdd);
    }
  
  public static void maxOfThree(int a, int b, int c){
    if(a>b && a>c){
      System.out.println("The max is" + a);
    }else if(b>a && b>c){
      System.out.println("The max is" + b);
    }else{
      System.out.println("The max is" + c);
    }
  }
public static void findVowelConsonant(char c){
  if(c == 'a' || c=='e'|| c=='i'|| c=='o'|| c=='u'){
    System.out.println("the character is vowel");
  }else{
    System.out.println("The character is consonant");
  }
}
}
