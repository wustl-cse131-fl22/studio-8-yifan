package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month; // all months have 31 days
	private int day;
	private int year;
	private boolean isHoliday;
	
	/**
	 * 
	 * @param tempM
	 * @param tempD
	 * @param tempY
	 * @param isH
	 */
	public Date(int tempM, int tempD, int tempY, boolean isH) {
		month = tempM;
		day = tempD;
		year = tempY;
		isHoliday = isH;
	}

    @Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		LinkedList<Date> list = new LinkedList<Date>();
		Date d1 = new Date(1,1,2020,true);
		Date d2 = new Date(1,1,2020,true);
		list.add(d1);
		list.add(d2);
		list.add(d1);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d2);
		set.add(d1);
		System.out.println(set);
    }

}
