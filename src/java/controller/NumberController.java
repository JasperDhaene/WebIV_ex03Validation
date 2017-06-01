package controller;

import domain.Numbers;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import validator.Number1Validation;

@Controller
@RequestMapping("/numbers")
public class NumberController {

    @Autowired
    private Number1Validation number1Validation ;
    
    @RequestMapping(method = RequestMethod.GET)
    public String showNumbers(Model model) {
        Numbers theNumber = new Numbers();
        model.addAttribute("numbers", theNumber);
        return "numberForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    //Very importante: BindingResult direct na je @Valid parameter plaatsen, 
    //anders krijg je een prachtige "error 400 - bad request".
    public String processNumbers(@Valid Numbers numbers, BindingResult result, Model model) {
        number1Validation.validate(numbers, result);
        if (result.hasErrors())
            return "numberForm";

        return "numberSuccess";
    }
    
}
