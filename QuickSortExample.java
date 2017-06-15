import java.util.ArrayList;

public class QuickSortExample {

    public static void main(String[] args) {
        ArrayList<Integer> unsorted = new ArrayList<>();
        
        // Given insertion order for arrays, I'll create an unsorted array list.
        
        unsorted.add(5);
        unsorted.add(1);
        unsorted.add(4);
        unsorted.add(8);
        unsorted.add(3);
        unsorted.add(2);
        unsorted.add(7);
        unsorted.add(6);

        System.out.println(quicksort(unsorted));
    }
    
    /**
     * Sorts an unsorted array list of integers. Big O complexity: O( N log(N) ) worst case n^2.
     *
     * @param unsorted ArrayList of unsorted integers.
     * @return      ArrayList of sorted integers.
     */
    public static ArrayList<Integer> quicksort( ArrayList<Integer> unsorted ){
        if(unsorted.size() <= 1){
            return unsorted;
        }

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        int pivot = unsorted.get(0);

        for(int i = 1; i < unsorted.size(); i++){
            if(unsorted.get(i) < pivot){
                left.add(unsorted.get(i));
            } else {
                right.add(unsorted.get(i));
            }
        }

        ArrayList<Integer> sorted = new ArrayList<>();

        sorted.addAll(quicksort(left));
        sorted.add(pivot);
        sorted.addAll(quicksort(right));
        return sorted;
    }
}
