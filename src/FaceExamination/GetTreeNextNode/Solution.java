package FaceExamination.GetTreeNextNode;

public class Solution {

    private static TreeNode GetNextNode(TreeNode treeNode){

        if (treeNode == null){
            return null;
        }
        // 由中序遍历的特点所知，若当前节点存在于右子树，那么后继节点一定是右子树的最左节点
        if (treeNode.right != null){
            treeNode = treeNode.right;
            while (treeNode.left != null){
                treeNode = treeNode.left;
            }
            return treeNode;
        }
        // 若该节点无右子树，则返回其父节点的左子节点的节点，那么这个节点的父节点就是我们要找的下一个节点
        while (treeNode.parent != null){
            if (treeNode.parent.left == null){
                return treeNode.parent;
            }
            treeNode = treeNode.parent;
        }
        // 遍历至根节点，若没找到则返回null
        return null;
    }
}
