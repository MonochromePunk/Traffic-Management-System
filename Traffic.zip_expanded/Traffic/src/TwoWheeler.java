public class TwoWheeler extends Vehicle{
	private String owner;
	private Chip chip;
	public TwoWheeler(String vehicleNumber,String typeOfVehicle,String owner)
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
		if(typeOfVehicle == "b")
			this.typeOfVehicle = "Bike";
		else if(typeOfVehicle == "s")
			this.typeOfVehicle = "Scooter";
		else
			this.typeOfVehicle = "Bike";
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
