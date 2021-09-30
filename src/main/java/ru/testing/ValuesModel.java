package ru.testing;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * model for getting data
 */
@Component
public class ValuesModel {

    /**
     * method for getting value scale
     * @param name string name of value
     * @return scale number of value
     */
    public double getValue(String name){
        Values necessaryValue = null;
        for(Values value : Values.values())
            if (value.getName().equals(name))
                necessaryValue = value;
        return necessaryValue.getScale();
    }

    /**
     * method for getting value type
     * @param name string name of value
     * @return type of value
     */
    public String getNotation(String name){
        Values necessaryValue = null;
        for(Values value : Values.values())
            if (value.getName().equals(name))
                necessaryValue = value;
        return necessaryValue.getNotation();
    }

    /**
     * method for getting list of enum values
     * @return list of enum elements
     */
    public List<Values> getValues(){
        List<Values> notationValues = new ArrayList<>();
        for(Values value : Values.values())
                notationValues.add(value);
        return notationValues;
    }
}
