/*
* @author Lucas Nascimento Tahan Sab
* @since 2020
* @version 1.0
*/

public interface Iterator {
    public Object first(); /* Returns the first Object in the array */

    public Object next(); /* Returns the next Objext in the array */

    public boolean hasNext(); /* Returns true or false in case a next element exists or not */
}