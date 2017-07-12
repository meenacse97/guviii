package EF;
import java.util.*;
public class rotate {
public static void main(String[] args){
	int n=7,k=3;
	int[] a={1,2,3,4,5,6,7};
	int[] ab=new int[n];
	for(int i=0;i<a.length;i++){
		ab[i]=a[i]-k;
		if(ab[i]<=0){
			System.out.print(ab[i]+n);
		}
		else{
			System.out.print(ab[i]);
		}
	}
}
}
