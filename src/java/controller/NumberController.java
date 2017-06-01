package controller;

import domain.Numbers;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/numbers")
public class NumberController {

    @RequestMapping(method = RequestMethod.GET)
    public String showNumbers(Model model) {
        Numbers theNumber = new Numbers();
        model.addAttribute("numbers", theNumber);
        return "numberForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    //Very importante: BindingResult direct na je @Valid parameter plaatsen, 
    //anders krijg je een prachtige "error 400 - bad request".
    public String processNumbers(@Valid @ModelAttribute Numbers numbers, BindingResult result, Model model) {
        if (result.hasErrors())
            return "numberForm";

        return "numberSuccess";
    }
    
}
