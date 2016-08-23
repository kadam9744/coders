package court;
import java.util.Random;

public class card {
	String cardname;
	String suit;
	int priority;
	String cardname2[]={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
	String suit2[]={"diamond","spades","hearts","clubs"};
	int i=0;
	public String randomsuit()
	{
		 Random r=new Random();
		  int j=r.nextInt(4);
		  return suit2[j];
	}
	
	
	}
	
	
	


