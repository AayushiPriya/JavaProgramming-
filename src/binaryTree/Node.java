package binaryTree;

public class Node {
    private Node left,right ;
    private int val;

    public int getVal()
    {
        return this.val;
    }
    public Node getLeft()
    {
        return this.left;
    }
    public Node getRight()
    {
        return this.right;
    }
    public void setVal(int a)
    {
        this.val=a;
    }
    public void setLeft(Node a)
    {
        this.left=a;
    }
    public void setRight(Node b)
    {
        this.right=b;
    }
}

