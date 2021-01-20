package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int RETURN = -1;

    private int[] numbers = new int[getSIZE()];

    private int total = -getRETURN();

    public static int getSIZE() {
        return SIZE;
    }

    public static int getRETURN() {
        return RETURN;
    }

    public void countIn(int in) {

        if (!isFull())
            numbers[total = getTotal() + 1] = in;
    }

    public boolean callCheck() {
        return getTotal() == getRETURN();
    }

    public boolean isFull() {
        return getTotal() == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return getRETURN();
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return getRETURN();
        return numbers[total = getTotal() - 1];
    }

    public int getTotal() {
        return total;
    }
}
