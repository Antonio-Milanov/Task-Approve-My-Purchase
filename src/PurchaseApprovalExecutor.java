import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */

public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line
        //I added the orders from 5 to 11

        manager.approve(1, 15000, Type.CONSUMABLES);
        manager.approve(2, 5000, Type.PC);
        manager.approve(3, 5000, Type.PC);
        manager.approve(4, 3000, Type.CLERICAL);
        manager.approve(5, 2000, Type.GADGETS);
        manager.approve(6, 4700, Type.GAMING);
        manager.approve(7, 4000, Type.PC);
        manager.approve(8, 300, Type.CONSUMABLES);
        manager.approve(9, 1800, Type.CLERICAL);
        manager.approve(10, 6000, Type.GAMING);
        manager.approve(11, 3200, Type.GADGETS);

    }
}
