package logic.BillLogic;

import dataservice.BillDataService;
import dataserviceFactory.BillDataServiceFactory;
import logic.UserLogic.UserLogicFactory;
import logicservice.BillLogicService;
import po.BillPO;
import vo.BillVO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BillLogicServiceImpl implements BillLogicService{

    @Override
    public List<BillVO> getBillList() {
        List<BillPO> billPOList=BillDataServiceFactory.getBillDataService().getBillListByUser(
                UserLogicFactory.getCurrentUserService().getCurrentUser()
        );
        List<BillVO> result=new ArrayList<>();
        for(BillPO billPO:billPOList){
            result.add(new BillVO(
                    billPO.getGameName(),
                    billPO.getPrice(),
                    LocalDate.parse(billPO.getDate(),DateTimeFormatter.BASIC_ISO_DATE),
                    billPO.getComment()
            ));
        }
        return result;
    }

    @Override
    public boolean createBill(BillVO billVO) {
        BillPO billPO=new BillPO(
                UserLogicFactory.getCurrentUserService().getCurrentUser(),
                billVO.getGameName(),
                billVO.getDate().format(DateTimeFormatter.BASIC_ISO_DATE),
                billVO.getPrice(),
                billVO.getComment()
        );
        return BillDataServiceFactory.getBillDataService().createBill(billPO);
    }

    @Override
    public boolean deleteBill(String gameName) {
        BillPO billPO=new BillPO();
        billPO.setGameName(gameName);
        return BillDataServiceFactory.getBillDataService().deleteBill(billPO);
    }

    @Override
    public boolean modifyBill(BillVO billVO) {
        BillPO billPO=new BillPO(
                UserLogicFactory.getCurrentUserService().getCurrentUser(),
                billVO.getGameName(),
                billVO.getDate().format(DateTimeFormatter.BASIC_ISO_DATE),
                billVO.getPrice(),
                billVO.getComment()
        );
        return BillDataServiceFactory.getBillDataService().modifyBill(billPO);
    }
}
