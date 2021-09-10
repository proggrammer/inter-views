package com.company;

class TreeProblemsTest {

    @org.junit.jupiter.api.Test
    void dfs() {
        System.out.println("Running dfs on :");
        TreeProblems.BinaryTreenode binaryTreenode = getBinaryTree();
        TreeProblems.levelWisePrint(binaryTreenode);
        TreeProblems.dfs(binaryTreenode);
        System.out.println();
        System.out.println("\n****\n");
    }

    @org.junit.jupiter.api.Test
    void bfs() {
        System.out.println("Running bfs on :");
        TreeProblems.BinaryTreenode binaryTreenode = getBinaryTree();
        TreeProblems.levelWisePrint(binaryTreenode);
        TreeProblems.bfs(binaryTreenode);
        System.out.println("\n****\n");
    }

    @org.junit.jupiter.api.Test
    void height() {
        System.out.println("Running height on :");
        TreeProblems.BinaryTreenode binaryTreenode = getBinaryTree();
        TreeProblems.levelWisePrint(binaryTreenode);
        System.out.println("HEIGHT: "+ TreeProblems.heightDFS(binaryTreenode));
        System.out.println("\n****\n");
    }
    TreeProblems.BinaryTreenode getBinaryTree() {
        TreeProblems.BinaryTreenode binaryTreenode1 = new TreeProblems.BinaryTreenode();
        TreeProblems.BinaryTreenode binaryTreenode2 = new TreeProblems.BinaryTreenode();
        TreeProblems.BinaryTreenode binaryTreenode3 = new TreeProblems.BinaryTreenode();
        TreeProblems.BinaryTreenode binaryTreenode4 = new TreeProblems.BinaryTreenode();
        TreeProblems.BinaryTreenode binaryTreenode5 = new TreeProblems.BinaryTreenode();

        binaryTreenode1.right = binaryTreenode3;
        binaryTreenode1.left = binaryTreenode2;
        binaryTreenode1.element = 1;

        binaryTreenode2.right = binaryTreenode5;
        binaryTreenode2.left = binaryTreenode4;
        binaryTreenode2.element = 2;

        binaryTreenode3.right = null;
        binaryTreenode3.left = null;
        binaryTreenode3.element = 3;

        binaryTreenode4.right = null;
        binaryTreenode4.left = null;
        binaryTreenode4.element = 4;

        binaryTreenode5.right = null;
        binaryTreenode5.left = null;
        binaryTreenode5.element = 5;


        return binaryTreenode1;
    }
}