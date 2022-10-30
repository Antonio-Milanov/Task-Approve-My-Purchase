package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */

public class Director extends Approver {

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            //I used printf (not println), because I want to format the code to the second character after the comma:
            System.out.printf("Director approved purchase with id %d that costs %.2f%n", id, cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        boolean result = false;

        switch (type) {
            case CONSUMABLES:
                if (cost <= 500) {
                    result = true;
                } else {
                    break;
                }
            case CLERICAL:
                if (cost <= 1000) {
                    result = true;
                } else {
                    break;
                }
            case GADGETS:
                if (cost <= 1500) {
                    result = true;
                } else {
                    break;
                }
            case GAMING:
                if (cost <= 3500) {
                    result = true;
                } else {
                    break;
                }
            case PC:
                if (cost <= 6000) {
                    result = true;
                } else {
                    break;
                }
        }
        return result;
    }
}
