//Here we are implementing the Scanner class
import java.util.Scanner;
/*
 * Created a class named as BinarySearch
 */
public class BinarySearch {
//this is the main method
	public static void main(String[] args) {
 int a, first,last,middle,n,search,array[];
 Scanner in= new Scanner(System.in);
 //print statement
 System.out.println("Please enter the number of elements");
  n=in.nextInt();
  array = new int[n];
  System.out.println("Enter " + n + " integers");
  //Running the for loop
  for (a = 0; a < n; a++)
      array[a] = in.nextInt();
  //print statement
  System.out.println("Enter value to find");
  search = in.nextInt();
  first  = 0;
  last   = n - 1;
  middle = (first + last)/2;

  while( first <= last )
  {if ( array[middle] < search )
      first = middle + 1;    
    else if ( array[middle] == search ) 
    {
      System.out.println(search + " found at location " + (middle + 1) + ".");
      break;
    }
    else
       last = middle - 1;

    middle = (first + last)/2;
 }
 if ( first > last )
    System.out.println(search + " is not present in the list.\n");
 {
}
}

	}


