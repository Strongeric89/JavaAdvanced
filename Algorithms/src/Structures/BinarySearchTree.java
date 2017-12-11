package Structures;

class TreeNode{
	
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	
	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	//find method
	public TreeNode find (int data) {
		if(this.data == data) {
			return this;
		}
		if(data < this.data && left !=null) {
			return this.left.find(data);
		}
		if(data > this.data && right !=null) {
			return this.right.find(data);
		}
		return null;
		
		
	}
	
	public void insert(int data) {
		if(data >= this.data) {
			if(this.right == null) {
				this.right = new TreeNode(data);
			}else {
				this.right.insert(data);
			}
		}else {
			if(this.left == null) {
				this.left = new TreeNode(data);
			}else {
				this.left.insert(data);
			}
			
		}
	}
	
	
	
}


// All data on left are less than the root
// All data on right are greater than the root
public class BinarySearchTree {
	
	private TreeNode root;
	
	
	public void insert(int data) {
		if(root == null) {
			this.root = new TreeNode(data);
		}
		else {
			this.root.insert(data);
		}
	}
	
	public TreeNode find(int data) {
		if(root != null) {
			return root.find(data);
		}
		return null;
	}
	
	public void delete(int data) {
		
	}

}
