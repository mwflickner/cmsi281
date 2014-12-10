public class TreeNode {
	private Object data;
	private TreeNode parent;
	private TreeNode lSon;
	private TreeNode rBro;

	public TreeNode(){
		this.data = null;
		this.parent = null;
		this.lSon = null;
		this.rBro = null;
	}

	public TreeNode(Object o){
		this.data = o;
		this.parent = null;
		this.lSon = null;
		this.rBro = null;
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

	public void setLSon(TreeNode newLSon){
		this.lSon = newLSon;
	}

	public void removeLSon(){
		this.lSon = null;
	}

	public void setRBro(TreeNode newRBro){
		this.rBro = newRBro;
	}

	public void removeRBro(){
		this.rBro = null;
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