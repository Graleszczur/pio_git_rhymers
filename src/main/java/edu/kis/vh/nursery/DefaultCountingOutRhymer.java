package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int NUMBER_12 = 12;
	public static final int MINUS_1 = -1;
	private int[] numbers = new int[NUMBER_12];

	public int total = MINUS_1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == MINUS_1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaBoo() {
		if (callCheck())
			return MINUS_1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return MINUS_1;
		return numbers[total--];
	}

}
