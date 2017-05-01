
public class Laptop extends Product implements Networked,DataStorage {
	
	private double totalCapacity;
	private double usedCapacity;
	
	@Override	
	public double getFreeCapacity(){
		return 4.5;
	}
	@Override
	public void format(){
		System.out.println("This is format");
	}
	@Override	
	public boolean isConnected(){
		return true;
	}
	@Override
	public double maxSpeed(){
		return 10.0;
	}
	
	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		this.usedCapacity = usedCapacity;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
