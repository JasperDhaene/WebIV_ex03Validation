/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import domain.Numbers;
import javax.servlet.Registration;
import org.springframework.validation.Errors;

/**
 *
 * @author jasper
 */
public class Number1Validation {
    
    public boolean supports(Class<?> klass) {
        return Numbers.class.isAssignableFrom(klass);
    }

    
    public void validate(Object target, Errors errors) {
        Numbers numbers = (Numbers) target;
        
        Integer number1 = numbers.getNumber1();
        Integer number2 = numbers.getNumber2();
        if (number1 >= number2) {
            errors.rejectValue("number1",
                    "",
                    "number1 must be smaller than number2");
        }
    }
}
