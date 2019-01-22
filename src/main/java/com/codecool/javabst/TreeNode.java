package com.codecool.javabst;

public class TreeNode {

  public int value;
  public TreeNode leftChild;
  public TreeNode rightChild;

  public TreeNode(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return Integer.toString(value);
  }

  public void removeChild(TreeNode child) {
    if (leftChild == child) {
      leftChild = null;
    } else if (rightChild == child) {
      rightChild = null;
    } else {
      throw new IllegalArgumentException("Tried to remove non existing child");
    }
  }
}
