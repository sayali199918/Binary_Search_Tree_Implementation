
public class Runner {

	public static void main(String[] args) {
		Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
    	root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	int x=20;
    	int z=15;
    	
    	BinarySearchTree b1=new BinarySearchTree();
    	root=b1.insert(root,x);
    	System.out.println("Insert the element in BST: ");
	    b1.inorder(root);
	   
	    
	    System.out.println();
	    
	    root=b1.delNode(root,z);
	    System.out.println("Delete the element in BST: ");
	    b1.inorder(root);
	}

}
