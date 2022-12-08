import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;


public class lab13 {

	private ArrayList<Integer> bruh = new ArrayList<>();
	
	
	public void readData(String filename)
	{
		try{
			BufferedReader inputFile = new BufferedReader(new FileReader(filename));
			
			String line;
			
			while((line = inputFile.readLine()) != null)
			{
			
				bruh.add(Integer.valueOf(line.trim()));
			//StringTokenizer token = new StringTokenizer(line, "\t");
			
			/*
			CarFunctions newcar = new jain_Car();		
			
			carList.add(newcar);
			listByTotal.add(newcar);
			listByRemaining.add(newcar);
			*/
			
			}
			inputFile.close(); 
			}

		catch(Exception e)
		{
			System.out.println(e.toString());
			}
			
		
	}
	
	public long getTotalCount()
	{
		return bruh.stream().count();
	}
	
	public long getOddCount()
	{
		return bruh.stream().filter(x-> x%2==1).count();
	}
	
	public long getEvenCount()
	{
		return bruh.stream().filter(x-> x%2==0).count();
	}
	
	public long getDistinctGreaterThanFiveCount()
	{
		return bruh.stream().filter(x-> x>5).distinct().count();
	}
	
	
	public Integer[] getResult1()
	{
		return bruh.stream().filter(x-> x%2==0 && x>5 && x<50).sorted().toArray(Integer[]::new);
	}
	
	public Integer[] getResult2()
	{
		return bruh.stream().limit(50).map(x-> 3*(x*x)).toArray(Integer[]::new);
	}
	
	public Integer[] getResult3()
	{
		return bruh.stream().filter(x-> x%2==1).map(x->2*x).sorted().skip(20).distinct().toArray(Integer[]::new);
	}
	
	
}
