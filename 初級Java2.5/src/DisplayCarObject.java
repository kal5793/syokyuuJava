
public class DisplayCarObject extends MyFrame
{
	public void run() 
	{
		car car1=new car(50,50,10,0);
		car car2=new car(200,100,-10,0);
		
		for(int i=0;i<30;i++) 
		{
			clear();
			car1.draw(this);
			
		} 
	}
}
