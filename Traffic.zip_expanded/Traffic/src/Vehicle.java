abstract public class Vehicle {
	 protected String vehicleNumber;
	 protected String typeOfVehicle;
	 
	 public String getvehicleNumber() {
		 return this.vehicleNumber;
	 }
	 public void setvehicleNumber(String vehicleNumber) {
		 this.vehicleNumber = vehicleNumber;
	 }
     public String getTypeOfVehicle() {
    	 return this.typeOfVehicle; 
     }
     abstract public void setTypeOfVehicle(String typeOfVehicle);
     abstract public String detectChip();
 
}
