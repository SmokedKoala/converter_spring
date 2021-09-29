package view;

import controller.ValuesConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ValuesController {

    @Autowired
    public ValuesConverter converter;
}
