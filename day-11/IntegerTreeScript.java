public class IntegerTreeScript {	
	public static void main (String[] args) {
		IntegerTreeScript myTree = new IntegerTreeScript();
		myTree.launch();
	}
	public void launch(){
		IntegerTreeNode firstNode = new IntegerTreeNode();
		testTree(firstNode);
	}
	private void testTree(IntegerTree tree){
		System.out.println("Testing the tree..."); 
		tree.add(9);
		tree.add(2);
		tree.add(5);
		tree.add(100);
		tree.getMax();
		System.out.println(tree.getMin());
	}
}
