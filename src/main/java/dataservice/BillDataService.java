package dataservice;

import po.BillPO;

import java.util.List;

public interface BillDataService {
    boolean createBill(BillPO billPO);
    boolean deleteBill(BillPO billPO);
    boolean modifyBill(BillPO billPO);
    List<BillPO> getBillListByUser(String username);
}
