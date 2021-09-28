package Model;

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
        int result = model.getValue("Килоньютоны");
        assertEquals(1000, result);
    }

    @Test
    public void getValuesByNotation() {
        List<Enum<Values>> resultList = model.getValuesByNotation("СИ");
        List<Enum<Values>> trueList = new ArrayList<>();
        trueList.add(Values.KiloNewtons);
        trueList.add(Values.Newtons);
        trueList.add(Values.MicroNewtons);
        assertEquals(trueList, resultList);
    }
}