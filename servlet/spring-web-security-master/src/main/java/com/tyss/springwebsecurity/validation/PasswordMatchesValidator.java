//package com.tyss.springwebsecurity.validation;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//import com.tyss.springwebsecurity.annotation.PasswordMatches;
//import com.tyss.springwebsecurity.bean.UserBean;
//
//public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
//
//	@Override
//	public void initialize(PasswordMatches constraintAnnotation) {
//	}
//
//	@Override
//	public boolean isValid(Object obj, ConstraintValidatorContext context) {
//		UserBean user = (UserBean) obj;
//		return user.getPassword().equals(user.getPassword());
//	}
//
//}
