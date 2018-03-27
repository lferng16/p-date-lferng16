package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearIf(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonthIf(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDayIf(tomorrow));
		System.out.println(today.monthsLeft());
		System.out.println(today.dayOfWeek(1));
		System.out.println(today.isDayRight(this.day));
		System.out.println(today.getMonthName());
		System.out.println(today.setSeasonName());
		System.out.println(today.sameYear(2018));
	}

}
