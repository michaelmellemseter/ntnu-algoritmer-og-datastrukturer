public class Oving3 {

    public Oving3(){
    }

    public static void quicksort(int []t, int v, int h){
        if (h-v > 2){
            int delepos = splitt(t,v,h);
            quicksort(t,v,delepos-1);
            quicksort(t,delepos+1,h);
        }else{
            median3sort(t,v,h);
        }
    }
    private static int median3sort(int[] t, int v, int h){
        int m = (v+h)/2;
        if (t[v] > t[m]){
            bytt(t,v,m);
        }
        if (t[m] > t[h]){
            bytt(t,m,h);
            if (t[v] > t[m]){
                bytt(t,v,m);
            }
        }
        return m;
    }
    private static int splitt(int[] t, int v, int h){
        int iv, ih;
        int m = median3sort(t,v,h);
        int dv = t[m];
        bytt(t,m,h-1);
        for (iv = v, ih = h-1;;){
            while (t[++iv] < dv);
            while (t[--ih] > dv);
            if (iv >= ih) break;
            bytt(t,iv,ih);
        }
        bytt(t,iv,h-1);
        return iv;
    }
    public static void bytt(int[] t, int i, int j){
        int k = t[j];
        t[j] = t[i];
        t[i] = k;
    }

    //DualPivot

    static void sort(int[] arr, int lowIndex, int highIndex) {
        if(highIndex <= lowIndex) {
            return;
        }

        if(arr[lowIndex] > arr[highIndex]) {
            swap(arr, lowIndex, highIndex);
        }

        int pivot1 = arr[lowIndex];
        int pivot2 = arr[highIndex];

        int lt = lowIndex + 1;
        int gt = highIndex - 1;
        int i = lowIndex + 1;

        while(i <= gt) {
            if(arr[i] < pivot1) {
                swap(arr, i, lt);
                lt++;
                i++;
            } else if(arr[i] > pivot2) {
                swap(arr, i, gt);
                gt--;
            } else {
                i++;
            }
        }

        swap(arr, lowIndex, lt-1);
        swap(arr, gt+1, highIndex);

        lt--;
        gt++;

        sort(arr, lowIndex, lt-1);
        sort(arr, lt+1, gt-1);
        sort(arr, gt+1, highIndex);

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}