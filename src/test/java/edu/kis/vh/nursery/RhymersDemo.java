package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	public static final int twenty = 20;
	public static final int three = 3;

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();
		
		DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
				factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < three; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[three].countIn(rn.nextInt(twenty));
		
		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[three]).reportRejected());
		
	}
	
}