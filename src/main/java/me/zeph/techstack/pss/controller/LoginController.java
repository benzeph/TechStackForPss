package me.zeph.techstack.pss.controller;

import me.zeph.techstack.pss.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Controller
public class LoginController {

	@Autowired
	Validator validator;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String jumpToLoginPage(UserVO userVO) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute UserVO userVO, Errors errors, Model model) {
		Set<ConstraintViolation<UserVO>> violations = validator.validate(userVO);
		if (violations.isEmpty()) {
			model.addAttribute("userVO ", userVO);
			return "home";
		}
		for (ConstraintViolation<UserVO> violation : violations) {
			String field = violation.getPropertyPath().toString();
			String errorCode = violation.getConstraintDescriptor().getAnnotation().annotationType().getSimpleName() + "." + field;
			errors.rejectValue(field, errorCode);
		}
		return "login";
	}

}
