package ru.testing;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping
public class ValuesController {

    public ValuesConverter converter;

    @Autowired
    public ValuesController(ValuesConverter converter) {
        this.converter = converter;
        converter.setValue1("Kilometer");
        converter.setValue2("Meter");
        converter.setValueAmountValue1("10");
    }

    @GetMapping("/valueConverter")
    public String start(Model model){
        model.addAttribute("values", converter.getListOfValues());
        model.addAttribute("first", converter.getValue1());
        model.addAttribute("amount", converter.getValueAmountValue1());
        model.addAttribute("second", converter.getValue2());
        model.addAttribute("result", converter.convert());
        return "valueConverter";
    }

    @PostMapping("/valueConverter")
    public String convert(@RequestParam("first") String value1,@RequestParam("amount") String amount,
                          @RequestParam("second") String value2) {
        converter.setValueAmountValue1(amount);
        converter.setValue2(value2);
        converter.setValue1(value1);
        return "redirect:/valueConverter";
    }
}
