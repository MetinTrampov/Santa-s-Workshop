public interface Observable {

    void subscribe(observer observer);
    void unsubscribe(observer observer);

    void notifyObservers();
    String getUpdate();

}
