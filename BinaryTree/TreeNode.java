public class TreeNode {
	private Object data;
	private TreeNode parent;
	private TreeNode left;
	private TreeNode right;


	public TreeNode(){
		this.data = null;
		this.parent = null;
		this.left = null;
		this.right = null;
	}

	public TreeNode(Object o){
		this.data = o;
		this.parent = null;
		this.left = null;
		this.right = null;
	}

	public void setData(Object o){
		this.data = o;
	}

	public void removeData(){
		this.data = null;
	}

	public void setParent(TreeNode node){
		this.parent = node;
	}

	public TreeNode getLeft(){
		return this.left;
	}
	public void setLeft(TreeNode node){
		this.left = node;
	}
	public void setRight(TreeNode node){
		this.right = node;
	}

	public boolean hasRight(){
		if(this.right==null){
			return false;
		}
		else{
			return true;
		}
	}

	public boolean hasLeft(){
		if(this.left==null){
			return false;
		}
		else{
			return true;
		}
	}

	public boolean nodeEmpty(){
		if(this.data == null){
			return true;
		}
		else{
			return false;
		}
	}

	






}