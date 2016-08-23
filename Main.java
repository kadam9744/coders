package court;

import java.util.Random;


public class Main {
  static int l[]=new int[55];
  static int  i=0;
	public static void main(String args[])
	{
		card c[]=new card[52];
		card g=new card();
		int j=0,m=0,l=0,h=0;
		for(int f=0;f<52;f++)
		{
			c[f]=new card();
			if(f<13)
			{
			c[f].suit="diamonds";
			c[f].cardname=g.cardname2[j];
			c[f].priority=j;
			j++;
			
		}
			else if(f>=13 && f<26)
			{
				c[f].suit="spades";
				c[f].cardname=g.cardname2[l];
				c[f].priority=l;
				l++;
			}
			else if(f>=26 && f<39)
			{
				c[f].suit="hearts";
				c[f].cardname=g.cardname2[m];
				c[f].priority=m;
				m++;
			}
			else
			{
				c[f].suit="clubs";
				c[f].cardname=g.cardname2[h];
				c[f].priority=h;
				h++;
			}
	}
		player p1=new player("p1");
		player p2=new player("p2");
		player p3=new player("p3");
		player p4=new player("p4");
		for(int i=0;i<13;i++)
		{
			p1.card.add(c[randomcard()]);
			p2.card.add(c[randomcard()]);
			p3.card.add(c[randomcard()]);
			p4.card.add(c[randomcard()]);
			//System.out.println(p1.card.get(i).cardname);
			//System.out.println(p1.card.get(i).suit);
			//System.out.println(p4.card.get(i).cardname);
			//System.out.println(p4.card.get(i).suit);
			}
		String trump=g.randomsuit();
		System.out.println("trump is "+trump);
		player p=p1.randomplayer(p1, p2, p3, p4);
		System.out.println("random player "+p.playername);
		card c1,c2,c3,c4;
		c1=new card();
		c2=new card();
		c3=new card();
		c4=new card();
		while(p.card.size()!=0)
		  { 
			System.out.println(p.card.get(0).cardname+" "+p.card.get(0).suit +"...."+p.playername+"card");
			for(int z=0;z<p1.card.size();z++)
		  {
			  
		  
			if(!(p.playername.equals(p1.playername)) && p.card.get(0).suit.equals(p1.card.get(z).suit))
			{
				 c1=p1.card.get(z);
				 System.out.println(c1.cardname +" " + c1.suit+".........p1 card");
				p1.card.remove(z);
				break;
				
			}
			else if(!(p.playername.equals(p1.playername)) && z==p1.card.size()-1)
					{
				       for(int s=0;s<p1.card.size();s++)
				       {
				    	   if(!(p.playername.equals(p1.playername)) && trump.equals(p1.card.get(s).suit) )
				    	   {
				    		    c1=p1.card.get(s);
				    		   System.out.println(c1.cardname +" " + c1.suit+".........p1 card");
				    		   p1.card.remove(s);
				    		   break;
				    	   }
				    	   else if(!(p.playername.equals(p1.playername)) && z==p1.card.size()-1)
				    	   {
				    		    c1=p1.card.get(0);
				    		    System.out.println(c1.cardname +" " + c1.suit+".........p1 card");
				    		   p1.card.remove(0);
				    		   break;
				    	   }
				       }
				
					}
		  }
			for(int z=0;z<p2.card.size();z++)
			  {
				  
			  
				if(!(p.playername.equals(p2.playername)) && p.card.get(0).suit.equals(p2.card.get(z).suit))
				{
					 c2=p2.card.get(z);
					 System.out.println(c2.cardname +" " + c2.suit+".........p2 card");
					p2.card.remove(z);
					break;
					
				}
				else if(!(p.playername.equals(p2.playername)) && z==p2.card.size()-1)
						{
					       for(int s=0;s<p2.card.size();s++)
					       {
					    	   if(!(p.playername.equals(p2.playername)) && trump.equals(p2.card.get(s).suit) )
					    	   {
					    		    c2=p2.card.get(s);
					    		    System.out.println(c2.cardname +" " + c2.suit+".........p2 card");
					    		   p2.card.remove(s);
					    		   break;
					    	   }
					    	   else if(!(p.playername.equals(p2.playername)) && z==p2.card.size()-1)
					    	   {
					    		    c2=p2.card.get(0);
					    		    System.out.println(c2.cardname +" " + c2.suit+".........p2 card");
					    		   p2.card.remove(0);
					    		   break;
					    	   }
					       }
					
						}
			  }
			for(int z=0;z<p3.card.size();z++)
			  {
				  
			  
				if(!(p.playername.equals(p3.playername)) && p.card.get(0).suit.equals(p3.card.get(z).suit))
				{
					 c3=p3.card.get(z);
					 System.out.println(c3.cardname +" " + c3.suit+".........p3 card");
					p3.card.remove(z);
					break;
					
				}
				else if(!(p.playername.equals(p3.playername)) && z==p3.card.size()-1)
						{
					       for(int s=0;s<p3.card.size();s++)
					       {
					    	   if(!(p.playername.equals(p3.playername)) && trump.equals(p3.card.get(s).suit) )
					    	   {
					    		    c3=p3.card.get(s);
					    		    System.out.println(c3.cardname +" " + c3.suit+".........p3 card");
					    		   p3.card.remove(s);
					    		   break;
					    	   }
					    	   else if(!(p.playername.equals(p3.playername)) && z==p3.card.size()-1)
					    	   {
					    		    c3=p3.card.get(0);
					    		    System.out.println(c3.cardname +" " + c3.suit+".........p3 card");
					    		   p3.card.remove(0);
					    		   break;
					    	   }
					       }
					
						}
			  }
			for(int z=0;z<p4.card.size();z++)
			  {
				  
			  
				if(!(p.playername.equals(p4.playername)) && p.card.get(0).suit.equals(p4.card.get(z).suit))
				{
					 c4=p4.card.get(z);
					 System.out.println(c4.cardname +" " + c4.suit+"...............p4 card");
					p4.card.remove(z);
					break;
					
				}
				else if(!(p.playername.equals(p4.playername)) && z==p4.card.size()-1)
						{
					       for(int s=0;s<p4.card.size();s++)
					       {
					    	   if(!(p.playername.equals(p4.playername)) && trump.equals(p4.card.get(s).suit) )
					    	   {
					    		    c4=p4.card.get(s);
					    		    System.out.println(c4.cardname +" " + c4.suit+".........p4 card");
					    		   p4.card.remove(s);
					    		   break;
					    	   }
					    	   else if(!(p.playername.equals(p4.playername)) && z==p4.card.size()-1)
					    	   {
					    		   c4=p4.card.get(0);
					    		   System.out.println(c4.cardname +" " + c4.suit+".........p4 card");
					    		   p4.card.remove(0);
					    		   break;
					    	   }
					       }
					
						}
			  }
			if(p.playername.equals(p1.playername))
			{
				card[] temp={p1.card.get(0),c2,c3,c4};
					 p=prio(p1.card.get(0),c2,c3,c4,trump,p1,p2,p3,p4,temp);
					 
					 p1.card.remove(0);
			}
			else if(p.playername.equals(p2.playername))
			{
				card[] temp={c1,p2.card.get(0),c3,c4};
				 p=prio(p2.card.get(0),c1,c3,c4,trump,p1,p2,p3,p4,temp);
				 p2.card.remove(0);
			}
			else if(p.playername.equals(p3.playername))
			{    card[] temp={c1,c2,p3.card.get(0),c4};
				 p=prio(p3.card.get(0),c1,c2,c4,trump,p1,p2,p3,p4,temp);
				 p3.card.remove(0);
			}
			else if(p.playername.equals(p4.playername))
			{
				card[] temp={c1,c2,c3,p4.card.get(0)};
				 p=prio(p4.card.get(0),c1,c2,c3,trump,p1,p2,p3,p4,temp);
				 p4.card.remove(0);
			}
			System.out.println("win this trick playername :"+ p.playername);
			p.wintricks++;
		  }
		int count=p1.wintricks+p3.wintricks;
		System.out.println("player1 wintricks = "+p1.wintricks+"  ,player3 wintricks = "+p3.wintricks);
		int flag=p2.wintricks+p4.wintricks;
		System.out.println("player 2 wintricks = "+ p2.wintricks +" , player 4 wintricks = " + p4.wintricks);
		if(count>flag)
		{
			System.out.println("'team 1' is winner , "+ " team 1 wintrick is "+count);
		}
		else
		{
			System.out.println("'team 2' is winner  " +" team 2 wintrick is " + flag);
		}
		
	}
	public static int randomcard()
	{
		 Random r=new Random();
		  int j=r.nextInt(52);
		  l[i]=j;
		  i++;
		  
		  for(int p=0;p<i-1;p++)
		  {
			  if(i!=1 && l[p]==l[i-1] )
			  {
				  l[i-1]=r.nextInt(52);
				  p=-1;
			  }
		  }
		 
		  return l[i-1];
		 

}
	public static player prio(card c1,card c2,card c3,card c4,String trump,player p1,player p2,player p3,player p4,card[] te)
	{   card temp;
	card c[]={c1,c2,c3,c4};
		if(c1.suit.equals(c2.suit) && c2.suit.equals(c3.suit ) && c3.suit.equals(c4.suit))
		{
			
			for(int i=0;i<4;i++)
			{
				for(int j=i+1;j<4;j++)
				{
					if(c[j].priority<c[i].priority)
					{
						temp=c[i];
						c[i]=c[j];
						c[j]=temp;
					}
				}
				
			}
			return playeree(te,c[0],p1,p2,p3,p4);
		}
		else if(c1.suit.equals(trump) && !(c2.suit.equals(trump)) &&!(c3.suit.equals(trump)) && !(c4.suit.equals(trump)) )
		{
			return playeree(te,c1,p1,p2,p3,p4);
		}
		else if(!(c1.suit.equals(trump)) && (c2.suit.equals(trump)) &&!(c3.suit.equals(trump)) && !(c4.suit.equals(trump)))
		{
			return playeree(te,c2,p1,p2,p3,p4);
		}
		else if(!(c1.suit.equals(trump)) && !(c2.suit.equals(trump)) &&(c3.suit.equals(trump)) && !(c4.suit.equals(trump)))
		{
			return playeree(te,c3,p1,p2,p3,p4);
		}
		else if(!(c1.suit.equals(trump)) && !(c2.suit.equals(trump)) &&!(c3.suit.equals(trump)) && (c4.suit.equals(trump)))
		{
			return playeree(te,c4,p1,p2,p3,p4);
		}
		else
		{
			for(int i=0;i<4;i++)
			{
				if(c[i].suit.equals(trump))				
				{
					for(int j=0;j<4;j++)
					{
						if( c[j].suit.equals(trump))
						{
							if(c[j].priority<c[i].priority)
							{
								temp=c[0];
								c[0]=c[j];
								c[j]=temp;
							}
						}
					}
					break;
				}
				else if(i==3 && !(c[i].suit.equals(trump)))
				{
					for(int j=1;j<4;j++)
					{
					if(c[0].suit.equals(c[j].suit))
					{
						if(c[j].priority<c[0].priority)
						{
							temp=c[0];
							c[0]=c[j];
							c[j]=temp;
						}
					}
						
					}
					break;
				}

			}
			return playeree(te,c[0],p1,p2,p3,p4);
		}
		
	}
	public static player playeree(card[] temp,card c,player p1,player p2,player p3,player p4)
	{
		if(temp[0]==c)
		{
			return p1;
		}
		else if(temp[1]==c)
		{
			return p2;
		}
		else if(temp[2]==c)
		{
			return p3;
		}
		else
		{
			return p4;
		}
	}
}
