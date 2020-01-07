package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

    DefaultCountingOutRhymer getStandardRhymer();//this is a comment to mock changes i've made earlier

    DefaultCountingOutRhymer getFalseRhymer();//this is a comment to mock class names changes i ve made earlier

    DefaultCountingOutRhymer getFIFORhymer();

    DefaultCountingOutRhymer getHanoiRhymer();

}
