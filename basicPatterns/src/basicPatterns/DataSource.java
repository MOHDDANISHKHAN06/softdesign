package basicPatterns;

public class DataSource extends Observable {

	int[] points = new int[50];
	
	public void setData() {
		
	for(int i=0; i<50;i++)
	{
		points[i] = (int) (Math.random() * 200) + 1;
	}
							}
	
	public int[] getData() {
		return points;
							}
	
}
