package Bag;

import java.nio.channels.NetworkChannel;

public interface Bag {
    public int getCurrentSize(); 
    public boolean isFull();
    public boolean isEmpty();
    public boolean add(Object newEntry);
    public Object remove();
    public boolean remove(Object anEntry);
    public void clear();
    public int getFrequencyOf(Object anEntry);
    public boolean contains(Object anEntry);
    public Object[] toArray(); 

    
}
