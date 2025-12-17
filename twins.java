import java.util.*;
public class twins{
    public static void main(String[] args){
    Scanner oc=new Scanner(System.in);
int n=oc.nextInt();
int[]a=new int[n];
int sum=0;
for(int i=0;i<n;i++){
a[i]=oc.nextInt();
     sum+=a[i];
}
Arrays.sort(a);
int mysum=0,count=0;
for(int i=n-1;i>=0;i--){
    mysum+=a[i];
count++;
    if(mysum>sum-mysum)
    break;
}
System.out.println(count);
    }
}