
public class RainfallStats {
	private int count=0;
	private double total=0;
	private double max =0;
	
	public void addMeasurement(double measurement)throws InvalidRainfallException{
		if (measurement <0) {
			throw new InvalidRainfallException("Invalid, Because Negative Value is not accepted.");
		}
		count = count + 1;
		total = total + measurement;
		if (measurement > max) {
			max = measurement;
		}
	}

	public int getCount() {
		return count;
	}

	public double getMean() {
		if (count == 0) {
			throw new IllegalStateException("Sorry,No any measurements entered.");
		}
		return total / count;
	}

	public double getMax() {
		if (count == 0) {
			throw new IllegalStateException("Sorry,No any measurements entered.");
		}
		return max;
	}

}
