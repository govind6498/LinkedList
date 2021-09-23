package com.bridgelabz.linkedlist;

public class MyNode<k> {
	private k key;
	private MyNode next;
	public MyNode(k key) {
		this.key = key;
		this.next =null;
	}
	public MyNode getNext() {
		return next;
	}
	public void setNext(MyNode next) {
		this.next = next;
	}
	public static void main(String[] args) {
		System.out.println("------Welcome to data strcutrue:Linked List------");
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		
	}
}
