package QuadraticProbing;

import java.util.ArrayList;

public class QuadraticProbing {
    String[] hashTable;
    int usedCellNumber;

    QuadraticProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public double getLoadFactor() {
        double loadFactor = usedCellNumber * 1.0 / hashTable.length;
        return loadFactor;
    }

    public void rehashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
            data.add(word);
            hashTable = new String[hashTable.length * 2];
            for (String string : data) {
                insertInHashTable(string);
            }
        }
    }

    //insertInHashTable()

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHashTable does not exists");
            return;
        } else {
            System.out.println("\n---------HashTable---------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key: " + hashTable[i]);
            }
        }
    }
}
