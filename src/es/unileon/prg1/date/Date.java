package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(){
		Date newDate=new Date(01/01/2018);
	}
	
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
	
	void setYear(int year){
		this.year=year;
	}
	void setMonth(int month){
		this.month=month;
	}
	void setDay(int day){
		this.day=day;
	}
	
	//IF.

	boolean isSameYearIf(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
	
	boolean isSameMonthIf(Date date){
		if(this.month==date.getMonth()){
			return true;
		}
		return false;
	}
	
	boolean isSameDayIf(Date date){
		if(this.day==date.getDay()){
			return true;
		}
		return false;
	}
	
	/*public int isSame(){
		return this.day;
		return this.month;
		return this.year;
	}
	*/
	boolean isSameIf (Date date){
		if(this.day==date.getDay() && this.month==date.getMonth() && this.year==date.getYear()){
			return true;
		}
		return false;
	}
	
	//SWITCH.
	
	public String getMonthName(){
		String month;
		switch(this.month){
			case 1:
				month="Enero";
				break;
			case 2:
				month="Febrero";
				break;
			case 3:
				month="Marzo";
				break;
			case 4:
				month="Abril";
				break;
			case 5:
				month="Mayo";
				break;
			case 6:
				month="Junio";
				break;
			case 7:
				month="Julio";
				break;
			case 8:
				month="Agosto";
				break;
			case 9:
				month="Septiembre";
				break;
			case 10:
				month="Octubre";
				break;
			case 11:
				month="Noviembre";
				break;
			case 12:
				month="Diciembre";
				break;
			default:
				month="No es un mes del año";
				break;
		}
		return month;
	}
	
	public boolean isDayRight(int day){
		boolean correctDay=false;
		switch(this.day){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10: 
			case 12:
				if(this.day >=1 && this.day <=31){
					correctDay=true;
				}
				break;
			case 2:
				if(this.day >=1 && this.day<=28){
					correctDay=true;
				}
				break;
			default:
				if(this.day >=1 && this.day<=30){
					correctDay=true;
				}
		}
		return correctDay;
	}
	
	
	public boolean setSeasonName(){
		
		switch(this.month){
			case 1:
			case 2:
			case 12:
				System.out.println("En este mes es invierno:");
				break;
			case 3:
			case 4: 
			case 5:
				System.out.println("En este mes es primavera.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("En este mes es verano.");
				break;
			default:
				System.out.println("En este mes es otoño.");
		}
	}
	
	//FOR.
	
	public String monthsLeft(){
		StringBuilder months=new StringBuilder();
		for(int i=this.month+1;i<=2;i++){
			months.append(this.getMonthName());
		}
		return months.toString();
	}
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	public int dayOfWeek(int dayJanuaryFirst){
		int day,today,totalDays;
		totalDays=this.daysYearUntilNow()-1;
		return totalDays%7+dayJanuaryFirst;
	}
	
	
	//WHILE DO-WHILE.
	
	public int attemptsDate(int year){
		int day;
		int month;
		boolean acierto=false;
		int intentos=0;
		while(!acierto){
			day=(int)(Math.random()*31+1);
			month=(int)(Math.random()*12+1);
			if(day==this.day && month==this.month && year==this.year){
				acierto=true;
				System.out.println("Se ha generado la misma fecha.");
			}
			else{
				acierto=false;
				System.out.println("Otra vez.");
			}
			intentos++;
		}
		System.out.println("Se han utilizado "+intentos+" intentos.");
	} 
}	