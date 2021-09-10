package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class TreeProblems {
    static class BinaryTreenode    {
        int element;
        BinaryTreenode left;
        BinaryTreenode right;
    }
    public static void dfs(BinaryTreenode root)   {
        if(root == null)
            return;
        System.out.print(root.element+", ");
        dfs(root.left);
        dfs(root.right);
    }
    public static void bfs(BinaryTreenode root) {
        if(root == null)
            return;
        Queue<BinaryTreenode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())   {
            BinaryTreenode top = queue.poll();
            System.out.print(top.element+", ");
            if(top.left != null)
                queue.add(top.left);
            if(top.right != null)
                queue.add(top.right);
        }
    }
    public static void levelWisePrint(BinaryTreenode root)   {
        if(root == null) return;
        Queue<BinaryTreenode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty())    {
            Queue<BinaryTreenode> qNext = new LinkedList<>();
            while (!q.isEmpty())    {
                BinaryTreenode now = q.poll();
                if(now.left == null)
                    System.out.print("  ");
                else {
                    System.out.print("(" + now.left.element + ")");
                    qNext.add(now.left);
                }
                System.out.print(now.element);
                if(now.right == null)
                    System.out.print("  ");
                else {
                    System.out.print("("+now.right.element+")");
                    qNext.add(now.right);
                }
            }
            System.out.println();
            q = qNext;
        }
    }
    public static int heightDFS(BinaryTreenode root)   {
        if(root == null) return 0;
        else return 1 + Math.max(heightDFS(root.left), heightDFS(root.right));
    }
}
