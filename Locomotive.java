public interface Locomotive {
    Engine getEngine();
    Car getCar(int i);
    int getMaxCapacity();
    int seatsRemaining();
}
