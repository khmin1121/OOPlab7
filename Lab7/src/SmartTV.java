
public class SmartTV extends Product implements Networked {
	private int channel;
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isConnected(){
		return true;
	}
	
	@Override
	public double maxSpeed(){
		return 777;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
