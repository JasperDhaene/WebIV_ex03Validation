package controller;

import domain.Numbers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String processNumbers(
            @ModelAttribute Numbers numbers,
            Model model) {

        return "numberSuccess";
    }
    
}
