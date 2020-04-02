package ua.lviv.iot.component.manager;

import manager.ComputerManager;
import model.AbstractComputer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ComputerManagerTest extends ComputerComponentManagerTest {

    private ComputerManager computerManager;

    @BeforeEach
    public void setUp() {
        computerManager = new ComputerManager();
        computerManager.addComputers(monitors);
    }

    @Test
    public void testFindWithPriceLowerThan() {
        List<AbstractComputer> computers = computerManager.findWithPriceLowerThan(70);
        assertEquals(3, computers.size());
        assertEquals(30, computers.get(0).getPrice());
        assertEquals(45, computers.get(1).getPrice());
        assertEquals(65, computers.get(2).getPrice());
    }

}
