package controller;

import model.Values;
import model.ValuesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ValuesConverter {

    final ValuesModel model;

    @Autowired
    public ValuesConverter(ValuesModel model) {
        this.model = model;
    }


    public String convert(String value1, double valueAmountValue1, String value2){
        if (model.getNotation(value1).equals(model.getNotation(value2))) {
            double firstValueScale = model.getValue(value1);
            double secondValueScale = model.getValue(value2);
            return String.valueOf(firstValueScale / secondValueScale * valueAmountValue1);
        }
        return "Величины разного типа";
    }

    public List<String> getListOfValues(){
        List<Values> enums = model.getValues();
        List<String> valuesNames = enums.stream().map(Values::getName).collect(Collectors.toList());
        return valuesNames;
    }

}
