package com.tcdt.qlnvluukho.contraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = CompareDateValidator.class)
@Target({ TYPE, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Documented
public @interface CompareDate {
	String message() default "{com.tcdt.qlnvluukho.contraints.CompareDate.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String before();

	String after();

	/**
	 * Defines several <code>@CompareDate</code> annotations on the same element
	 *
	 * @see CompareDate
	 */
	@Target({ TYPE, FIELD, ANNOTATION_TYPE })
	@Retention(RUNTIME)
	@Documented
	@interface List {
		CompareDate[] value();
	}
}
