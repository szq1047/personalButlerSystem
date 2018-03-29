package szq.butler.web.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

import szq.butler.common.UserInfoDTO;
import szq.butler.service.UserService;
 
public class UserInfoControllerTest extends BaseSARTest{
	@Autowired
	private UserService userService;

	@Test
	public void testGetAllUserInfo() {
		List<UserInfoDTO> list=userService.getAllUserInfo();
		logger.info("==="+JSON.toJSONString(list));
	}

}
