package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonalTimeEx {

	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.of("US/Central");
		
		ZonedDateTime zt = ZonedDateTime.now(zone);
		
		System.out.println(zt);

	}

}
