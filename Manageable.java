/**
 * Name: Jacoreua Graham
 * Assignment: SDC330 Course Project - Class Implementation
 * Description: Interface defining basic management operations.
 */
public interface Manageable<T> {

 void add(T item);

 void update(T item);

 void delete(T item);

 void displayAll();
}