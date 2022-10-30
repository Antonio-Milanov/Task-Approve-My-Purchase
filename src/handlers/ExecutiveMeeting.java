package handlers;

import common.Type;

/**
 * Used as a fallback in approval chain.
 * Should not contain any additional logic.
 * If abstract methods are changed, be free to edit signatures.
 */

public class ExecutiveMeeting extends Approver {
    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(int id, double cost, Type type) {
        //I used printf (not println), because I want to format the code to the second character after the comma:
        System.out.printf("Purchase with id %d that costs %.2f requires an approval of Executive Meeting.%n", id, cost);

    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        return false;
    }
}
