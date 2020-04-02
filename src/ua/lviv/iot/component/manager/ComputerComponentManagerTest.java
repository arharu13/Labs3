package ua.lviv.iot.component.manager;

import model.AbstractComputer;
import model.Monitor;
import org.junit.jupiter.api.BeforeEach;

import java.util.LinkedList;
import java.util.List;

public abstract class ComputerComponentManagerTest {

    protected List<AbstractComputer> monitors;

    @BeforeEach
    public void createMonitors() {
        monitors = new LinkedList<AbstractComputer>();
        monitors.add(new Monitor(30));
        monitors.add(new Monitor(45));
        monitors.add(new Monitor(65));
    }
}
