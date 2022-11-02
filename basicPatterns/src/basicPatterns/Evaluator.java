package basicPatterns;

public class Evaluator {
	
	private static Evaluator _instance;
	
	private Evaluator() {};
	
	public static Evaluator getEvaluator() {
		
		if (_instance == null) _instance = new Evaluator();
		return _instance;
	}
	
	public int findAvg()
	{
		DataSource ds = new DataSource();
		int[] data = ds.getData();
		int sum =0;
		for( int num : data)
		{
			sum+=num;
		}
		return sum/data.length;
	}

}
