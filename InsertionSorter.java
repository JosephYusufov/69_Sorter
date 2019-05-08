/*******************************************************************************
CREDIT FOR THE insertionSort AND insert1 METHODS GO TO SI LIANG LEI
*******************************************************************************/

import java.util.ArrayList;

public class InsertionSorter extends Sorter {
    public InsertionSorter(ArrayList<String> list){
        super(list);
    }
/*******************************************************************************
PRECONDITION:  The list whose reference is passed as an arguement in this method
               must be a "List". This method needs to have access to the insert1
               method

SYNOPSIS:      Rearrange the elements in the list such that they are in
               ascending order from beginning to end.

POSTCONDITION: The elements in the list are in ascending order.
*******************************************************************************/
    public static void insertionSort(ArrayList<String> list) {
        for(int elementToInsert = 1;
            elementToInsert < list.size();
            insert1(list,elementToInsert),
            elementToInsert++
            ) {
        }
    }

/*******************************************************************************
PRECONDITION:  A section of the list, located at the beginning of the list,
               denoted by numSorted, is already sorted.

SYNOPSIS:      insert the first element to be sorted into its proper position in
               the sorted section of the list.

POSTCONDITION: The sorted section of the list is now one element larger, and the
               unsorted section is one element smaller.
*******************************************************************************/
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
