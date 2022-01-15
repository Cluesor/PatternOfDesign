package FaceExamination.TreeReconstruct;

/**
 *
 * 方法1 for循环较多，效率略低
 *
 */


public class RebuildBiTree {

//    TreeNode treeNode = new TreeNode();

    private TreeNode Rebuild(int[] preoder, int[] inorder){

        int len = preoder.length;  // 定义树中总节点数
        //创建二叉树对象，存储得到的二叉树。初始只有一个根结点（即前序遍历第一个元素）
        TreeNode root = new TreeNode(preoder[0]);   // 根节点为前序遍历中的第一个节点

    //递归出口一般放在递归方法的最前面
        if (len == 1){  // 当只剩一个节点的时候，即剩下一个叶子节点，则结束递归
            root.left = null;
            root.right = null;
            return root;
        }

        //从中序遍历中找出根节点
        int root_index = 0;  // 用于存放中序遍历中根节点的位置
        for (int i = 0; i < len; i++) {
            if (preoder[0] == inorder[i]){
                root_index = i;
                break;  // 找到之后结束if判断
            }

        }
        if (root_index > 0){
            int [] pre_left = new int[root_index];  // 前序遍历的左子树节点为 中序遍历中根节点前面的节点
            int[] in_left = new int[root_index]; // 中序遍历的左子树节点 为其根节点前面的节点

            for (int j = 0; j < root_index;  j++) {
                pre_left[j] = preoder[j + 1]; // 将前序遍历的左子树节点放入前序遍历的根节点之后
            }

            for (int j = 0; j < root_index; j++) {
                in_left[j] = inorder[j];   // 中序遍历到左子树节点放到中序遍历的根节点之前
            }
            root.left = Rebuild(pre_left, in_left);  // 左子树递归
        } else {
          root.left = null;
        }

        if ( len - root_index - 1 > 0){
            int [] pre_right = new int[len - root_index - 1];
            int[] in_right = new int[len - root_index -1];

            for (int j = root_index + 1; j < len;  j++) {
                pre_right[j - root_index - 1] = preoder[j]; // 将前序遍历的左子树节点放入前序遍历的根节点之后
            }
            for (int j = root_index + 1; j < len; j++) {
                in_right[j - root_index - 1] = inorder[j];   // 中序遍历到左子树节点放到中序遍历的根节点之前
            }

            root.right = Rebuild(pre_right, in_right);
        }else {
            root.right = null;
        }
        return root;

    }


    public static void main(String[] args) {
        RebuildBiTree rebuildBiTree = new RebuildBiTree();
        int[] preorder = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = new int[]{4, 7, 2, 1, 5, 3, 8 ,6};
        rebuildBiTree.Rebuild(preorder, inorder);

    }

}
