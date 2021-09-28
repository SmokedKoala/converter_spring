package Controller;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ValuesConverterTest {

    ValuesConverter converter;

    @Before
    public void start(){
        converter = new ValuesConverter();
    }

    @Test
    public void Convert() {
        int result = converter.convert("Ньютоны", 1000, "Килоньютоны");
        assertEquals(1, result);
    }

    @Test
    public void getListOfValuesNames() {
        List<String> valueNames = converter.getListOfValuesNames("СИ");
        List<String> trueValues = new ArrayList<>();
        trueValues.add("Ньютоны");
        trueValues.add("Микроньютоны");
        trueValues.add("Килоньютоны");
        assertEquals(trueValues, valueNames);
    }
}