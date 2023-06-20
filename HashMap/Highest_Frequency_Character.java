import java.util.HashMap;
import java.util.Scanner;

public class Highest_Frequency_Character {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> hm =  new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int old_Frequency = hm.get(ch);
                int new_Frequency = old_Frequency + 1;
                hm.put(ch, new_Frequency);
            }else{
                hm.put(ch, 1);
            }
        }
        char max_freq = str.charAt(0);
        for(Character key: hm.keySet()){
            if(hm.get(key) > hm.get(max_freq)){
                max_freq = key;
            }
        }
        System.out.print(max_freq);
    }
}
