/*
* @author Lucas Nascimento Tahan Sab
*
* @since 2020
*
* @version 1.0
*
* @param 
* dataArray: variable for Data attributes and functionalities access;
* pos: variable containing the current position of the array;
*/

public class DataArray implements Iterator {
    private Data dataArray;
    private int pos;

    public DataArray() {

        this(null);

    }

    public DataArray(Data data) {

        this.dataArray = data;
        this.pos = -1;

    }

    @Override
    public Object first() {

        this.pos = 0;
        return dataArray.getData()[pos];
        /*
         * returned array position can be accessed because getData() returns an array
         */

    }

    @Override
    public Object next() {

        return dataArray.getData()[++this.pos];

    }

    @Override
    public boolean hasNext() {

        boolean has = false;

        if (this.pos < dataArray.getSize() && this.pos < dataArray.getExists())
            has = true;

        return has;

    }

    /* Displaying all the array... */

    public void display() {

        System.out.print("\n" + this.first());

        while (this.hasNext()) {
            System.out.print(" | " + this.next());
        }

        System.out.println();
    }

}