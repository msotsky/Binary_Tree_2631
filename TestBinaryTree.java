
public class TestBinaryTree{

	public static void main(String[] args) {

		// Instantiate a binary tree and add some nodes to it
		BinaryTree<String> bt = new BinaryTree<String>();
		
		bt.insertLeft("A");
		bt.insertLeft("B");
		bt.insertRight("C");

		//A D F G H K L P Q R W Z (PRE)
		//G F H K D L A W R Q P Z (IN)
		//F G H D A L P Q R Z W K (POST)
		//G F H K D L A W R Q P Z (POST)


		//bt.BinaryTree.setRightChild(5);
		//bt.BinaryTree.setRightChild(6);
		
		// Call in-order traversal on your tree
		bt.inOrder();
		System.out.println();
		
		// Call pre-order traversal on your tree
		bt.preOrder();
		System.out.println();
		
		// Call post-order traversal on your tree
		bt.postOrder();
		System.out.println();
		
		BinaryTree<Integer> q1 = new BinaryTree<>();
		q1.insertLeft(1);
		q1.insertLeft(2);
		q1.insertLeft(4);
		q1.insertLeft(5);
		q1.insertRight(3);
		
		q1.inOrder();
		System.out.println();
		q1.preOrder();
		System.out.println();
		q1.postOrder();
		System.out.println();

		q1.subTreeSwap();
		q1.preOrder();
		

		
		
	}

}
