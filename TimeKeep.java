public class TimeKeep{
	private int oneThousand = 0;
	private int count = 0;
	
	public void AddSecond(){
		try { 
			Thread.sleep(2);
			oneThousand++;
			if (oneThousand == 500){
				count++;
				System.out.print("\b\b\b\b"+count);
				oneThousand = 0;
			}
		}
		catch (InterruptedException e) { 
			e.printStackTrace(); 
		}
	}

	public int GetTime(){
		return count;
	}	
}