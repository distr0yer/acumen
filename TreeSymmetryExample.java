public class TreeSymmetryExample {

    //TODO: Add documentation, analyze complexity

    public static void main(String[] args) {

        // first case: positive
        TreeNode test = new TreeNode(null, 1);

        //          1
        //         /  \
        //        2    2
        //       / \  / \
        //      3   43   4

        test.left = new TreeNode(test, 2);
        test.right = new TreeNode(test, 2);

        test.left.left = new TreeNode(test, 3);
        test.left.right = new TreeNode(test, 4);

        test.right.left = new TreeNode(test, 3);
        test.right.right = new TreeNode(test, 4);

        System.out.println(symmetrical(test.left, test.right));

        // second case: negative
        //          1
        //         /  \
        //        2    2
        //       / \  / \
        //      3   33   4

        test.left = new TreeNode(test, 2);
        test.right = new TreeNode(test, 2);

        test.left.left = new TreeNode(test, 3);
        test.left.right = new TreeNode(test, 3);

        test.right.left = new TreeNode(test, 3);
        test.right.right = new TreeNode(test, 4);

        System.out.println(symmetrical(test.left, test.right));

        // third case: negative with missing nodes
        //          1
        //         /  \
        //        2    2
        //       / \  /
        //      3   33

        test.left = new TreeNode(test, 2);
        test.right = new TreeNode(test, 2);

        test.left.left = new TreeNode(test, 3);
        test.left.right = new TreeNode(test, 3);

        test.right.left = new TreeNode(test, 3);
        System.out.println(symmetrical(test.left, test.right));
    }

    public static boolean symmetrical(TreeNode left, TreeNode right){
        boolean isSymmetrical = true;

        if(!left.value.equals(right.value)){
            return false;
        }
        if(left.left != null && right.left != null){
            isSymmetrical = symmetrical(left.left, right.left);
        }
        if(right.right != null && left.right != null){
            isSymmetrical = symmetrical(left.right, right.right);
        }
        if ((right.left != null && left.left == null) ||
                (right.left == null && left.left != null) ||
                (right.right == null && left.right != null) ||
                (right.right != null && left.right == null)){
            return false;
        }
        return isSymmetrical;
    }
}

class TreeNode {
    public Integer value = null;
    public TreeNode parent = null;
    public TreeNode left = null;
    public TreeNode right = null;

    public TreeNode(TreeNode parent, Integer identifier)
    {
        this.parent = parent; //passing null makes this the root node
        this.value = identifier;
    }

    public boolean IsRoot() {
        return parent == null;
    }
}
