public class merge_sort {
    public static void main(String[]args) {
        int[]a={40,30,33,2,6};
        sort(a,0,a.length-1);
        for (int i= 0;i<a.length;i++)
            System.out.print(a[i]+"");
    }
 static void merge(int[]a,int l,int m,int r) {
        int n1=m-l+1;
        int n2=r-m;
        int[]Le=new int[n1];
        int[]Ri=new int[n2];

        for (int i=0;i<n1;i++)
            Le[i]=a[l+i];
        for (int j=0;j<n2;j++)
            Ri[j]=a[m+1+j];
int i=0,j=0,k=l;
while (i<n1&&j<n2) {
            if(Le[i]<=Ri[j]){
                a[k]=Le[i];
                i++;
            }else{
        a[k]=Ri[j];
        j++;
}
            k++;
        }
while (i<n1) {
    a[k]=Le[i];
    i++;
    k++;
        }
while (j < n2) {
    a[k]=Ri[j];
    j++;
    k++;
        }
    }
static void sort(int[]a,int l,int r){
if (l<r){
     int m=(l+r)/2;
sort(a,l,m);
    sort(a,m+1,r);
    merge(a,l,m,r);
        }
    }
}
