package com.aed.pathfinder.util;

import java.util.*;
/**
 *
 * @author Juan Romero Collazos
 * @param <K>
 * @param <V>
 */
public class CustomMap<K, V> implements Iterable<CustomMap<K,V>.MapEntry>{
    private K[] keys;
    private V[] values;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public CustomMap() {
        this.keys = (K[]) new Object[DEFAULT_INITIAL_CAPACITY];
        this.values = (V[]) new Object[DEFAULT_INITIAL_CAPACITY];
        this.size = 0;
    }

    public void put(K key, V value) {
        for (int i = 0; i < size; i++) {
            if (key.equals(keys[i])) {
                values[i] = value;
                return;
            }
        }
        ensureCapacity();
        keys[size] = key;
        values[size] = value;
        size++;
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(keys[i])) {
                return values[i];
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(keys[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(values[i])) {
                return true;
            }
        }
        return false;
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(keys[i])) {
                keys[i] = keys[size - 1];
                values[i] = values[size - 1];
                keys[size - 1] = null;
                values[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            keys[i] = null;
            values[i] = null;
        }
        size = 0;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size == keys.length) {
            K[] newKeys = (K[]) new Object[2 * keys.length];
            V[] newValues = (V[]) new Object[2 * values.length];
            System.arraycopy(keys, 0, newKeys, 0, size);
            System.arraycopy(values, 0, newValues, 0, size);
            keys = newKeys;
            values = newValues;
        }
    }

    @Override
    public Iterator<MapEntry> iterator() {
        return new MapIterator();
    }

    public List<V> values() {
        List<V> resultList = new ArrayList<>(size);
        resultList.addAll(Arrays.asList(values).subList(0, size));

        return resultList;
    }

    public class MapEntry {
        private K key;
        private V value;
        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
        @Override
        public String toString() {
            return key + " => " + value;
        }
    }

    private class MapIterator implements Iterator<MapEntry> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public MapEntry next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            return new MapEntry(keys[currentIndex], values[currentIndex++]);
        }

        @Override
        public void remove() {
            if (currentIndex <= 0) {
                throw new IllegalStateException("next() has not been called or remove() has already been called after the last call to next()");
            }
            CustomMap.this.remove(keys[--currentIndex]);
        }
    }
}
