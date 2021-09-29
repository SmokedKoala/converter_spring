import Model.Values;
import Model.ValuesModel;
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
        double result = model.getValue("Килоньютоны");
        assertEquals(1000.0, result, 0.1);
    }

    @Test
    public void getValuesByNotation() {
        List<Values> resultList = model.getValuesByNotation("СИ");
        List<Values> trueList = new ArrayList<>();
        trueList.add(Values.KiloNewtons);
        trueList.add(Values.Newtons);
        trueList.add(Values.MicroNewtons);
        assertEquals(trueList, resultList);
    }
}