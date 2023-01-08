import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

import java.util.ArrayList;
public class Element {
    ArrayList<String> elementItCanBea =  new ArrayList<String>();
    String name;

    public Element(String name) {
        this.name = name;
    }

    public void addElementitcanbeat(String element){
        elementItCanBea.add(element);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
