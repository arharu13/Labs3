package ua.lviv.iot.computerfirm.maneger;

import ua.lviv.iot.computerfirm.model.AbstractComputer;
import ua.lviv.iot.computerfirm.model.SortType;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ComputerManager implements ComputerManagerUtils, ComputersManager {

    private List<ua.lviv.iot.computerfirm.AbstractComputer> computers = new LinkedList<>();

    public static void sortByPrice(List<AbstractComputer> computers, SortType asc) {
    }

    public <Computer> List<AbstractComputer> findWithComputerGreaterThan(int price) {

        List<AbstractComputer> result = new LinkedList<>();
        AbstractComputer[] monitors = new AbstractComputer[0];
        for (AbstractComputer monitor : monitors){
            if (monitor.getPrice() > price){
                result.add(monitor);

            }
        }
        return result;
    }
    @Override
    public void addMonitors(List<ua.lviv.iot.computerfirm.AbstractComputer> computers) {
        this.computers.addAll(computers);
    }

    @Override

    public void addMonitor(List<ua.lviv.iot.computerfirm.AbstractComputer> monitors) {
    }
    public void addTransport(AbstractComputer computers) {
        this.computers.addAll((Collection<? extends ua.lviv.iot.computerfirm.AbstractComputer>) computers);
    }
}