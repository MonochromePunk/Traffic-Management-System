public class Button {
	private int noOfGreen;
	private boolean pressRed;
	public Button()
	{
		this.noOfGreen = 0;
		this.pressRed = false;
	}
	public int getNoOfGreen() 
	{
		return noOfGreen;
	}
	public void setNoOfGreen(int noOfGreen) 
	{
		this.noOfGreen = noOfGreen;
	}
	public void addNoOfGreen(int count) 
	{
		this.noOfGreen +=count;
	}
	public void setPressRed(boolean pressRed) 
	{
		this.pressRed = pressRed;
	}
	public boolean getPressRed() 
	{
		return this.pressRed;
	}

}
