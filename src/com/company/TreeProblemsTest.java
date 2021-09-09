package com.company;

class TreeProblemsTest {

    @org.junit.jupiter.api.Test
    void dfs() {
        TreeProblems.BinaryTreenode binaryTreenode1 = new TreeProblems.BinaryTreenode();
        TreeProblems.BinaryTreenode binaryTreenode2 = new TreeProblems.BinaryTreenode();
        TreeProblems.BinaryTreenode binaryTreenode3 = new TreeProblems.BinaryTreenode();

        binaryTreenode1.right = binaryTreenode2;
        binaryTreenode1.left = binaryTreenode3;
        binaryTreenode1.element = 1;

        binaryTreenode2.right = null;
        binaryTreenode2.left = null;
        binaryTreenode2.element = 2;

        binaryTreenode3.right = null;
        binaryTreenode3.left = null;
        binaryTreenode3.element = 3;

        TreeProblems.dfs(binaryTreenode1);
        System.out.println();
    }
}