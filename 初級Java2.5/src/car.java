
public class car
{
	int x,y,vx,vy;
	public car(int x,int y,int vx,int vy) 
	{
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) 
	{
		frame.fillOval(x,y+75,20,20);
		frame.fillOval(x+80,y+75,20,20);
		frame.fillRect(x,y+20,100,50);
		frame.fillRect(x-20,y+50,140,30);
	}
	public void move() 
	{
		x+=vx;
		y+=vy;
	}
}