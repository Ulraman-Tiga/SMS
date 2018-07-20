package data.BillData;

import dataservice.BillDataService;
import po.BillPO;

import java.util.List;

public class BillDataServiceImpl implements BillDataService {
    @Override
    public boolean createBill(BillPO billPO) {
        return false;
    }

    @Override
    public boolean deleteBill(BillPO billPO) {
        return false;
    }

    @Override
    public boolean modifyBill(BillPO billPO) {
        return false;
    }

    @Override
    public List<BillPO> getBillListByUser(String username) {
        return null;
    }
}
