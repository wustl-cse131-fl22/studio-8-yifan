package studio8;


public class Time {
	private int hour;
	private int minute;
	private boolean twelveFormat;
	
	public Time(int tempH, int tempM, boolean tempT) {
		hour = tempH;
		minute = tempM;
		twelveFormat = tempT;
	}
	
	

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", twelveFormat=" + twelveFormat + "]";
	}



	public static void main(String[] args) {
 
    	
    }

}