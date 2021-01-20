package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int EMPTY = -1;
    private static final int CAPACITY = SIZE - 1;
    private final int[] numbers = new int[getSIZE()];

    private int total = getEMPTY();

    public static int getSIZE() {
        return SIZE;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public void countIn(int in) {

        if (!isFull())
            numbers[total = getTotal() + 1] = in;
    }

    public boolean callCheck() {
        return getTotal() == getEMPTY();
    }

    public boolean isFull() {
        return getTotal() == getCAPACITY();
    }

    protected int peekaboo() {
        if (callCheck())
            return getEMPTY();
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return getEMPTY();
        return numbers[total = getTotal() - 1];
    }

    public int getTotal() {
        return total;
    }
}
