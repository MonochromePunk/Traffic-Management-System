import java.util.Scanner;

public class Lane {
	private int laneNumber;
	private String laneFrom;
	private String laneTo;
	public Lane nextLane;
	private Button button;
	private TimerDisplay timer;
	private PassLight light;
	private SignalLight signal;
	private Vehicle vehicle[];
	private Ambulance ambulance;
	private Sensor sensor;
	private Pedestrian pedestrian;
	
	
	public Vehicle[] getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle[] vehicle) {
		this.vehicle = vehicle;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	Lane(int laneNumber,String laneTo, String laneFrom){
		
		this.laneFrom = laneFrom;
		this.laneTo = laneTo;
		this.laneNumber = laneNumber;
		this.vehicle = null;
		this.ambulance = null;
		this.timer = new TimerDisplay();
		this.signal = new SignalLight();
		this.sensor = new Sensor(1,"IR",500);
		this.pedestrian = null;
	
		
		this.light = new PassLight();
	}
	
	public Pedestrian getPedestrian() {
		return pedestrian;
	}

	public void setPedestrian(Pedestrian pedestrian) {
		this.pedestrian = pedestrian;
	}

	public void setNextLane(Lane lane)
	{
		this.nextLane = lane;
	}
	public Lane getNextLane()
	{
		return this.nextLane;
	}
	
	public int getLaneNumber() {
		return laneNumber;
	}
	public String getLaneFrom() {
		return laneFrom;
	}
	public String getLaneTo() {
		return laneTo;
	}
	
	
	
	public TimerDisplay getTimer() {
		return timer;
	}

	public void setTimer(TimerDisplay timer) {
		this.timer = timer;
	}

	public SignalLight getSignal() {
		return signal;
	}

	public void setSignal(SignalLight signal) {
		this.signal = signal;
	}

	public boolean checkAmbulance() {
		
		if(this.ambulance == null)
			return false;
		
		return true;
		
	}
	
	
	
	public Ambulance getAmbulance() {
		return ambulance;
	}

	public void setAmbulance(Ambulance ambulance) {
		this.ambulance = ambulance;
	}

	public PassLight getLight() {
		return light;
	}

	public void setLight(PassLight light) {
		this.light = light;
	}

	public double calculateApproachTime() {
		
		
		
		double difference = this.ambulance.getDistanceOne()-this.ambulance.getDistanceTwo();
		double time = difference/2;
		return time;
	}
	public void activateSensor() {
		
	}
	
	public boolean checkPedestrian()
	{
	
		if(this.pedestrian == null)
			return false;
		return true;
	}
	
	public int countVehicle(Vehicle[] vehicle)
	{
	
		return this.getSensor().countVehicles(vehicle);
	}
}
