import java.util.Vector;

public class DisplayCarVector extends MyFrame
{
	public void run() 
	{
		Vector<car>cars=new Vector<car>();
		cars.add(new car(20,0,1,0));
		cars.add(new car(20,75,2,0));
		cars.add(new car(20,150,3,0));
		cars.add(new car(20,225,4,0));
		cars.add(new car(20,300,5,0));
		for(int i=0;i<30;i++)
		{
			clear();
			for(int j=0;j<cars.size();j++)
			{
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.1);
		}
	}
}
