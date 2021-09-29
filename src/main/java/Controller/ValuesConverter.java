package Controller;

import Model.Values;
import Model.ValuesModel;
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


    public double convert(String value1, double valueAmountValue1, String value2){
        double firstValueScale = model.getValue(value1);
        double secondValueScale = model.getValue(value2);
        return firstValueScale*secondValueScale*valueAmountValue1;
    }

    public List<String> getListOfValuesNames(String notation){
        List<Values> enums = model.getValuesByNotation(notation);
        List<String> valuesNames = enums.stream().map(Values::getName).collect(Collectors.toList());
        return valuesNames;
    }
}
