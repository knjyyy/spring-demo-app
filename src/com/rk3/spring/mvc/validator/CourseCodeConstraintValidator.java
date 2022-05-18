package com.rk3.spring.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.rk3.spring.mvc.annotation.CourseCode;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefixes;

	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefixes = courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {

		boolean result = false;

		if (code != null)
		{
			for(String pre: coursePrefixes) {
				result = code.startsWith(pre);
				if(result)
					break;
			}
		}
		else
			result = true;

		return result;
	}

}
