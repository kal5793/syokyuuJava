
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
		frame.fillRect(x,y+100,100,50);
		frame.fillRect(x-20,y+130,140,30);
		frame.fillOval(x,y+150,20,20);
		frame.fillOval(x+80,y+150,20,20);
	}
	public void move() 
	{
		x+=vx;
		y+=vy;
	}
}
