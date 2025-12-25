import java.util.*;
public class appartment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int apl[]=new int [n];
        for(int i=0;i<n;i++){
            apl[i]=sc.nextInt();
        }
        int app[]=new int [m];
        for(int i=0;i<m;i++){
            app[i]=sc.nextInt();
        }
        Arrays.sort(apl);
        Arrays.sort(app);
        int count=0;
        int i=0,j=0;
        while(i<n && j<m){
            int diff=apl[i]-app[j];
            if(Math.abs(diff) <= k){
                count++;
                i++;
                j++;
            }
            else if(diff<= -k){
                i++;
            }
            else if(diff >k){
                j++;
            }
        }
        System.out.println(count);
    }
}