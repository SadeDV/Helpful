
public class BasicSort {


	public static void BasicSort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					swap(array, i, j);
				}
			}
		}
	}
	

	public static void BubbleSort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=array.length-1;j>i;j--){
				if(array[j-1]>array[j]){
					swap(array, j-1, j);
				}
			}
		}
	}

	public static int[] bubble_sort3(int[] arr) {
		boolean isChanged = true;
		for (int i = 0; i < arr.length && isChanged; i++) {
			isChanged = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
					isChanged = true;
				}
			}
		}
		return arr;
	}
	

	public static void select_sort(int[] array){
		for(int i =0;i<array.length -1;i++){
			int min = i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[min]){
					min = j;
				}
			}
			if(min!=i){
				swap(array, min, i);
			}
		}
	}
	

	public static void insertion_sort(int[] a){
		for(int i=1;i<a.length;i++){
			int temp  = a[i];
			int j;
			for(j=i-1;j>=0;j--){
				if(a[j]>temp){
					a[j+1] = a[j];
				}else
					break;
			}
			a[j+1] = temp;
		}
	}

	public static void shellSort(int[] a){
		double d1 = a.length;
		int temp=0;
		while(true){
			d1 = Math.ceil(d1/2);
			int d = (int)d1;
			for(int x=0;x<d;x++){
				for(int i=x+d;i<a.length;i=i+d){
					temp = a[i];
					int j = i-d;
					for(;j>=0&&temp<a[j];j=j-d){
						a[j+d] = a[j];
					}
					a[j+d] = temp;
				}
			}
			if(d==1){
				break;
			}
		}
	}
	

	public static void shellSort2(int[] a){
		int d = a.length;
		while(true){
            for(int i=0;i<d;i++){
                for(int j=i;j+d<a.length;j+=d){
                int temp;
                if(a[j]>a[j+d]){
                    temp=a[j];
                    a[j]=a[j+d];
                    a[j+d]=temp;
                    }
                }
            } 
            if(d==1){break;}
            d--;
           }
	}
	
	

	public static void swap(int[] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void print(int[] array){
		for(int x:array){
			System.out.print(x+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {49,38,65,97,76,13,27,49,55,04};
		print(array);
		//select_sort(array);
		//insertion_sort(array);
		shellSort(array);
		//shellSort2(array);
		print(array);
	}
}
