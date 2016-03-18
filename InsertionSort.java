public class InsertionSort {
	public static void InsertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {

			int tmp = a[i];
			for (int j = i - 1; j >= 0 && tmp < a[j]; j--) {
				a[j + 1] = a[j];
				a[j + 1] = tmp;
			}
		}
	}
}