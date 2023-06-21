import java.util.HashMap;
import java.util.Scanner;

public class Get_Common_Element_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        System.out.print("Enter Array Length: ");
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int val: arr1){
            if(hm.containsKey(val)){
                int old_freq = hm.get(val);
                int new_freq = old_freq + 1;
                hm.put(val, new_freq);
            }else{
                hm.put(val, 1);
            }
        }
        for(int val: arr2){
            if(hm.containsKey(val) && hm.get(val) > 0){
                System.out.print(val + " ");
                int of = hm.get(val);
                int nf = of - 1;
                hm.put(val, nf);
            }
        }
    }
}
