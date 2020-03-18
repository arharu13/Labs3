package ua.lviv.iot.computerfirm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.computerfirm.maneger.ComputerManager;
import ua.lviv.iot.computerfirm.model.AbstractComputer;
import ua.lviv.iot.computerfirm.model.SortType;

import java.util.List;

public  class ComputerManagerUtilsTest extends ComputerComponentManagerTest{

	private static  List<AbstractComputer> Monitor = null;

	@Test
	public void testSortingDescending() {
		ComputerManager.sortByPrice(Monitor, SortType.DESC);
		Assertions.assertEquals(112,monitors.get(0).getPrice());
		Assertions.assertEquals(80,monitors.get(1).getPrice());
		Assertions.assertEquals(68,monitors.get(2).getPrice());
		}
}
