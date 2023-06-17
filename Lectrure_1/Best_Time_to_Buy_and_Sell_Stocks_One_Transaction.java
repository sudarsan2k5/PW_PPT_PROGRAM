import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stocks_One_Transaction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = scn.nextInt();
        int [] price = new int[n];
        for(int i = 0; i < price.length; i++){
            price[i] = scn.nextInt();
        }
        int lsf = Integer.MAX_VALUE; // LSF = list so far or bye or small number
        int pist = 0;// profit if sold today or sell or profit
        int op = 0; // Overall perfit or final answer or max perfit
        for(int i = 0; i < price.length; i++){
            if(price[i] < lsf){
                lsf = price[i];
            }
            pist = price[i] - lsf;
            if(pist > op){
                op = pist;
            }
        }
        System.out.print(op);
    }
}
