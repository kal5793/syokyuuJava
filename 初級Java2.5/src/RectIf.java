
public class RectIf extends MyFrame
{
	public void run() 
	{
		int x=20;
		int y=20;
		setColor(0,128,0);
		int i;
		for(i=0;i<9;i++) 
		{
			fillRect(x,x,y,y);
			x*=2;
			y*=2;
		}
	}
}
