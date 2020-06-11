package cn.yusite.basic.tutorial.design.behavioral.iterator;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
