package com.company;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //swap
        root.right = left;
        root.left = right;

        return root;
    }
}
