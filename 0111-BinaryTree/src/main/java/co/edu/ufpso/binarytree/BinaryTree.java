package co.edu.ufpso.binarytree;

public class BinaryTree {

    enum Color {
        RED,
        BLUE,
        YELLOW,
        GREEN,
    }
    Color color;

    enum Trademark {
        POLO,
        PAT_PRIMO,
        PONTIAC,
    }
    Trademark trademark;

    int size;

    BinaryTree left;
    BinaryTree right;

    public BinaryTree(Color color, Trademark trademark, int size) {
        this.color = color;
        this.trademark = trademark;
        this.size = size;
    }

    public BinaryTree searchByColor(Color color) {
        if (this.color == color) {
            return this;
        }

        BinaryTree node = null;
        if (this.left != null) {
            node = this.left.searchByColor(color);
        }
        if (node != null) {
            return node;
        }

        if (this.right != null) {
            node = this.right.searchByColor(color);
        }

        return node;
    }

    public void insert(BinaryTree node) {
        if (this.left == null) {
            this.left = node;
            return;
        }

        if (this.right == null) {
            this.right = node;
            return;
        }
        
        int leftSize = 0;
        int rightSize = 0;
        
        BinaryTree n = this.left;
        while(n != null) {            
            n = n.left;
            leftSize++;
        }
        n = this.right;
        while(n!= null) {            
            n = n.right;
            rightSize++;
        }
        
        if (leftSize < rightSize) {
            this.left.insert(node);
        }
        
        this.right.insert(node);
    }

    public boolean isFree() {
        return this.left == null || this.right == null;
    }

    public String debug(String indent) {
        String ret = "";

        ret += String.format("%sNode: %s (%s) [%d].\n", indent, this.color, this.trademark, this.size);
        if (this.left != null) {
            ret += indent + "Left:\n";
            ret += this.left.debug(indent + "    ");
        } else {
            ret += indent + "Left: Null.\n";
        }

        if (this.right != null) {
            ret += indent + "Right:\n";
            ret += this.right.debug(indent + "    ");
        } else {
            ret += indent + "Right: Null.\n";
        }

        return ret;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(Color.BLUE, BinaryTree.Trademark.PONTIAC, 0);

        BinaryTree data[] = new BinaryTree[]{
            new BinaryTree(Color.BLUE, Trademark.PONTIAC, 1),
            new BinaryTree(Color.RED, Trademark.PONTIAC, 2),
            new BinaryTree(Color.YELLOW, Trademark.PONTIAC, 3),
            new BinaryTree(Color.RED, Trademark.PONTIAC, 4),
            new BinaryTree(Color.RED, Trademark.PONTIAC, 5),
            new BinaryTree(Color.YELLOW, Trademark.PONTIAC, 6),
            new BinaryTree(Color.RED, Trademark.PONTIAC, 7),
            new BinaryTree(Color.RED, Trademark.PONTIAC, 4),
            new BinaryTree(Color.RED, Trademark.PONTIAC, 5),
            new BinaryTree(Color.YELLOW, Trademark.PONTIAC, 6),
            new BinaryTree(Color.GREEN, Trademark.PONTIAC, 7),};

        for (BinaryTree node : data) {
            tree.insert(node);
        }
        
        System.out.println("Found:" + tree.searchByColor(Color.GREEN).debug("---"));

        System.out.println(tree.debug(""));
    }
}
