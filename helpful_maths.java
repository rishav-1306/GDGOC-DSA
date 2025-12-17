import java.util.*;
public class helpful_maths {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        String s=oc.next();
        String[]arr=s.split("\\+");
        int[]a=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            a[i]=Integer.parseInt(arr[i]);
            Arrays.sort(a);
for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
            if(i<a.length-1)
            System.out.print("+");
        }
    }
}