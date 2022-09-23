import java.util.Scanner;
class Arrays {  
  public static void main(String[] args) { 
    search();
    largestElement();
      sortArray();
      sortArrayDescending();
      sortArrayAscending();
      removeDuplicate();
    EqualArray();
  }
//1
public static void search(){
    Scanner in = new Scanner(System.in);
    int[] arr = {3, 4,5, 2, 6, 7};
    
    System.out.println("Enter the elelment you want to search?");
    int n = in.nextInt();
    for(int i=0; i<arr.length; i++){
      if(arr[i] == n){
        System.out.print(arr[i] + " was at index" + i);
      }
    }
    //2
      public static void largestElement(){
    int largest;
    int[] arr = { 3, 4,5, 2, 6, 7};
    largest = arr[0];
    for(int i=0; i<arr.length; i++){
      if(arr[i] >=largest){
       largest = arr[i];
      }
    }
     System.out.print("Largest element is " + largest);
  }
    
    // 3 using selection sort
  public static void sortArray(){
    int min = 0; int j;
    int minIndex;
    int[] arr = { 3, 4,5, 2, 6, 7};
    
    for(int i=0; i<arr.length-1; i++){
      minIndex = i;
      for(j=i+1; j<arr.length; j++){
        if(arr[j] > arr[minIndex]){  
          minIndex = j; 
      } 
      }
        min = arr[minIndex];
        arr[minIndex] = min;
         arr[i] = arr[i]; 
      } 
    for(int k=0; k<arr.length; k++){
       System.out.print(arr[k] + " ");
    }
  }
  
  
    //4
  //using selection sort Descending Order
  public static void sortArrayDescending(){
    int min = 0; int j;
    int minIndex;
    int[] arr = { 3, 4,5, 2, 6, 7};
    
    for(int i=0; i<arr.length-1; i++){
      minIndex = i;
      for(j=i+1; j<arr.length; j++){
        if(arr[j] > arr[minIndex]){  
          minIndex = j; 
      } 
      }
        min = arr[minIndex];
        arr[minIndex] = arr[i];
         arr[i] = min; 
      } 
    for(int k=0; k<arr.length; k++){
       System.out.print(arr[k] + " ");
    }
  }
  //5 Sort in ascending order
  public static void sortArrayAscending(){
    int min = 0; int j;
    int minIndex;
    int[] arr = { 3, 4,5, 2, 6, 7};
    
    for(int i=0; i<arr.length-1; i++){
      minIndex = i;
      for(j=i+1; j<arr.length; j++){
        if(arr[j] > arr[minIndex]){  
          minIndex = j; 
      } 
      }
        min = arr[minIndex];
        arr[minIndex] = min;
         arr[i] = arr[i]; 
      } 
    for(int k=0; k<arr.length; k++){
       System.out.print(arr[k] + " ");
    }
  }
    
    //6
    //the size of the new array is the same as the origional array
    //therefore the extra index will be filled with the default value 0
    public static void removeDuplicate(){
    int min = 0;
    int [] arr = {2, 3, 5, 5, 5, 1, 5};
    int [] arr1 = new int[arr.length];
    for(int i=0; i<arr.length-1; i++){
      if(arr[i] != arr[i+1]){
        arr1[i] = arr[i];
      }
    }
    for(int i=0; i<arr.length; i++){
      System.out.print(arr1[i] + " ");
    }
  }
    // 7 merge sort
     public static void mergeArray(){
    int [] arr = {2, 1, 5};
    int []arr2 = {3, 4, 7};
    int arr3Len = arr.length + arr2.length;
    int [] arr3 = new int[arr3Len];
    for(int i=0; i<arr.length; i++){
        arr3[i] = arr[i];
      }
    for(int j=0; j<arr2.length; j++){
        arr3[j+arr.length] = arr2[j]; //to add it from where it stoped which is the length of the first array
      }
    
    for(int i=0; i<arr3.length; i++){
      System.out.print(arr3[i] + " ");
    }
  }
  public static void EqualArray(){
    int [] arr = {2, 1, 5};
    int []arr2 = {2, 4, 5};
    boolean isEqual = false; 
    //int arr3Len = arr.length + arr2.length;
    if(arr.length == arr2.length){
      
      for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr2.length; j++){
          if(arr[i] == arr2[j]){
            isEqual = true;
          }else{
            isEqual = false;
          }
        }    
      }
      System.out.print(isEqual);
    }
    
  }
  }
