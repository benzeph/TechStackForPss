package me.zeph.techstack.pss.controller;

import me.zeph.techstack.pss.vo.UserVO;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LoginControllerTest {
	@Test
	public void shouldGoToLoginPageWhenUserNameIsEmpty() {
		LoginController loginController = new LoginController();
		UserVO userVO = new UserVO("", "123456");
		String viewName = loginController.login(userVO, new ExtendedModelMap());
		assertThat(viewName, is("login"));
	}
}
