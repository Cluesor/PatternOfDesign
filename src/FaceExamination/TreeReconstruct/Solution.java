package FaceExamination.TreeReconstruct;

public class Solution {




    private static TreeNode reConstructBiTree(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn){

        // 定义递归出口
        if (startPre > endPre || startIn > endIn){
            return null;
        }

        TreeNode root = new TreeNode(preorder[startPre]);  // 根节点为前序遍历中第一个节点

        for (int i = startIn; i <= endIn; i++) {
            if (inorder[i] == preorder[startPre]){
                root.left = reConstructBiTree(preorder, startPre + 1, startPre + 1 - startIn, inorder, startIn, i - 1);  // 左子树递归
                root.right = reConstructBiTree(preorder, i - startIn + startPre + 1, endPre, inorder, i + 1, endIn);
            }

        }
        return root;
    }

    private static   TreeNode reConstructBiTree(int[] preoder, int[] inorder){
        TreeNode root = reConstructBiTree(preoder, 0, preoder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }


    public static void main(String[] args) {
        int[] preorder = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = new int[]{4, 7, 2, 1, 5, 3, 8 ,6};

        reConstructBiTree(preorder, inorder);
    }


}
