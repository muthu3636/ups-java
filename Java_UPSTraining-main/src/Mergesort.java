public class Mergesort {
    public static void main(String[] args) {
        int[] a = {10, 5, 30, 15, 7};
        mergeSort(a, 0, a.length - 1);

        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    static void merge(int[] arr, int l, int m, int h) {
        int n1 = m - l + 1, n2 = h - m;
        int[] left = new int[n1];
        int[] right = new int[n2];

        System.arraycopy(arr, l, left, 0, n1);
        System.arraycopy(arr, m + 1, right, 0, n2);

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
