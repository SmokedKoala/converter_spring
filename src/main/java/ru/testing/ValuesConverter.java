package ru.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ValuesConverter {


    final ValuesModel model;
    String value1;
    String valueAmountValue1;
    String value2;

    @Autowired
    public ValuesConverter(ValuesModel model) {
        this.model = model;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValueAmountValue1() {
        return valueAmountValue1;
    }

    public void setValueAmountValue1(String valueAmountValue1) {
        this.valueAmountValue1 = valueAmountValue1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String convert(){
        try {
            if (Double.valueOf(valueAmountValue1) <0)
                return "Incorrect amount";
            if (model.getNotation(value1).equals(model.getNotation(value2))) {
                double firstValueScale = model.getValue(value1);
                double secondValueScale = model.getValue(value2);
                return String.valueOf(firstValueScale / secondValueScale * Double.valueOf(valueAmountValue1));
            }
            return "Different type values";
        } catch (NumberFormatException e){
            return "Amount should be number";
        }

    }

    public List<String> getListOfValues(){
        List<Values> enums = model.getValues();
        List<String> valuesNames = enums.stream().map(Values::getName).collect(Collectors.toList());
        return valuesNames;
    }

}
