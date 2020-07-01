package de.ars.schulung.tests.garage;

import de.ars.schulung.tests.garage.exception.ShiftNotPossibleException;

/**
 * A gear transmission.
 */
public class GearTransmission {

	private Integer currentGear;
	private final int maxGear;

	/**
	 *
	 * @param maxGear
	 * @throws IllegalArgumentException wenn...
	 */
	public GearTransmission(int maxGear) {
		if(maxGear<1) {
			throw new IllegalArgumentException();
		}
		this.maxGear = maxGear;
	}

	public void shiftUp() throws ShiftNotPossibleException {
		if (currentGear == null) {
			currentGear = 1;
		} else if (currentGear != maxGear) {
			currentGear++;
		} else {
			throw new ShiftNotPossibleException();
		}
	}

	public Integer getCurrentGear() {
		return currentGear;
	}

	public int getMaxGear() {
		return maxGear;
	}

}
