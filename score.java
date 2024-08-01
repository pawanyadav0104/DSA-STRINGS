package string;
import java.util.*;

public class score {
    public static void main(String[] args) {
        //System.out.println('h'+0);
        String x="hello";
        int str=scoring(x);
        System.out.println(str);
    }
    static int scoring(String x){
        int sum=0;
        int n=x.length();
        for(int i=0;i<n-1;i++){
            sum+=(Math.abs(x.charAt(i)-x.charAt(i+1)));
        }
        return sum;

    }
}
