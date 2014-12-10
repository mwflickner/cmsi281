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

	public void setParent(TreeNode newParent){
		this.parent = newParent;
	}

	public void removeParent(){
		this.parent = null;
	}

	public boolean hasLeft(){
		if(this.left==null){
			return false;
		}
		else{
			return true;
		}
	}


	public void setLeft(TreeNode newLeft){
		this.left = newLeft;
	}

	public void removeLeft(){
		this.left = null;
	}


	public boolean hasRight(){
		if(this.right==null){
			return false;
		}
		else{
			return true;
		}
	}

	public void setRight(TreeNode newRight){
		this.right = newRight;
	}

	public void removeRight(){
		this.right = null;
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