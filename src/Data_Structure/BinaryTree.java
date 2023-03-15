package Data_Structure;
public class BinaryTree {
    public static void main(String[] args) {
        BinaryNode bn = new BinaryNode();
        bn.insert(56);
        bn.insert(30);
        bn.insert(70);
        System.out.println(bn.root.left.value);
    }
}
