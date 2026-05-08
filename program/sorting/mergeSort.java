import java.util.*;

class mergeSort{
	public static void divide(int[] arr, int start, int end){
		if(start >= end) return;
		int mid= start + (end - start)/2;
		divide(arr, start, mid);	//sort left half
		divide(arr, mid+1, end);	//sort right half
		conquer(arr, start, mid, end);	// merge both halfs
	}

	public static void conquer(int[] arr, int start, int mid, int end){
		int merge[]= new int[end-start+1];

		int idx1=start;// track left array
		int idx2=mid+1;//track right array
		int x=0;// track merge array

		//compare elements of both halves
		while(idx1<=mid && idx2<=end){
			if(arr[idx1]<=arr[idx2]){
				merge[x]=arr[idx1];
				x++;
				idx1++;
			}
			else if(arr[idx1]>arr[idx2]){
				merge[x]=arr[idx2];
				x++;
				idx2++;
			}
		}
		//copy remaining elements of left half
		while(idx1<=mid){
			merge[x]=arr[idx1];
			x++; idx1++;
		}
		//copy remaining elements of right half
		while(idx2<=end){
			merge[x]=arr[idx2];
			x++; idx2++;
		}
		//copy merge array back to original array
		for(int i=0, j=start ;i<merge.length;i++, j++){
			arr[j]=merge[i];
		}
	}

	public static void main(Strings[] args){
		int arr[]={6,5,2,3,4,8,,4,9};
		int n= arr.length;

		divide(arr, 0, n-1);

		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}	



Time Complexity = O(n log n)
Space Complexity = O(n)