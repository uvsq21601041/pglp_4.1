package pglp4_1.pglp4_1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Iterator;
public class MyArrayList<E> implements MyCollection {

    // 存储ArrayList 中的元素
    transient Object[] elementData;

   
    private int size;

    
   

    
    public boolean add(Object o) {
        elementData[size++] = o;
        return true;
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (int index = 0; index < size; index++)
                if (elementData[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (o.equals(elementData[index])) {
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }


    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        elementData[--size] = null; // clear to let GC do its work
    }

    
    public MyIterator iterator() {
        return new Itr();
    }

    
    private class Itr implements MyIterator<E> {

       
        int cursor;
        
        int lastRet = -1;
        public boolean hasNext() {
            return cursor != size;
        }

        public E next() {
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = MyArrayList.this.elementData;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (E) elementData[lastRet = i];
        }

        public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();
            try {
                MyArrayList.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }
    }
}
