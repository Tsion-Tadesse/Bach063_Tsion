class SumEvenOdd {
  public static void main(String[] args) {
    int oddSum = 0, evenSum=0;
   for(int i=1; i<=10; i++){
     if(i%2 == 0){
       evenSum += i;
     }else{
       oddSum += i;
     }
   }
    System.out.println("Even Sum is" + evenSum);
    System.out.println("Odd Sum is " + oddSum);
  }
}