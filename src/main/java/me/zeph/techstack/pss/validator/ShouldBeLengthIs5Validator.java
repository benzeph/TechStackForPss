package me.zeph.techstack.pss.validator;

import me.zeph.techstack.pss.annotation.ShouldBeLengthIs5;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ShouldBeLengthIs5Validator implements ConstraintValidator<ShouldBeLengthIs5, String> {

	@Override
	public void initialize(ShouldBeLengthIs5 shouldBeLengthIs5) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
		if (value.length() == 5) {
			return true;
		}
		return false;
	}
}
