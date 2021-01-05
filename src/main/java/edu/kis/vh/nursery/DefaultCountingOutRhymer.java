package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int RETURN = -1;

    private int[] numbers = new int[SIZE];

    public int total = - RETURN;

    public void countIn(int in) {

        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == RETURN;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }

}
