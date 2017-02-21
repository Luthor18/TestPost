public class Driver2
{
	public static void main(String[] args)
	{
		double xSpeed = 1;
		double ySpeed = 2;
		
		GameArena Arena = new GameArena(800, 600);
		Ball B = new Ball(0, 0, 10, "ORANGE");
		
		Arena.addBall(B);
		B.setXPosition(400);
		B.setYPosition(300);
		
		while (true)
		{
			double x = B.getXPosition();
			double y = B.getYPosition();
			
			if (x > 800 || x < 0)
			{
				xSpeed = - xSpeed;
			}
			
			if (y > 600 || y < 0)
			{
				ySpeed = - ySpeed;
			}
			
			B.setXPosition (x + xSpeed);
			B.setYPosition (y + ySpeed);
			
			Arena.pause();
		}
	}
}