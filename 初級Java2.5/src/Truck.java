
public class Truck extends Vehicle
{
	
	
	public Truck(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame) 
	{
		frame.fillOval(x+110,y+40,10,10);
		frame.fillOval(x+135, y+40, 10, 10);
		frame.fillOval(x+170,y+40,10,10);
		frame.fillRect(x+100,y+20,100,20);
		frame.fillRect(x+180,y,20,20);
	}
}
