public class SignalLight{
	private boolean greenSignal;
	private boolean amberSignal;
	private boolean redSignal;
	SignalLight(){
		
	}
	
	
	
	public void changeSignal(boolean greenSignal,boolean amberSignal,boolean redSignal) {
		
		this.greenSignal = greenSignal;
		this.amberSignal = amberSignal;
		this.redSignal = redSignal;
		this.printSignal();
		
	}


	public boolean getGreenSignal() {
		return greenSignal;
	}


	public void setGreenSignal(boolean greenSignal) {
		this.greenSignal = greenSignal;
	}


	public boolean getAmberSignal() {
		return amberSignal;
	}


	public void setAmberSignal(boolean amberSignal) {
		this.amberSignal = amberSignal;
	}


	public boolean getRedSignal() {
		return redSignal;
	}


	public void setRedSignal(boolean redSignal) {
		this.redSignal = redSignal;
	}
	
	void printSignal()
	{
		if(this.greenSignal)
			System.out.println("Green Signal");
		else if(this.amberSignal)
			System.out.println("Amber Signal");
		else if(this.redSignal)
			System.out.println("Red Signal");
		else
			System.out.println("All lights off");
	}
	
}
