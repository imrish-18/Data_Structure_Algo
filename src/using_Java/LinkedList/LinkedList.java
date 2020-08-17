package LinkedList;
import java.util.*;
public class LinkedList {
	Node head;
	static class Node
	{
		int data;
		Node next;
		
	}
	
	// creating node
	
	static Node createNode(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		return temp;
	}

	// inserting node into linkedList
 static void insertNode(int data,LinkedList list)
  {
	  Node node;
	  
	  if(list.head==null)
	  {
		  list.head=createNode(data);
		 System.out.println("first node inserted successfully.....");
		
	  }
	  else
	  {
		  node=list.head;
		  while(node.next!=null)  
		  {
			  node=node.next;
			  
		  }
		  node.next=createNode(data);
		  
	  }
	 
  }
	
 // displaying the element of linked list
	static void traverse(Node list)
	{
		Node temp=list;
		int sum=0;
		while(temp!=null)
		{
			System.out.println(temp.data);
			sum+=temp.data;
			temp=temp.next;
		}
		System.out.println("sum of the element in linkList is.."+sum);
	}
	
	// inserting last node into linkedList
	 static void insertLastNode(int data,LinkedList list)
	 {
		Node temp;
		temp=list.head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=createNode(data);
	 }
	 // deleting first node from linked  list
	 static void deleteFirstNode(LinkedList list)
	 {
		 Node temp;
		 temp=list.head;
		list.head=temp.next;
		temp=null;
		
	 }
	// deleting last node from linked list
	 static void lastNodeDeleteion(LinkedList list)
	 {
		
		 Node n,temp;
	     n=list.head;
	     temp=null;
	     while(n.next!=null)
	     {
	         temp=n;
	        n=n.next;
	     }
	     temp.next=null;
	     n=null;
	 }
	 
	 // reverse the linked list
	 static void reverseLinkedList(LinkedList list)
	 
	 {
	    Node q,r,p;
	    q=null;
	    r=null;
	    p=list.head;
	    while(p!=null)
	    {
	    	r=q;
	    	q=p;
	    	p=p.next;
	    	q.next=r;
	    }
	    
	    list.head=q;
	 }
	public static void main(String[] args) 
	{
       LinkedList list=new LinkedList();
       Scanner sc=new Scanner(System.in);
       int data=0;
       System.out.println("enter the data into list");
       
       for(int i=0;i<4;i++)
       {
    	    data=sc.nextInt();
    	   insertNode(data, list);
       }
       //reverseLinkedList(list);
       
//       System.out.println("enter the last node to linkedList");
//       data=sc.nextInt();
       //insertLastNode(data, list);
       
       System.out.println("the data into linked list are..");
       traverse(list.head);
       
       System.out.println("reverse linkedlist is...");
       reverseLinkedList(list);
       traverse(list.head);
//       System.out.println("delete the first node of linkedList and remaining data is..");
//       deleteFirstNode(list);
//       traverse(list.head);
//       
//       System.out.println("delete the last node of linkedList and the remaining data is..");
//       lastNodeDeleteion(list);
//       traverse(list.head);
//       
//       sc.close();
       }

	}


