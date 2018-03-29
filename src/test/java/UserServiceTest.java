import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;

import szq.butler.common.UserInfoDTO;
import szq.butler.constant.ButlerRspCodeConstants;
import szq.butler.constant.CommonVO;
import szq.butler.dao.UserDAO;
import szq.butler.service.UserService;

public class UserServiceTest {
	private Logger logger=Logger.getLogger(this.getClass());
	@Autowired
	private UserService userService;
	
	@Test
	public void getAllUser() {
		List<UserInfoDTO> userList=userService.getAllUserInfo();
		CommonVO vo=new CommonVO();
		if(CollectionUtils.isEmpty(userList)) {
			vo.setResponseCode(ButlerRspCodeConstants.USER_EMPTY);
			vo.setResponseMsg("ÓÃ»§Îª¿Õ");
		}
		logger.debug("==="+JSON.toJSONString(vo));
	}
}
