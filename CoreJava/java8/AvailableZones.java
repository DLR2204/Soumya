package java8;

import java.time.ZoneId;
import java.util.Set;

public class AvailableZones {

public static void main(String[] args) {
		
		Set set = ZoneId.getAvailableZoneIds();
		
		for(Object zones:set) {
			
			System.out.println(zones);
		}
		
	}
}
