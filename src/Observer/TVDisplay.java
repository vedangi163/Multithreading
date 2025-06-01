package Observer;

public class TVDisplay implements Observer {
    public void notifyObserver(Whether w) {
        System.out.println("temperature: "+w.temperature+ "humidity "+w.humidity);
    }
}

