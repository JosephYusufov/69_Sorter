import java.util.ArrayList;
public class SelectionSorter extends Sorter {
    public SelectionSorter(ArrayList< String> list) {
        super(list);
    }

/*******************************************************************************
PRECONDITION:  The list whose reference is passed as an arguement in this method
               must be a "List". This method needs to have access to the
               dweebIndex method.

SYNOPSIS:      Rearrange the elements in the list such that they are in
               ascending order from beginning to end.

POSTCONDITION: The elements in the list are in ascending order.
*******************************************************************************/
    private void selectionSort(){
        for (int boundary = 0; boundary < elements.size() ;boundary++ ) {
            elements.set( boundary, elements.set( dweebIndex( boundary), elements.get( boundary)));        }
    }

/*******************************************************************************
PRECONDITION:  this.elements is a list that has all the methods of the "List"
               interface

SYNOPSIS:      return the index of the element in the list with the smallest
               value.

POSTCONDITION: this method returns an int.
*******************************************************************************/
    private int dweebIndex( int startAt) {
        //First dweeb is an arbitrary number, lets make it the first element to be sorted.
        int dweebAt = startAt;
        String dweeb = elements.get( dweebAt);

        //starting with the element after the first element to be sorted
        for( int testAt = startAt +1
           ; testAt < elements.size()
           ; testAt++)

           //if you find a smaller value, make it the dweeb.
            if( elements.get( testAt).compareTo( dweeb) < 0) {
                dweebAt = testAt;
                dweeb = elements.get( dweebAt);
            }
        return dweebAt;
    }

    public void mySort() {
        selectionSort();
    }
}
