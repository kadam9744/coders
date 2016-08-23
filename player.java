package court;

import java.util.ArrayList;
import java.util.Random;

public class player {
	String playername;
	int wintricks=0;
	public player(String playername)
	{
		this.playername=playername;
	}
	ArrayList<card> card=new ArrayList();
	public player randomplayer(player p1,player p2,player p3,player p4)
	{
		Random r=new Random();
		int j=r.nextInt(4)+1;
		if(j==1)
			return p1;
		else if(j==2)
			return p2;
		else if(j==3)
			return p3;
		else
			return p4;
	}
	
}
