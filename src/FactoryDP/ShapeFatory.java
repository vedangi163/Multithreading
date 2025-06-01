package FactoryDP;

import java.util.*;
public class ShapeFatory {

    static Shape getInstance(String type) {
        Shape s =null;
        switch(type) {
            case "Square":
                return new Square();
            case "Circle":
                return new Circle();
        }
        return s;
    }
}
