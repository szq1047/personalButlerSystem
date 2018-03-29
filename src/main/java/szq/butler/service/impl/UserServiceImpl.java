package szq.butler.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import szq.butler.common.UserInfoDTO;
import szq.butler.dao.UserDAO;
import szq.butler.service.UserService;

@Component
public class UserServiceImpl implements UserService{

	@Autowired 
	private UserDAO userDAO;
	
	public List<UserInfoDTO> getAllUserInfo() {
		return userDAO.getAllUserInfo();
	}
	
}
