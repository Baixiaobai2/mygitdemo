package com.mf.errorandexception.test;

import com.mf.errorandexception.bean.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class TestMain {

    public static void main(String[] args) {

//        普通全部校验
//        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//        Test test=new Test("",1);
//        Set<ConstraintViolation<Test>> violations = validator.validate(test);
//        for(ConstraintViolation violation: violations) {
//            System.out.println(violation.getPropertyPath()+"\t"+ violation.getMessage());
//        }

//        快速失败校验
        Validator validatorFastFail = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast","true").
                        buildValidatorFactory().getValidator();
        Test test=new Test("",null);
        Set<ConstraintViolation<Test>>  violationFastFailSet =  validatorFastFail.validate(test);
        for(ConstraintViolation violation : violationFastFailSet){
            System.out.println(violation.getPropertyPath() + "," + violation.getMessage());
        }

    }

}
