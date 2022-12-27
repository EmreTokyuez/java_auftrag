import java.util.ArrayList;

public class StringBinary {
    ArrayList<String> binary = new ArrayList<String>();

    public void StringtoBinary(String input){
        char[] chars = input.toCharArray();
        for(char c : chars){
            int i = c;
            System.out.println(Integer.toBinaryString(i));

        }
    
    }
    
}
