package logicservice;

import vo.BillVO;

import java.util.List;

public interface BillLogicService {

    /**
     * 一个用户查看账单列表
     * @param username 用户名
     * @return 返回账单列表。
     *
     * 若若列表为空，返回空列表。
     * 若用户名不存在等其他问题返回null
     */
    List<BillVO> getBillList(String username);

    /**
     * 新建账单
     * @param username 用户名
     * @param billVO 账单。 要求账单内容完整。
     * @return true新建成功
     *
     */
    boolean createBill(String username,BillVO billVO);


}

