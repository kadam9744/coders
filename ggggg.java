package court;
interface A
{
    int x=10;
}
interface B
{
    int x=100;
}
public class ggggg implements A,B
{
		    public static void Main(String args[])
		    {
		       // reference to x is ambiguous both variables are x
		       System.out.println(x); 
		       System.out.println(A.x);
		       System.out.println(B.x);
		    }
		}

	


