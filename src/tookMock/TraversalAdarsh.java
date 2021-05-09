package tookMock;

import java.util.Stack;

class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	class TraversalAdarsh {
		Node root;

		void inorder() {
			if (root == null)
				return;

			Stack<Node> s = new Stack<Node>();
			Node curr = root;

			while (curr != null || s.size() > 0) {

				while (curr != null) {

					s.push(curr);
					curr = curr.left;
				}
				curr = s.pop();

				System.out.print(curr.data + " ");

				// visiting right subtree
				curr = curr.right;
			}
		}

		void preorder() {
			if (root == null)
				return;

			Stack<Node> s = new Stack<Node>();
			s.push(root);

			while (s.empty() == false) {

				Node mynode = s.peek();
				System.out.print(mynode.data + " ");
				s.pop();

				if (mynode.right != null) {
					s.push(mynode.right);
				}
				if (mynode.left != null) {
					s.push(mynode.left);
				}
			}
		}

		public static void main(String args[]) {

			TraversalAdarsh tree = new TraversalAdarsh();
			tree.root = new Node(1);
			tree.root.left = new Node(2);
			tree.root.right = new Node(3);
			tree.root.left.left = new Node(4);
			tree.root.left.right = new Node(5);
			tree.inorder();
			System.out.println();
			tree.preorder();
		}
	}