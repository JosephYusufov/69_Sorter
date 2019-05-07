/*******************************************************************************
CREDIT FOR THE insertionSort AND insert1 METHODS GO TO SI LIANG LEI
*******************************************************************************/

/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {
    public InsertionSorter(ArrayList<String> list){
        super(list);
    }
    public static void insertionSort(ArrayList<String> list) {
        for(int elementToInsert = 1;
            elementToInsert < list.size();
            insert1(list,elementToInsert),
            elementToInsert++
            ) {
                // System.out.println("    dbg: "
                    // + "after inserting element " + elementToInsert
                    // + " elements: " + list
                    // );
            }
    }

    private static void insert1(ArrayList<String> list, int numSorted) {
        String valueToInsert = list.get(numSorted);
        boolean inserted = false;
        for(int indexToCompare = numSorted - 1;
            !inserted && indexToCompare > -1;
            indexToCompare--
            ) {
                if(indexToCompare == 0 && valueToInsert.compareTo(list.get(0)) < 0) {
                    list.set(1, list.get(0));
                    list.set(0, valueToInsert);
                    inserted = true;
                }
                else {
                    if (valueToInsert.compareTo(list.get(indexToCompare)) < 0) {
                        list.set(indexToCompare+1, list.get(indexToCompare));
                    }
                    else {
                        list.set(indexToCompare+1, valueToInsert);
                        inserted = true;
                    }
                }
        }
    }

    public void mySort() {
        insertionSort(elements);
    }
}
