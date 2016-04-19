
public class Sort {
	int[] a= {8,3,19,10,25,2,18,7};
	 for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
	}
	 System.out.println();
	 insertionSort(a);
}

	public static void insertionSort(int[]x){
		for(int i=1; i<x.length; i++) {
			for (int j=i-1; j>=0;j--) {
				if(x[j+1]<x[j]){
					int temp= x[j+1];
					x[j+1]=x[j];
					x[j]= temp;
				} else{
					j=-1;
				}
			}
			
			for(int j=0; j<x.length; j++) {
				System.out.print(x[j]+" ");
			}
			System.out.println();
		}
	}
}