import java.util.Random;
import java.util.Scanner;

public class BinarySearch
{
  public static void main(String[] args)
  {
    int[] a = new int[23];
    int n = 13;

    Random randy = new Random(1);
    for( int k=0; k<n; k++ )
    {
      if( k==0 )
        a[k] = randy.nextInt(1000)+1;
      else
        a[k] = a[k-1] + randy.nextInt(3);
    }
    
    show(a,n);

    Scanner keys = new Scanner( System.in );

    do{
      System.out.print("enter target: ");
      int target = keys.nextInt();

      Answer answer = binarySearch( target, a, 0, n-1 );

      System.out.println( answer.found + " " + answer.location  );

    }while( true );
    
  }

  // search a[first]...a[last] for target, return either
  // <true,location where it is> or
  // <false, location where it belongs>
  public static Answer binarySearch( int target, int[] a, int first, int last )
  {
System.out.println("binary search from " + first + " to " + last );
    if( first == last )
    {// searching a range of length 1
      if( a[first] == target )
      // with objects:   if( a[first].compareTo( target ) == 0 )
        return new Answer( true, first );
      else if( a[first] < target )
        return new Answer( false, first+1 );
      else // a[first] > target 
        return new Answer( false, first );
    }
    else if( last == first+1 )
    {
      if( target < a[first] )
        return new Answer( false, first );
      else if( target == a[first] )
        return new Answer( true, first );
      else if( target < a[last] )
        return new Answer( false, last );
      else if( target == a[last] )
        return new Answer( true, last );
      else // a[last] < target
        return new Answer( false, last+1 );
    }
    else
    {
      int mid = (first+last)/2;
System.out.println("mid = " + mid );

      if( a[mid] == target )
      {
        return new Answer( true, mid );
      }
      else if( a[mid] > target )
      {
        return binarySearch( target, a, first, mid-1 );
      }
      else if( a[mid] < target )
      {
        return binarySearch( target, a, mid+1, last );
      }
      else
      {
        System.out.println("if you see this, you are doomed!");
        return null;
      }

    }

  }

  private static void show( int[] a, int n )
  {
    for(int k=0; k<n; k++ )
      System.out.print( a[k] + " " );
    System.out.println();
  }

}
