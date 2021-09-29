import controller.ValuesConverter;
import model.ValuesModel;
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
        String result = converter.convert("Километр", 1, "Метр");
        assertEquals("1000.0", result);
    }

    @Test
    public void WrongConvert() {
        String result = converter.convert("Километр", 1, "Пуд");
        assertEquals("Величины разного типа", result);
    }

    @Test
    public void getListOfValuesNames() {
        List<String> valueNames = converter.getListOfValues();
        List<String> trueValues = new ArrayList<>();
        trueValues.add("Километр");
        trueValues.add("Метр");
        trueValues.add("Сантиметр");
        trueValues.add("Дюйм");
        trueValues.add("Фут");
        trueValues.add("Ярд");
        trueValues.add("Аршин");
        trueValues.add("Верста");
        trueValues.add("Килограмм");
        trueValues.add("Пуд");
        trueValues.add("Унция");
        assertEquals(trueValues, valueNames);
    }
}