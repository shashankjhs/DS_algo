package dataStructure;

public class LinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NodeForLinkedList node=new NodeForLinkedList();
		NodeForLinkedList node1=new NodeForLinkedList();
		NodeForLinkedList node2=new NodeForLinkedList();
		NodeForLinkedList node4=new NodeForLinkedList();
		//node inserted later to linked list
		NodeForLinkedList node3=new NodeForLinkedList();
		//assign start point 
		NodeForLinkedList Startpoint=node;

		//initialize data for nodes
		node.info=10;
		node1.info=20;
		node2.info=30;
		node4.info=40;
		
		node3.info=50;//node inserted later to linked list
		
		//linked node
		node.nextRef=node1;
		node1.nextRef=node2;
		node2.nextRef=node4;
		while(node!=null)
		{
			
			System.out.println(node.info);
			node=node.nextRef;
		}
		
		//to insert element in between of likedlist
		
		node=Startpoint;//assign node again to startpoint
		//navigate till '30'
		while(node.info!=30)
		{
			node=node.nextRef;
		}
		//insert node in between 
		node3.nextRef=node.nextRef;
		node.nextRef=node3;
		
		node=Startpoint;//assign node again to startpoint
		System.out.println("");
		System.out.println("Insertion completed in between the list");
		while(node!=null)
		{
			System.out.println(node.info);
			node=node.nextRef;
		}

		node=Startpoint;
		//add node in the begining of liskelist
		NodeForLinkedList addAtStart=new NodeForLinkedList();
		addAtStart.info=5;
		addAtStart.nextRef=node;
		Startpoint=addAtStart;
		node=Startpoint;
		System.out.println("");
		System.out.println("Insertion completed in starting of list");
		while(node!=null)
		{
			System.out.println(node.info);
			node=node.nextRef;
		}
		//navigate to end of linked list
		node=Startpoint;
		System.out.println("");
		System.out.println("Insertion completed in starting of list");
		while(node.nextRef!=null)
		{
			System.out.println(node.info);
			node=node.nextRef;
		}
		//add node in the end of liskelist
				NodeForLinkedList addAtEnd=new NodeForLinkedList();
				addAtEnd.info=80;
				node.nextRef=addAtEnd;
				
				node=Startpoint;
				System.out.println("");
				System.out.println("Insertion completed in end of list");
				while(node!=null)
				{
					System.out.println(node.info);
					node=node.nextRef;
				}
		
		
		
		
	}

}
