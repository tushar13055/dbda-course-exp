package date_time;

import java.util.*;
import java.time.LocalDate;
import java.time.*;


public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Current Date: "+LocalDate.now());
			
			System.out.println("Current Time: "+LocalTime.now());
			
			System.out.println("Current date and tim: "+LocalDateTime.now());
			System.out.println("Current year month day");
//			LocalDate joinDate=LocalDate.of(sc.nextInt(),sc.nextInt(), sc.nextInt());
//			System.out.println("join date :"+joinDate);
//			System.out.println("another year month day");
//			LocalDate dt=LocalDate.parse(sc.next());
//			System.out.println("join date :"+dt);
//			System.out.println("is before");
//			System.out.println(joinDate.isBefore(dt));
//			System.out.println("compare to");
//			System.out.println(joinDate.compareTo(dt));
//			System.out.println("days to add");
//			System.out.println(dt.plusDays(sc.nextLong()));
//			System.out.println("weeks to add");
//			System.out.println(dt.plusWeeks(sc.nextLong()));
			System.out.println("enter birthdate ");
			LocalDate bdy=LocalDate.parse(sc.next());
			int age=Period.between(bdy, LocalDate.now()).getYears();
			int age1=Period.between(bdy, LocalDate.now()).getMonths();
			int age2=Period.between(bdy, LocalDate.now()).getDays();
			System.out.println("Years: "+age+" Months: "+age1+" Days: "+age2);
			
		}
		

	}

}
