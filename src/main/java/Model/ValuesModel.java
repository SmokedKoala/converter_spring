package Model;


import org.springframework.stereotype.Component;

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

    public List<Values> getValuesByNotation(String notation){
        List<Values> notationValues = new ArrayList<>();
        for(Values value : Values.values())
            if (value.getNotation().equals(notation))
                notationValues.add(value);
        return notationValues;
    }
}
