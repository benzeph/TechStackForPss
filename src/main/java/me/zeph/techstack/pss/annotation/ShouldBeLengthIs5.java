package me.zeph.techstack.pss.annotation;

import me.zeph.techstack.pss.validator.ShouldBeLengthIs5Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ShouldBeLengthIs5Validator.class)
public @interface ShouldBeLengthIs5 {
	String message() default "somethings";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
