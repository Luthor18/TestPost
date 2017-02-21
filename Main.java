public class Main{
	public static void main(String[] args)
	{
		double xSpeedB = 1;
		double ySpeedB = 2;
		double xSpeedC = 0.5;
		double ySpeedC = 1;
		double xSpeedD = 1;
		double ySpeedD = 0.5;
		
		GameArena Arena = new GameArena(1600, 900);
		Ball B = new Ball(0, 0, 50, "RED");
		Ball C = new Ball(0, 0, 80, "GREEN");
		Ball D = new Ball(0, 0, 80, "BLUE");
		TimeKeep A = new TimeKeep();
		
		Arena.addBall(B);
		Arena.addBall(C);
		Arena.addBall(D);
		
		B.setXPosition(800);
		B.setYPosition(450);
		C.setXPosition(400);
		C.setYPosition(225);
		D.setXPosition(1200);
		D.setYPosition(675);
		
		while (true)
		{
			double xB = B.getXPosition();
			double yB = B.getYPosition();
			double xC = C.getXPosition();
			double yC = C.getYPosition();
			double xD = D.getXPosition();
			double yD = D.getYPosition();
			
			//xSpeedB += (TimeKeep.GetTime()*0.1); //Scalings for ball speed to increase difficulty.
			//ySpeedB += (TimeKeep.GetTime()*0.1);
			//xSpeedC += (TimeKeep.GetTime()*0.1);
			//ySpeedC += (TimeKeep.GetTime()*0.1);
			//xSpeedD += (TimeKeep.GetTime()*0.1);
			//ySpeedD += (TimeKeep.GetTime()*0.1);
			
			if (xB > 1600 || xB < 0)
			{
				xSpeedB = - xSpeedB;
			}
			
			if (yB > 900 || yB < 0)
			{
				ySpeedB = - ySpeedB;
			}
			
			B.setXPosition (xB + xSpeedB);
			B.setYPosition (yB + ySpeedB);
			
			if (xC > 1600 || xC < 0)
			{
				xSpeedC = - xSpeedC;
			}
			
			if (yC > 900 || yC < 0)
			{
				ySpeedC = - ySpeedC;
			}
			
			C.setXPosition (xC + xSpeedC);
			C.setYPosition (yC + ySpeedC);
			
			if (xD > 1600 || xD < 0)
			{
				xSpeedD = - xSpeedD;
			}
			
			if (yD > 900 || yD < 0)
			{
				ySpeedD = - ySpeedD;
			}
			
			D.setXPosition (xD + xSpeedD);
			D.setYPosition (yD + ySpeedD);
			
			//call Mouse function()
			A.AddSecond();
			//Arena.pause();
		}
	}
}