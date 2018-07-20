package logic.BillLogic;

import logic.UserLogic.UserLogicFactory;
import logicservice.BillLogicService;
import vo.BillVO;

import java.util.List;

public class BillLogicServiceImpl implements BillLogicService{

    @Override
    public List<BillVO> getBillList() {

        return null;
    }

    @Override
    public boolean createBill(BillVO billVO) {
        return false;
    }

    @Override
    public boolean deleteBill(String gameName) {
        return false;
    }

    @Override
    public boolean modifyBill(BillVO billVO) {
        return false;
    }
}
