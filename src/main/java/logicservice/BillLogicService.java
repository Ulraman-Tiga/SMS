package logicservice;

import vo.BillVO;

import java.util.List;

public interface BillLogicService {

    /**
     * 一个用户查看账单列表
     * @return 返回账单列表。
     *
     * 若若列表为空，返回空列表。
     * 若用户名不存在等其他问题返回null
     */
    List<BillVO> getBillList();

    /**
     * 新建账单
     * @param billVO 账单。 要求账单内容完整。
     * @return true新建成功
     *
     */
    boolean createBill(BillVO billVO);

    /**
     * 删除账单
     * @param gameName 游戏名
     * @return true 修改成功
     */
    boolean deleteBill(String gameName);

    /**
     * 修改账单
     * @param billVO 账单完整信息（修改后）
     * @return true 修改成功
     */
    boolean modifyBill(BillVO billVO);


}

