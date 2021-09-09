package com.company;

import java.util.List;

public class TreeProblems {
    static class BinaryTreenode    {
        int element;
        BinaryTreenode left;
        BinaryTreenode right;
    }
    public static void dfs(BinaryTreenode root)   {
        if(root == null)
            return;
        System.out.print(root.element+" -> ");
        if(root.left != null)
            dfs(root.left);
        if(root.right != null)
            dfs(root.right);
    }
}
