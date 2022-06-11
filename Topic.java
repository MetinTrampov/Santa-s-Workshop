import java.util.ArrayList;
import java.util.List;

public class Topic  implements  Observable{

    private List<observer> observers;
    private String topic;

    public Topic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(observer observer) {
        this.observers.add(observer);
        observer.setTopic(this);
    }

    @Override
    public void unsubscribe(observer observer) {
        this.observers.remove(observer);
        System.out.println("Santa changed topic "+ topic  );
        observer.setTopic(null);
    }

    @Override
    public void notifyObservers() {
        for(observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
        this.notifyObservers();
    }

}
