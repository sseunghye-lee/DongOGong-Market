package com.dongogong.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.dongogong.controller.UserInfoForm;
import com.dongogong.domain.UserInfo;

@Component
public class UserInfoFormValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return UserInfoForm.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object obj, Errors errors) {
		UserInfoForm userInfoForm = (UserInfoForm) obj;
		UserInfo userInfo = userInfoForm.getUserInfo();
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userInfo.name", "NAME_REQUIRED", "Name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userInfo.nickName", "NICKNAME_REQUIRED", "NickName is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userInfo.phone", "PHONE_REQUIRED", "Phone number is required.");
		
		if (userInfoForm.isNewUserInfo()) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userInfo.userId", "USER_ID_REQUIRED", "User ID is required.");
			if (userInfo.getPassword() == null || userInfo.getPassword().length() < 1 || !userInfo.getPassword().equals(userInfoForm.getRepeatedPassword())) {
				errors.reject("PASSWORD_MISMATCH", "Passwords did not match or were not provided. Matching passwords are required.");
			}
		}
		else if (userInfo.getPassword() != null && userInfo.getPassword().length() > 0) {
			if (!userInfo.getPassword().equals(userInfoForm.getRepeatedPassword())) {
				errors.reject("PASSWORD_MISMATCH", "Passwords did not match. Matching passwords are required.");
			}
		}
	}
}
