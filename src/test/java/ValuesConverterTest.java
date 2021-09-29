import Controller.ValuesConverter;
import Model.ValuesModel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ValuesConverterTest {

    ValuesModel model;
    ValuesConverter converter;

    @Before
    public void start(){
        model = new ValuesModel();
        converter = new ValuesConverter(model);
    }

    @Test
    public void Convert() {
        double result = converter.convert("Ньютоны", 10, "Килоньютоны");
        assertEquals(10000, result, 0.1);
    }

    @Test
    public void getListOfValuesNames() {
        List<String> valueNames = converter.getListOfValuesNames("СИ");
        List<String> trueValues = new ArrayList<>();
        trueValues.add("Килоньютоны");
        trueValues.add("Ньютоны");
        trueValues.add("Микроньютоны");
        assertEquals(trueValues, valueNames);
    }
}