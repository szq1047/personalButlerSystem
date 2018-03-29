package szq.butler.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

import szq.butler.common.UserInfoDTO;
import szq.butler.constant.ButlerRspCodeConstants;
import szq.butler.constant.CommonVO;
import szq.butler.service.UserService;

@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	private Logger logger=Logger.getLogger(this.getClass());
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/getAllUserInfo")
	public CommonVO getAllUserInfo() {
		CommonVO vo=new CommonVO();
		List<UserInfoDTO> userList=userService.getAllUserInfo();
		if(CollectionUtils.isEmpty(userList)) {
			logger.info("UserInfoController-getAllUserInfo：没有用户信息");
			vo.setResponseCode(ButlerRspCodeConstants.USER_EMPTY);
			vo.setResponseMsg("UserInfoController-getAllUserInfo：没有用户信息");
			return vo;
		}
		logger.info("userList="+JSON.toJSONString(userList));
		return vo;
	}
}
