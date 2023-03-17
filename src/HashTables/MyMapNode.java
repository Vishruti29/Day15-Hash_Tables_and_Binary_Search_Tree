package HashTables;
import java.util.LinkedList;

public class MyMapNode {
    String key;
    int value;

    public MyMapNode(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class MyHashTable {
    private LinkedList<MyMapNode>[] table;
    private int size;

    public MyHashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<MyMapNode>();
        }
    }

    private int getHash(String key) {
        int hash = key.hashCode() % size;
        if (hash < 0) {
            hash += size;
        }
        return hash;
    }

    public void put(String key, int value) {
        int hash = getHash(key);
        LinkedList<MyMapNode> list = table[hash];
        for (MyMapNode node : list) {
            if (node.getKey().equals(key)) {
                node.setValue(node.getValue() + value);
                return;
            }
        }
        list.add(new MyMapNode(key, value));
    }

    public int get(String key) {
        int hash = getHash(key);
        LinkedList<MyMapNode> list = table[hash];
        for (MyMapNode node : list) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        MyHashTable table = new MyHashTable(10);
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.split(" ");
        for (String word : words) {
            table.put(word, 1);
        }
        int frequency = table.get("paranoid");
        System.out.println("Frequency of 'paranoid': " + frequency);
    }
}
