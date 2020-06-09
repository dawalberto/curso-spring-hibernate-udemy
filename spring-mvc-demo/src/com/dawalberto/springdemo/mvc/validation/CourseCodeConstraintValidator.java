package com.dawalberto.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
	implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode  theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		if (theCode == null) {
			return false;
		}
		
		boolean result = false;
		
		for (String code : coursePrefix) {
			result = theCode.startsWith(code);
			
			if (result) {
				break;
			}
		}
		
		return result;
		
	}

}
