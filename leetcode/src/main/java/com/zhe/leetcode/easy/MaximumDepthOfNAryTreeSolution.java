package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.Node;

/**
 * 559. Maximum Depth of N-ary Tree
 *
 * @author zhangzhe
 */
public class MaximumDepthOfNAryTreeSolution {

    public static void main(String[] args) {
        Node root = Node.initRoot();
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(Node root) {
        int depth = 1;
        if (root == null) {
            return 0;
        }
        if (root.children == null) {
            return depth;
        }
        for (Node n : root.children) {
            depth = Math.max(depth, maxDepth(n) + 1);
        }
        return depth;
    }

}
