package java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
//		Date date = new Date();
//		
//		System.out.println(date);
		
		LocalDate birthdate = LocalDate.of(1998, 01, 01);
		
		LocalDate currentdate = LocalDate.now();
		
		Period p = Period.between(birthdate, currentdate);
		
		System.out.printf("your age is :- %d years, %d months, %d days",p.getYears(),p.getMonths(),p.getDays());
	}

}
