package ua.lviv.iot.computerfirm;

import org.junit.jupiter.api.BeforeEach;

import java.util.LinkedList;
import java.util.List;
	public abstract class ComputerComponentManagerTest {
		
	protected List<AbstractComputer> monitors;
			@BeforeEach
			public void createMonitors () {
			monitors = new LinkedList<AbstractComputer>();
			monitors.add(new Monitors(80));
			monitors.add(new Monitors(68));
			monitors.add(new Monitors(112));

      }
}