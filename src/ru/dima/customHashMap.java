package ru.dima;

import java.util.*;

public class customHashMap<E, K> implements Map {
    private List[] arr = new List[16];
    ;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        int index = key.hashCode() % (arr.length - 1);
        List<Object[]> list = (List<Object[]>) arr[index];
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0].equals(key)) {
                return list.get(i)[1];
            }
        }
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        int index = key.hashCode() % (arr.length - 1);
        if (arr[index] == null) {
            arr[index] = new LinkedList<K>();
        }
        Object[] keyVal = {key, value};
        arr[index].add(keyVal);
        size++;
        return value;
    }

    @Override
    public Object remove(Object key) {
        int index = key.hashCode() % (arr.length - 1);
        List<Object[]> list = (List<Object[]>) arr[index];
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0].equals(key)) {
                list.remove(i);
                size--;
                return null;
            }
        }
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
