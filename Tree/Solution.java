/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(nums,0,nums.length-1);
    }
    private TreeNode constructTree(int[] nums,int start,int end){
        if(end<start)
            return null;
        int rootIndex =  getMaxIndex(nums,start,end);
        TreeNode root = new TreeNode(nums[rootIndex]);
        root.left = constructTree(nums,start,rootIndex-1);
        root.right = constructTree(nums,rootIndex+1,end);
        return root;
    }
    private int getMaxIndex(int[] nums,int start,int end){
        int max = nums[start];
        int index = start;
        for(int i = start;i<=end;i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        return index; 
    }
}