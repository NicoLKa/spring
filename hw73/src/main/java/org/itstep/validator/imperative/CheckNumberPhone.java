package org.itstep.validator.imperative;


import javax.validation.Constraint;
import javax.validation.Payload;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(value = {ElementType.FIELD, ElementType.METHOD})
@Retention(RUNTIME)
@Constraint(validatedBy = CheckNumberPhoneClass.class)
@Documented
public @interface CheckNumberPhone {
    public static final String MESSAGE = "CheckNumberPhone.registerModel.phone";

    String message() default MESSAGE;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}