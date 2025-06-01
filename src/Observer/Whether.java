package Observer;

import java.util.ArrayList;
import java.util.List;

public class Whether {
    int temperature;
    int humidity;
    List<Observer> observers = new ArrayList<Observer>();

    Whether(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;

        for(Observer observer : observers) {
            observer.notifyObserver(this);
        }
    }

    void addObserver(Observer observer) {
        observers.add(observer);
    }
}



class Test {
    public static void main(String[] args) {
        Whether whether = new Whether(100, 100);

        TVDisplay tv1 = new TVDisplay();
        TVDisplay tv2 = new TVDisplay();

        whether.addObserver(tv2);
        whether.addObserver(tv1);

        whether.update(4354, 300);

    }
}