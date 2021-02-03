package binaryTree;

public class BinaryTreeTraversal {

     static int sum=0;
    public static void traversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.getVal());
        traversal(root.getLeft());
        traversal(root.getRight());
    }
    public static void leafNode(Node root)
    {
        if(root==null)
        {
            return;
        }
        if ((root.getLeft()==null)&&(root.getRight()==null))
        {
            System.out.println(root.getVal());
            return;
        }

        leafNode(root.getLeft());
        leafNode(root.getRight());

    }
    public static void sumLeafNode(Node root)
    {
        if(root==null)
        {
            return;
        }

        if ((root.getLeft()!=null)&&(root.getRight()!=null))
        {

            sum=sum+root.getVal();


            return;
        }

        sumLeafNode(root.getLeft());
        sumLeafNode(root.getRight());

    }
    public static void main(String []args)
    {
        Node root = new Node();
        root.setVal(1);
        Node a =new Node();
        a.setVal(2);
        Node b =new Node();
        b.setVal(3);
        Node c =new Node();
        c.setVal(4);
        Node d =new Node();
        d.setVal(5);
        root.setLeft(a);
        root.setRight(b);
        b.setLeft(c);
        b.setRight(d);
        //traversal(root);
        sumLeafNode(root);
        System.out.println(sum);


    }

}
