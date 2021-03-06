import java.util.random; 

public class QueueCA
{
    private static int MAX = 10;    // ignore running out of capacity issues
    private String[] a;  // array to hold the items
    private int n;       // nuber of itms in the queue
    private int front, rear;   // index

    public QueueCA()
    {
        a = new String[ MAX ];
        n = 0;
        rear = -1;
        front = 0;
    }

    public int size()
    {
    return n;
    }

    // if size is 0, do not call
    public String front()
    {
        return[front];
    }

    // if size is max, do not call
    public void add( String s)
    {
        rear++;
        a[rear] = s;
        n++;
    }

    //if size is 0, do not call
    public void remove()
    {
        front++;
        n--;
    }

    
    
    public static void main(String[]Args)
    {
        // simulate endless arrivals and services:

        QueueCA q = new QueueCA();
        Random rng = new Random(1);
        long start = System.nanoTime();

        while( q.size() <= MAX)
        {
            step++;
            System.out.println("Step "+ step + ", queue" + step +
            if( rng.nextInt(2) == 0)
            {//customer arrives
                String id = "C" + ( System.nanoTime() - start);

                q.add("id") 
            }
            else
            {// customer gets waited on
				System.out.println("Waited on)
			}

			}
		}
	}
    }
}