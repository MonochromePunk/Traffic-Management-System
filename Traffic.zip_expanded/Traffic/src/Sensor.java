public class Sensor {
	private int sensorNumber;
	private String sensorType;
	private float sensorRange;
	Sensor(int sensorNumber,String sensorType,float sensorRange){
		this.sensorNumber = sensorNumber;
		this.sensorType = sensorType;
		this.sensorRange = sensorRange;
		
	}
	public int getsensorNumber() {
		return sensorNumber;
	}
	public String setsensorType() {
		return sensorType;
	}
	public float getsensorRange() {
		return sensorRange;
	}
	
	public int countVehicles(Vehicle[] vehicle) {
		
		String regNo[] = new String[vehicle.length];
		int count = 0;
		for(int i = 0;i<vehicle.length;i++)
		{
			
			boolean check = false;
			for(int j = 0; j<count;j++)
			{
				if(vehicle[i].getvehicleNumber().equals(regNo[j]))
				{
					check = true;
				}
			}
			if(check == false)
			{
				regNo[count] = vehicle[i].getvehicleNumber();
				count++;
			}
		}
	
		return count;
	
	
	}
	
	
}
