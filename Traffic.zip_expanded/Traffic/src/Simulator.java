import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Simulator {
	private int noOfLanes;
	private Vehicle vehicle[][];
	
	
	
	public Simulator()
	{	
		try {
		File fr = new File("/Users/vaisakh/eclipse-workspace/Traffic/src/data.txt");
		Scanner stdin = new Scanner(fr);
		String location;
		String station;
		System.out.print("Junction Name: ");
		location = stdin.next();
		System.out.println(location);
		
		
		
		System.out.print("Station Name: ");
		station = stdin.next();
		System.out.println(station);
		
		System.out.print("No of lanes: ");
		this.noOfLanes = stdin.nextInt();
		System.out.println(this.noOfLanes);
		
		Machine system = new Machine(location, station, noOfLanes);
		
		
		Lane tLane = null;
		Lane fLane = null;
		
		for(int i = 0; i<this.noOfLanes;i++)
		{
			System.out.println("\nLane No : "+i);
			String laneTo, laneFrom;
			
			System.out.print("Lane From: ");
			laneFrom = stdin.next();
			System.out.println(laneFrom);
			
			
			System.out.print("Lane To: ");
			laneTo = stdin.next();
			System.out.println(laneTo);
			Lane lane;
			
			lane = new Lane(i, laneTo, laneFrom);
			
			
			
			if(i==0)
			{
				tLane = lane;
				fLane = lane;
				system.setCurrentLane(lane);
				
			}
			else
			{
				tLane.setNextLane(lane);
				tLane = lane;
				
			}
		}
		tLane.setNextLane(fLane);
		
		
		
		Lane llane = system.getCurrentLane();
		llane = llane.getNextLane();
		
		int clCount = -1;
		
			
		while(fr.length()!=0)
			
		{
			while(system.getCurrentLane().getLaneNumber()!=0)
			{
				system.setCurrentLane(system.getCurrentLane().getNextLane());
				
			}
				
			if(clCount<this.noOfLanes-1)
				clCount++;
			else
				clCount = 0;
		
			
		vehicle = new Vehicle[this.noOfLanes][];
		for(int i = 0; i<this.noOfLanes;i++)
		{
			
		
			int count_1 = stdin.nextInt();
		
			
			
			int count_2 = stdin.nextInt();
		
			
			int count = count_1 + count_2;
			vehicle[i] = new Vehicle[count];
			System.out.println("\nVehicle Number in Lane "+i);
			for(int j = 0; j<count_1;j++)
			{
				String vehicle_num;
				String vehicle_type;
				String vehicle_owner;
				
				vehicle_num = stdin.next();
				System.out.println(vehicle_num);
				
				
			
				vehicle_type = stdin.next();
				
				
				
				vehicle_owner = stdin.next();
				
				
				
				vehicle[i][j] = new TwoWheeler(vehicle_num, vehicle_type, vehicle_owner);
			}
			for(int j = count_1;j<count;j++)
			{
				String vehicle_num;
				String vehicle_type;
				String vehicle_owner;
			
				vehicle_num = stdin.next();
				System.out.println(vehicle_num);
				
				vehicle_type = stdin.next();
				
				vehicle_owner = stdin.next();
				
				vehicle[i][j] = new FourWheeler(vehicle_num, vehicle_type, vehicle_owner);
			}
			system.getCurrentLane().setVehicle(vehicle[i]);
		
			system.setCurrentLane(system.getCurrentLane().getNextLane());
		}
	
		
	
		
	
		
		
	
		Lane tLanes = system.getCurrentLane();
		for(int i = 0; i<this.noOfLanes;i++)
		{
			boolean ambCheck = false;
			ambCheck = stdin.nextBoolean();
			
			if(ambCheck == true)
			{
				String ambReg = stdin.next();
				String ambName = stdin.next();
				String msg = stdin.next();
				Double time1,time2;
				time1 = stdin.nextDouble();
				time2 = stdin.nextDouble();
				if(time1-time2==0 || time1==0 || time2 == 0)
				{
					throw new ArithmeticException();
				}
				time1/=2;
				time2/=2;
				double distance1 = 300000000 * time1;
				double distance2 = 300000000 * time2;
				
				Ambulance amb = new Ambulance(ambReg, ambName);
				amb.setDistanceOne(distance1);
				amb.setDistanceTwo(distance2);
				tLanes.setAmbulance(amb);
				amb.getChip().setMessage(msg);
				
			}
			else
			{
				tLanes.setAmbulance(null);
			}
			
			tLanes = tLanes.getNextLane();
			
		}
		
		
		
		boolean checkPed = false;
	
		checkPed = stdin.nextBoolean();

		if(checkPed == true)
		{
			
			int lno;
			lno = stdin.nextInt();
			
			String pname = stdin.next();
		
			int page = stdin.nextInt();
			
			Pedestrian p = new Pedestrian(pname, page);
			for(int i = 0; i<this.noOfLanes;i++)
			{
				if(system.getCurrentLane().getLaneNumber()==lno)
				{
					system.getCurrentLane().setPedestrian(p);
				}
				else
				{
					system.getCurrentLane().setPedestrian(null);
				}
				system.setCurrentLane(system.getCurrentLane().getNextLane());
			}
			
		}
		else
		{
			for(int i = 0 ; i<this.noOfLanes;i++)
			{
				system.getCurrentLane().setPedestrian(null);
				system.setCurrentLane(system.getCurrentLane().getNextLane());
			}
			
		}
		
		

	
	
		system.startProcess(clCount);
		}
		
		}
		
		
		catch(Exception e)
		{
			System.out.println("\n\nEnd of Simulation");
		}
		
		
	}

}
