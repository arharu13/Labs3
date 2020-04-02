package ua.lviv.iot.component.manager;

import manager.ComputerManagerUtils;
import model.SortTYPE;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerManagerUtilsTest extends ComputerComponentManagerTest {

    @Test
    public void testSortingDescending() {
        ComputerManagerUtils.sortByPrice(monitors, SortTYPE.DESC);
        assertEquals(65, monitors.get(0).getPrice());
        assertEquals(45, monitors.get(1).getPrice());
        assertEquals(30, monitors.get(2).getPrice());
    }


    @Test
    public void testSortEmptyList() {
        ComputerManagerUtils.sortByPrice(null, SortTYPE.DESC);
    }
}