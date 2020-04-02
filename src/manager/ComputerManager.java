package manager;

import model.AbstractComputer;

import java.util.LinkedList;
import java.util.List;

public class ComputerManager {

    private List<AbstractComputer> computers = new LinkedList<>();

    public void addComputers(List<AbstractComputer> computers) {
        this.computers.addAll(computers);
    }

    public void addComputer(AbstractComputer computer) {
        this.computers.add(computer);
    }

    public List<AbstractComputer> findWithPriceLowerThan(int price) {

        List<AbstractComputer> result = new LinkedList<>();
        for (AbstractComputer computer : computers) {
            if (computer.getPrice() < price) {
                result.add(computer);
            }
        }
        return result;
    }

}