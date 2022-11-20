public class FourWheeler extends Vehicle{
	private String owner;
	private Chip chip;
	
	public FourWheeler(String vehicleNumber,String typeOfVehicle,String owner)
	{
		this.vehicleNumber = vehicleNumber;
		this.setTypeOfVehicle(typeOfVehicle);
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setTypeOfVehicle(String typeOfVehicle)
	{
		if(typeOfVehicle == "c")
			this.typeOfVehicle = "Car";
		else if(typeOfVehicle == "t")
			this.typeOfVehicle = "Truck";
		else
			this.typeOfVehicle = "Car";
	}
	public String setowner() {
		return owner;
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
