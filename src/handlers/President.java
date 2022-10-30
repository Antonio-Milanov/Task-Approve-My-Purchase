package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */

public class President extends Approver {

    @Override
    public void approve(int id, double cost, Type type) {

        if (canApprove(id, cost, type)) {
            //I used printf (not println), because I want to format the code to the second character after the comma:
            System.out.printf("President approved purchase with id %d that costs %.2f%n", id, cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than President.");

        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        boolean result = false;

        switch (type) {
            case CONSUMABLES:
                if (cost <= 1000) {
                    result = true;
                } else {
                    break;
                }
            case CLERICAL:
                if (cost <= 2000) {
                    result = true;
                } else {
                    break;
                }
            case GADGETS:
                if (cost <= 3000) {
                    result = true;
                } else {
                    break;
                }
            case GAMING:
                if (cost <= 5000) {
                    result = true;
                } else {
                    break;
                }
            case PC:
                if (cost <= 8000) {
                    result = true;
                } else {
                    break;
                }
        }
        return result;
    }
}
