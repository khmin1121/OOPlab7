
public class Toaster extends Product implements Cooker {

	@Override
	public String prepareFood() {
		return "preparing";
	}

	@Override
	public String getName() {
		return null;
	}

	
}
