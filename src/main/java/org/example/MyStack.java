package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E>  {
    private ArrayList<E> delegate;

    public MyStack() {
        this.delegate = new ArrayList<>();
    }

    public boolean isEmpty(){
        return delegate.isEmpty();
    }

    public int size(){
        return delegate.size();
    }
    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (delegate.isEmpty()) throw new EmptyStackException();
        E e = delegate.get(this.size() - 1);
        delegate.remove(this.size() - 1 );
        return e;
    }

}
