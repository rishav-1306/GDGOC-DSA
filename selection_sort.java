import java.util.*;
public class selection_sort {
    public static void main(String[]args){
        Scanner oc=new Scanner(System.in);
        int a=oc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=oc.nextInt();
        } 
         for (int i=0;i<a-1;i++) {
            int min=i;
            for (int j=i+1;j<a;j++) {
                if (arr[j]<arr[min]) {
                    min=j;
    }
}
    int b=arr[min];
    arr[min]=arr[i];
    arr[i]=b;}
               for (int i=0;i<a;i++) {
            System.out.print(arr[i]+" ");
    }
    }
    }