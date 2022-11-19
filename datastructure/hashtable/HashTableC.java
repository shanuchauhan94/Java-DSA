package datastructure.hashtable;

import java.util.Arrays;
import java.util.Objects;

public class HashTableC {

    int[] data;
    int capacity;

    public HashTableC(int capacity) {
        this.capacity = capacity;
        data = new int[this.capacity];
    }

    public int _hash(String key) {

        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + (int) key.charAt(i) * i) % this.data.length;
        }
        return hash;
    }

    public int[] set(String key, int value) {
        int address = this._hash(key);
        if (this.data[address] != 0) {
            this.data[address] = 0;
        }
        this.data[address] = value;
        return this.data;
    }

    public int get(String key) {
        int address = this._hash(key);
        int[][] currentBucket = new int[][]{new int[this.data[address]]};
        for (int i = 0; i < currentBucket.length; i++) {
            if (currentBucket[i][0] == Integer.parseInt(key)) {
                return currentBucket[i][1];
            }
        }
        return currentBucket[0][0];
    }


    @Override
    public String toString() {
        return "data=" + Arrays.toString(data);
    }
}
