public class Heap {
    int len;
    int node[];

    public Heap() {
    }

    public void heapsort() {
        lag_heap();
        int l = len;
        while (len > 1) {
            int x = hent_maks();
            node[len] = x;
        }
        len = l;
    }

    public void lag_heap() {
        int i = len/2;
        while (i-- > 0) {
            fiks_heap(i);
        }
    }

    public void fiks_heap(int i) {
        int m = venstre(i);
        if (m < len) {
            int h = m + 1;
            if (h < len && node[h] > node[m]) {
                m = h;
            }
            if (node[m] > node[i]) {
                bytt(node, i, m);
                fiks_heap(m);
            }
        }
    }

    public int hent_maks() {
        int maks = node[0];
        node[0] = node[--len];
        fiks_heap(0);
        return maks;
    }

    int over(int i) {
        return(i - 1) >> 1;
    }

    int venstre(int i) {
        return(i << 1) + 1;
    }

    int hoyre(int i) {
        return(i + 1) << 1;
    }

    public static void bytt(int[] t, int i, int j){
        int k = t[j];
        t[j] = t[i];
        t[i] = k;
    }

    public void sett_inn(int x) {
        int i = len++;
        node[i] = x;
        prio_opp(i,0);
    }

    public void prio_opp(int i, int p) {
        int f;
        node[i] += p;
        while (i > 0 && node[i] > node[f=over(i)]) {
            bytt(node,i,f);
            i = f;
        }
    }







    public void sort(int arr[])
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
