
public class HeapSort {
    private static int N;

    public void print_numbers(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }

    public void sort(int numbers[], int size) {

        heapify(numbers);
        for (int i = N; i > 0; i--) {
            swap(numbers, 0, i);
            N = N - 1;
            maxheap(numbers, 0);
        }
        print_numbers(numbers);
    }

    /* Function to build a heap */
    public static void heapify(int arr[]) {
        //System.out.println("inside heapify");
        N = arr.length - 1;
        //System.out.println("N is "+N);
        for (int i = N / 2; i >= 0; i--) {
           // System.out.println("Calling maxheap for i="+i);
            maxheap(arr, i);
        }
    }

    /* Function to swap largest element in heap */
    public static void maxheap(int arr[], int i) {
        //System.out.println("inside maxheap");
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        //System.out.println("left: "+left+" right: "+right+" max: "+max);
        if (left <= N && arr[left] > arr[i]) {
            //System.out.println("left<=N and arr[left]="+arr[left]+" > arr[i]="+arr[i]);
            max = left;
        }
        if (right <= N && arr[right] > arr[max]) {
            //System.out.println("right<=N and arr[right]=" + arr[right] + " > arr[max]=" + arr[max]);
            max = right;
        }

        if (max != i) {
//            System.out.println("max: "+max+" != i: "+i);
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }

    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j) {
        //System.out.println("Swapping array["+i+"] and array["+j+"]");
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    /* Main method */
}