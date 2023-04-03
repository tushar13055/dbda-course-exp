package utils;

import custom_exceptions.SpeedOutOfRangeException;

public class ValidationRules {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	
	// static init block
	static {
		MIN_SPEED = 30;
		MAX_SPEED = 80;
	}
	
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if(speed < MIN_SPEED) {
			throw new SpeedOutOfRangeException("Too slow nigga...");
		}
		
		if(speed > MAX_SPEED) {
			throw new SpeedOutOfRangeException("Ek din mar jayega kutte ki maut .....s");
		}
		
		System.out.println("Speed within range..");
	}
}
