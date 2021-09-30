import ru.testing.Values;
import ru.testing.ValuesModel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ValuesModelTest {

    ValuesModel model;

    @Before
    public void start(){
        model = new ValuesModel();
    }

    @Test
    public void getValue() {
        double result = model.getValue("Kilometer");
        assertEquals(1000.0, result, 0.1);
    }

    @Test
    public void getValuesByNotation() {
        List<Values> resultList = model.getValues();
        List<Values> trueList = new ArrayList<>();
        trueList.add(Values.Kilometers);
        trueList.add(Values.Meters);
        trueList.add(Values.Centimeters);
        trueList.add(Values.Inches);
        trueList.add(Values.Foots);
        trueList.add(Values.Yards);
        trueList.add(Values.Arshins);
        trueList.add(Values.Versts);
        trueList.add(Values.Kilograms);
        trueList.add(Values.Poods);
        trueList.add(Values.Ounces);
        assertEquals(trueList, resultList);
    }
}