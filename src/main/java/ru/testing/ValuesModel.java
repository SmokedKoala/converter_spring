package ru.testing;


import org.springframework.stereotype.Component;
import ru.testing.Values;

import java.util.ArrayList;
import java.util.List;

@Component
public class ValuesModel {

    public double getValue(String name){
        Values necessaryValue = null;
        for(Values value : Values.values())
            if (value.getName().equals(name))
                necessaryValue = value;
        return necessaryValue.getScale();
    }

    public String getNotation(String name){
        Values necessaryValue = null;
        for(Values value : Values.values())
            if (value.getName().equals(name))
                necessaryValue = value;
        return necessaryValue.getNotation();
    }

    public List<Values> getValues(){
        List<Values> notationValues = new ArrayList<>();
        for(Values value : Values.values())
                notationValues.add(value);
        return notationValues;
    }
}
