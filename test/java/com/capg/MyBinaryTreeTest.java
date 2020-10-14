package com.capg;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyBinaryTreeTest {

	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size= myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}

}
