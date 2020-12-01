package com.blz.dslinkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestLinkedList {

	@Test
	public void given3NumbersAdded() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedAtTheTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.add(mySecondNode);
		lst.add(myThirdNode);
		lst.printMyNodes();
		boolean result = MyLinkedList.head.equals(myThirdNode) && MyLinkedList.head.getNext().equals(mySecondNode)
				&& MyLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAppendedToLinkedListShouldBeAddedAtTheLast() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.printMyNodes();
		boolean result = MyLinkedList.head.equals(myFirstNode) && MyLinkedList.head.getNext().equals(mySecondNode)
				&& MyLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenInsertedToLinkedListShouldBeAddedInBetweenElements() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.append(myThirdNode);
		lst.insert(myFirstNode, mySecondNode);
		lst.printMyNodes();
		boolean result = MyLinkedList.head.equals(myFirstNode) && MyLinkedList.head.getNext().equals(mySecondNode)
				&& MyLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedtoLinkedListAndDeleteFirstElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.pop();
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.printMyNodes();
		boolean result = MyLinkedList.head.equals(mySecondNode) && MyLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedtoLinkedListAndDeleteLastElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.popLast();
		lst.printMyNodes();
		boolean result = MyLinkedList.head.equals(myFirstNode) && MyLinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedtoLinkedListAndSearchElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.search(30);
		lst.printMyNodes();
		boolean result = MyLinkedList.head.equals(myFirstNode) && MyLinkedList.head.getNext().equals(mySecondNode)
				&& MyLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedtoLinkedListToSearchAndInsertElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myFourthNode);
		lst.searchAndInsertValue(30, myThirdNode);
		lst.printMyNodes();
		boolean result = MyLinkedList.head.equals(myFirstNode) && MyLinkedList.head.getNext().equals(mySecondNode)
				&& MyLinkedList.head.getNext().getNext().equals(myThirdNode) && MyLinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenNumbersWhenAddedtoLinkedListToSearchAndDeleteElementToReturnSizeOfList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.append(myFourthNode);
		lst.searchAndDelete(40);		
		lst.printMyNodes();
		lst.size();
		boolean result = MyLinkedList.head.equals(myFirstNode) && MyLinkedList.head.getNext().equals(mySecondNode)
								&& MyLinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
	}
}
