public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	public add(int newNumber) {
		if (this.value == null) {
			this.value = newNumber;
		} else {
			if (newNumber > this.value) {
				if (right == null) {
				right = new IntegerTreeNode(newNumber);
				} else {
				right.add(newNumber);
				}
			} else {
				if (left == null) {
				left = new IntegerTreeNode(newNumber);
				} else {
				left.add(newNumber);
				}
			}
		}
	}
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
			} else if (n > this.value) {
			if (right == null) {
			return false;
			} else {
			return right.contains(n);
			}
		} else {
			if (left == null) {
			return false;
			} else {
			return left.contains(n);
			}
		}
	}
	public void getMax() {
		if (right != null) {
		System.out.println(left);
	} else {
		System.out.println("Null");
	}
	}
	public void getMin() {
	if (left != null) {
		System.out.println(right);
	} else {
		System.out.println("Null");
	}
	}
}