package Data_Structure;
public class BinaryTree {
    public static void main(String[] args) {
        BinaryNode bn = new BinaryNode();
        bn.insert(56);
        bn.insert(30);
        bn.insert(70);
        bn.insert(22);
        bn.insert(40);
        bn.insert(11);
        bn.insert(3);
        bn.insert(16);
        bn.insert(60);
        bn.insert(95);
        bn.insert(65);
        bn.insert(63);
        bn.insert(67);

        System.out.println(bn.root.value);
        System.out.println(bn.root.left.value);
        System.out.println(bn.root.right.value);
        System.out.println(bn.root.left.left.value);
        System.out.println(bn.root.left.right.value);
        System.out.println(bn.root.left.left.left.value);
        System.out.println(bn.root.left.left.left.left.value);
        System.out.println(bn.root.left.left.left.right.value);
        System.out.println(bn.root.right.left.value);
        System.out.println(bn.root.right.right.value);
        System.out.println(bn.root.right.left.right.value);
        System.out.println(bn.root.right.left.right.left.value);
        System.out.println(bn.root.right.left.right.right.value);
        System.out.println(bn.search(63));
    }
}
