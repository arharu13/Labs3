package ua.lviv.iot.computerfirm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.computerfirm.maneger.ComputerManager;
import ua.lviv.iot.computerfirm.model.AbstractComputer;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ComputerManegerTest extends ComputerComponentManagerTest {
	
	private ComputerManager computerManagerManager;
	
	@BeforeEach
	public void setUp() {
	 computerManagerManager = new ComputerManager();
	 computerManagerManager.addMonitors(monitors);
	}
	@Test
	public void testFindWithComputerGreaterThan (){
		List<AbstractComputer> monitor = computerManagerManager.findWithComputerGreaterThan(20);
		assertEquals(3, monitors.size());

		// sort result
		// verify found monitor price
		assertEquals(80,monitors.get(0).getPrice());
		assertEquals(68,monitors.get(1).getPrice());
	}
}