public class PassLight {
	private boolean greenSignal;
	private boolean redSignal;
	PassLight(){
		this.greenSignal = false;
		this.redSignal = true;
		
	}
	public boolean getGreenSignal() {
		return greenSignal;
	}
	public void setGreenSignal(boolean greenSignal) {
		
	}
	public boolean getRedSignal() {
		return redSignal;
	}
	public void setRedSignal(boolean redSignal) {
		
	}
	public void changeSignal(boolean greenSignal,boolean redSignal) {
		this.greenSignal = greenSignal;
		this.redSignal = redSignal;
		this.print();
	}
	void print()
	{
		if(this.greenSignal==true)
			System.out.println("Pedestrian Light : Green");
		else
			System.out.println("Pedestrian Light : Red");
			
	}

}
