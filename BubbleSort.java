public class BubbleSort {
    public void sort(int[] numbers){
        int length = numbers.length;
        int flag=1;
        while(flag==1) {
            flag=0;
            for (int i = 0; i < length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    numbers = swap(numbers, i, i + 1);
                    flag = 1;
                }
            }
        }
        print_numbers(numbers);
    }

    public int[] swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        return numbers;
    }
    public void print_numbers(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
