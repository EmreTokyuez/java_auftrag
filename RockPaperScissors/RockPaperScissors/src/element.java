import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class element {
    HashMap<String, Boolean> attributes = new HashMap<String, Boolean>();
    String name;

    public element(String name) {
        this.name = name;
    }

    public void addAttribute(String name, boolean value) {
        attributes.put(name, value);
    }

    public boolean getElement(String element){
        return attributes.get(element);
    }

    
}
