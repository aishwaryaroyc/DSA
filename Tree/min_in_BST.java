//https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        while(root.left != null)
            root = root.left;
            
        return root.data;
    }
}
