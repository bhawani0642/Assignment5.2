import java.util.Scanner;
public class BinarySearch {
public static void main(String[] args) {
  // Declaring variables
  int num;
  // Scanner object is used to get the inputs entered by the user
  Scanner sc = new Scanner(System.in);
  // Declaring one dimensional array
  int arr[] = {4,   5,   6,   7,   12,   23,   34,   56,   78,   90,   123,   124,   156,   178,   199,   200,   230,   245,   250, 255};
  // getting the number entered by the user
  System.out.print("Enter the number to search :");
  num = sc.nextInt();
  // calling the method by passing the array and user entered number as
  // arguments
  int pos = searchForElement(arr, num);
  // Displaying the position of the number in the array if found
  if (pos != -1)
   System.out.println("The " + num + " is found at Position " + pos);
  else
   System.out.println("** Number not in array **");
}
/*
  * method implementation which search for the number in the array using
  * binary search algorithm
  * 
  * @Params array and number
  * 
  * @return Position
  */
private static int searchForElement(int[] arr, int num) {
  int first = 0, mid = 0;
  int last = arr.length - 1;
  while (first <= last) {
   mid = (first + last) / 2;
   if (num == arr[mid])
    return mid;
   if (num < arr[mid])
    last = mid - 1;
   else
    first = mid + 1;
  }
  return -1;
}
}
