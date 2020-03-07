/*
* @author Lucas Nascimento Tahan Sab
*
* @since 2020
*
* @version 1.0
*
* @param 
* data: array of generic elements;
* size: size of the array;
* exists: number of elements in the array;
*/

public class Data {
    private Object[] data;
    private int size;
    private int exists;

    public Data() {

        this(0);

    }

    public Data(int size) {

        this.size = size;
        this.data = new Object[this.size];
        this.exists = -1;
        /* Initializing with -1 for avoiding wrong position call in the future */

    }

    public Object[] getData() {
        return this.data;
    }

    public int getSize() {
        return this.size;
    }

    public int getExists() {
        return this.exists;
    }

    /* Inserting elements in the array... */

    public boolean insert(Object data) throws IndexOutOfBoundsException {

        try {

            this.data[this.exists + 1] = data;
            /* Add one to the variable only if it passes the Exceptions */

        } catch (IndexOutOfBoundsException e) {

            System.err.println("\nA lista ja esta cheia!");
            return false;

        }

        this.exists++;

        return true;

    }

    /* Removing elements from the array... */

    public Object remove() throws IndexOutOfBoundsException {

        Object deleted = null;

        try {

            deleted = this.data[this.exists];

        } catch (IndexOutOfBoundsException e) {

            System.err.println("\nA lista ja esta vazia!");
            return null;

        } catch (NullPointerException e) {

            System.err.println("\nA lista ja esta vazia!");
            return null;
        }

        this.exists--;

        return deleted;

    }

    /* Removing elements from an specific position in the array... */

    public Object removeIn(int pos) {

        return null;

    }

    /* Copying an array to another... */

    public void copyArrayFrom(Object data) {

        System.arraycopy(data, 0, this.data, 0, this.exists);
        /* Using arraycopy() from System class */

    }

}