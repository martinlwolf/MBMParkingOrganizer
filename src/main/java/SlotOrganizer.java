import java.util.Stack;

public class SlotOrganizer {

    private Stack<Double> occupiedSlots;
    private Stack<Double> freeSlots;

    public Double nextFreeSlot() {
        occupiedSlots.push(freeSlots.peek());
        return freeSlots.pop();
    }

    public void liberateSlot(Double newFreeSlot) {
        occupiedSlots.remove(newFreeSlot);
        if (newFreeSlot < freeSlots.peek()) {
            freeSlots.push(newFreeSlot);
        }
        else {
            Double slotToOrder = freeSlots.pop();
            freeSlots.push(newFreeSlot);
            freeSlots.push(slotToOrder);
        }
    }
}
