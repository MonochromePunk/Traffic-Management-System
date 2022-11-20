import java.util.concurrent.TimeUnit;

public class TimerDisplay {
	private Double countdownTime;
	TimerDisplay(){
		
	}
	public Double getCountdownTime() {
		return countdownTime;
	}
	public void setCountdownTime(Double countdownTime) {
		this.countdownTime = countdownTime;
		this.startCountDown();
	}
	public void startCountDown()
	{	System.out.println("\nStarting Countdown\n");
		double i = Math.round(this.countdownTime);
		for(;i>=0;i--)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Cannot sleep thread " + e);
			}
		}
		System.out.println("\nCountdown Over\nChanging Signal\n");
	}

}
