import ru.testing.ValuesConverter;
import ru.testing.ValuesModel;
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
    public void convert() {
        converter.setValue1("Kilometer");
        converter.setValue2("Meter");
        converter.setValueAmountValue1("1");
        String result = converter.convert();
        assertEquals("1000.0", result);
    }

    @Test
    public void differentTypesConvert() {
        converter.setValue1("Kilometer");
        converter.setValue2("Pood");
        converter.setValueAmountValue1("1");
        String result = converter.convert();
        assertEquals("Different type values", result);
    }

    @Test
    public void wrongAmountConvert() {
        converter.setValue1("Kilometer");
        converter.setValue2("Kilometer");
        converter.setValueAmountValue1("-1");
        String result = converter.convert();
        assertEquals("Incorrect amount", result);
    }

    @Test
    public void incorrectAmountConvert() {
        converter.setValue1("Kilometer");
        converter.setValue2("Kilometer");
        converter.setValueAmountValue1("sdf sf");
        String result = converter.convert();
        assertEquals("Amount should be number", result);
    }

    @Test
    public void getListOfValuesNames() {
        List<String> valueNames = converter.getListOfValues();
        List<String> trueValues = new ArrayList<>();
        trueValues.add("Kilometer");
        trueValues.add("Meter");
        trueValues.add("Centimeter");
        trueValues.add("Inch");
        trueValues.add("Foot");
        trueValues.add("Yard");
        trueValues.add("Arshin");
        trueValues.add("Verst");
        trueValues.add("Kilogram");
        trueValues.add("Pood");
        trueValues.add("Ounce");
        assertEquals(trueValues, valueNames);
    }
}