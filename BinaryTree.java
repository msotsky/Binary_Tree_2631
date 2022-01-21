
public class BinaryTree<E> {
	
	// Instance variables
	
	private TreeNode<E> root;

	
	// Private class
	
	public static class TreeNode<E> {
		private E data;
		private TreeNode<E> leftChild;
		private TreeNode<E> rightChild;
		
		TreeNode(E newData){
			data = newData;
			leftChild = null;
			rightChild = null;
		}
		
		public E getData() {
			return data;
		}
		public void setLeftChild(TreeNode<E> newChild){
			leftChild = newChild;
		}
		
		public void setRightChild(TreeNode<E> newChild){
			rightChild = newChild;
		}
		
		public TreeNode<E> getLeftChild(){
			return leftChild;
		}
		
		public TreeNode<E> getRightChild(){
			return rightChild;
		}
	}

	// Constructor
	
	BinaryTree() {
		root = null;
	}
	
	// How is insert working? Where are new nodes being placed?
	public void insertLeft(E newData){
		TreeNode<E> newNode = new TreeNode<E>(newData);
		boolean foundInsertionPlace = false;
		if (this.root == null){
			this.root = newNode;
		}
		else{
			TreeNode<E> current = root;
			TreeNode<E> parent;
			parent = current;
			while (!foundInsertionPlace){
				if (current.getLeftChild() == null){
					current.setLeftChild(newNode);
					foundInsertionPlace = true;
				}
				else {
					parent =current;
					current = current.getLeftChild();	
				}
			}
		}
	}
	public void insertRight(E newData){
		TreeNode<E> newNode = new TreeNode<E>(newData);
		boolean foundInsertionPlace = false;
		if (this.root == null){
			this.root = newNode;
		}
		else{
			TreeNode<E> current = root;
			TreeNode<E> parent;
			parent = current;
			while (!foundInsertionPlace){
				if (current.getRightChild() == null){
					current.setRightChild(newNode);
					foundInsertionPlace = true;
				}
				else {
					parent =current;
					current = current.getRightChild();	
				}
			}
		}
	}
	
	// public access to in-order traversal of tree
	
	public void inOrder(){
		inOrderSub( root ); // start the recursive partner off at the root node
	 }
		
	
	private void inOrderSub(TreeNode<E> current) {
		if (current != null) {
		    inOrderSub(current.getLeftChild()); // print the left subTree 
		    System.out.print( current.getData() + " "); // print the node data 
		    inOrderSub(current.getRightChild()); // print the right subTree
		}
	}
	
	
	// add similar public/private access for pre-order traversal
	public void preOrder(){
		preOrderSub(root);
	}
	private void preOrderSub(TreeNode<E> current){
		if(current != null){
			int x = (int) (current.getData() +1);
			current.data = (E) x;

			System.out.print(current.getData() + " ");
			preOrderSub(current.getLeftChild());
			preOrderSub(current.getRightChild());
		}
	}
	
	
	// add similar public/private access for post-order traversal
	public void postOrder(){
		postOrderSub(root);
	}
	private void postOrderSub(TreeNode<E> current){
		if(current != null){
			postOrderSub(current.getLeftChild());
			postOrderSub(current.getRightChild());
			System.out.print(current.getData() + " ");
		}
	}
	//subTreeSwap - takes reference to root node
				//-moves the og left subtree to become the right subTree
				//-og right becomes left
	

	public void subTreeSwap(){
		subTreeSwap(root);
	}
	public void subTreeSwap(TreeNode<E> root){
		TreeNode<E> left;
		TreeNode<E> right;
		left = root.getLeftChild();
		right = root.getRightChild();

		root.setLeftChild(right);
		root.setRightChild(left);
	}
}
