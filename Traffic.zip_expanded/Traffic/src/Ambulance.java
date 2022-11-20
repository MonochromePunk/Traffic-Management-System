public class Ambulance extends Vehicle{
	private String hospitalName;
	private MutableChip chip;
	private double distanceOne;
	private double distanceTwo;
	
	Ambulance(String vehicleNumber,String hospitalName)
	{
		this.vehicleNumber = vehicleNumber;
		this.typeOfVehicle = "Ambulance";
		this.hospitalName = hospitalName;
		this.chip = new MutableChip(vehicleNumber, 500);
	}
	
	

	public MutableChip getChip() {
		return chip;
	}



	public void setChip(MutableChip chip) {
		this.chip = chip;
	}



	public void setTypeOfVehicle(String typeOfVehicle)
	{
		this.typeOfVehicle = "Ambulance";
	}
	
	public String getHospitalName() 
	{
		return hospitalName;
	}
	public void setHospitalName(String hospitalName)
	{
		this.hospitalName = hospitalName;
	}
	
	public double getDistanceOne() {
		return distanceOne;
	}
	public double getDistanceTwo() {
		return distanceTwo;
	}
	public void setDistanceOne(double distanceOne) 
	{
		this.distanceOne = distanceOne;
	}
	public void setDistanceTwo(double distanceTwo) 
	{
		this.distanceTwo = distanceTwo;
	}
	
	public String detectChip()
	{
		return (this.sendResponse());
	}
	
	public String sendResponse() 
	{
			return this.chip.getChipNumber()+" "+this.chip.getMessage();
	}
	}
