package ru.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * service for converting and saving current data
 */
@Component
public class ValuesConverter {


    final ValuesModel model;
    String value1;
    String valueAmountValue1;
    String value2;

    /**
     * constructor
     * @param model data model for getting values
     */
    @Autowired
    public ValuesConverter(ValuesModel model) {
        this.model = model;
    }

    /**
     * getter for first value
     * @return name of first value
     */
    public String getValue1() {
        return value1;
    }

    /**
     * setter for first value
     * @param value1 name of first value
     */
    public void setValue1(String value1) {
        this.value1 = value1;
    }

    /**
     * getter for amount of first value
     * @return amount value
     */
    public String getValueAmountValue1() {
        return valueAmountValue1;
    }

    /**
     * setter for amount of first value
     * @param valueAmountValue1 amount value
     */
    public void setValueAmountValue1(String valueAmountValue1) {
        this.valueAmountValue1 = valueAmountValue1;
    }

    /**
     * getter for second value
     * @return name of second value
     */
    public String getValue2() {
        return value2;
    }

    /**
     * setter for second value
     * @param value2 name of second value
     */
    public void setValue2(String value2) {
        this.value2 = value2;
    }

    /**
     * method for converting values and returns result
     * @return if all data correct, result number,
     * if amount is lower than 0 - 'Incorrect amount',
     * if amount is not a number - 'Amount should be number',
     * if different types values - 'Different type values'
     */
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

    /**
     * method for getting list of value names
     * @return list of string value names
     */
    public List<String> getListOfValues(){
        List<Values> enums = model.getValues();
        List<String> valuesNames = enums.stream().map(Values::getName).collect(Collectors.toList());
        return valuesNames;
    }

}
