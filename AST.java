package AST;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AST {
		
		public static class Integer {
			String name;
			int val;
		}
		
		public static class Boolean {
			String name;
			boolean val;
		}
		static class Node {
			int val;
			boolean expr;
			String n;
			Node left, right;
				
			public Node(String name, int value) {
				val=value;
				n=name;
				left=null;
				right=null;
			}
			public Node(String name, boolean value) {
				expr=value;
				n=name;
				left=null;
				right=null;
			}
		}
		
		static class BinaryTree{
			Node root;
			void printLevelOrder() {
				Queue<Node> queue= new LinkedList<Node>();
				queue.add(root);
				while (!queue.isEmpty()) {
					Node tempNode = queue.poll();
					System.out.print(tempNode.n+" "+tempNode.val+" "+",");
					if (tempNode.left!=null) {
						queue.add(tempNode.left);
					}
					if (tempNode.right!=null) {
						queue.add(tempNode.right);
					}
					
				}
			}
		}
		
		public static void main(String[] args) {
			BinaryTree tree1 = new BinaryTree();
			BinaryTree tree2 = new BinaryTree();
			//Prompt the user to input a value determining which type of variable to create
			for (int j =0; j < 2; j++) {
				if ( j == 0) {
			System.out.print("Enter the amount of variables to be created: ");
			Scanner input = new Scanner(System.in);
			Scanner names = new Scanner(System.in);
			Scanner fileName = new Scanner(System.in);
			Scanner values = new Scanner(System.in);
			int i = 0;
			int amount = input.nextInt();
			try {
				System.out.print("Please enter a name for a file for the first AST: ");
				String userFile = fileName.nextLine();
				userFile = userFile.concat(".txt");
				File userCreation = new File(userFile);
				FileWriter Write = new FileWriter(userFile);
			while (i != amount) {
			System.out.println("Enter a 0 to create an int variable or 1 to create a boolean variable:");
			int userType = input.nextInt();
			switch (userType) {
			case 0:
				Integer userInteger = new Integer();
				System.out.println("Please name your integer: ");
				userInteger.name = names.nextLine();
				System.out.println("Please enter the value of your integer:");
				userInteger.val = values.nextInt();
							if (i == 0) {
							System.out.println("File created: " + userCreation.getName());
							Write.write("Program: AST\n");
							Write.write("\t - Body : \"Main\"  \n");
							}
							Write.write("\t\t - Type : \"int\"  \n");
							Write.write("\t\t\t + Name : \"" + userInteger.name + "\"\n");
							Write.write("\t\t\t + Val : \"" + userInteger.val + "\"\n");
							if (tree1.root==null) {
								tree1.root=new Node(userInteger.name, userInteger.val);
								}
							else if (tree1.root!=null) {
									if (tree1.root.left==null) {
										tree1.root.left=new Node (userInteger.name, userInteger.val);
									}
									else if (tree1.root.right==null && tree1.root.left!=null) {
										tree1.root.right=new Node (userInteger.name, userInteger.val);
									}
									else if (tree1.root.left.left==null && tree1.root.right!=null) {
										tree1.root.left.left=new Node (userInteger.name, userInteger.val);
									}
									else if(tree1.root.left.right==null && tree1.root.left.left!=null) {
										tree1.root.left.right=new Node(userInteger.name, userInteger.val);
									}
								}
				i++;
				break;
			 case 1:
				Boolean userBoolean = new Boolean();
				System.out.println("Please name your boolean value: ");
				userBoolean.name = names.nextLine();
				System.out.println("Please enter true or false for your boolean value: ");
				userBoolean.val = values.nextBoolean();

						if (i == 0) {
						System.out.println("File created: " + userCreation.getName());
						Write.write("Program: AST\n");
						Write.write("\t - Body \"Main\" : \n");
						}
						Write.write("\t\t - Type \"boolean\" : \n");
						Write.write("\t\t\t + Name : \"" + userBoolean.name + "\"\n");
						Write.write("\t\t\t + Val : \"" + userBoolean.val + "\"\n");
						if (tree1.root==null) {
							tree1.root=new Node(userBoolean.name, userBoolean.val);
							}
						else if (tree1.root!=null) {
								if (tree1.root.left==null) {
									tree1.root.left=new Node (userBoolean.name, userBoolean.val);
								}
								else if (tree1.root.right==null && tree1.root.left!=null) {
									tree1.root.right=new Node (userBoolean.name, userBoolean.val);
								}
								else if (tree1.root.left.left==null && tree1.root.right!=null) {
									tree1.root.left.left=new Node (userBoolean.name, userBoolean.val);
								}
								else if(tree1.root.left.right==null && tree1.root.left.left!=null) {
									tree1.root.left.right=new Node(userBoolean.name, userBoolean.val);
								}
							}
				i++;			
				break;
			}
			}
						Write.close();
			}
			catch (IOException e) {
						System.out.println("An error occurred: ");
						e.printStackTrace();
			}
			}
				else if ( j == 1) {
					System.out.print("Enter the amount of variables to be created: ");
					Scanner input = new Scanner(System.in);
					Scanner names = new Scanner(System.in);
					Scanner fileName = new Scanner(System.in);
					Scanner values = new Scanner(System.in);
					int i = 0;
					int amount = input.nextInt();
					try {
						System.out.print("Please enter a name for a file for the first AST: ");
						String userFile = fileName.nextLine();
						userFile = userFile.concat(".txt");
						File userCreation = new File(userFile);
						FileWriter Write = new FileWriter(userFile);
					while (i != amount) {
					System.out.println("Enter a 0 to create an int variable or 1 to create a boolean variable:");
					int userType = input.nextInt();
					switch (userType) {
					case 0:
						Integer userInteger = new Integer();
						System.out.println("Please name your integer: ");
						userInteger.name = names.nextLine();
						System.out.println("Please enter the value of your integer:");
						userInteger.val = values.nextInt();
									if (i == 0) {
									System.out.println("File created: " + userCreation.getName());
									Write.write("Program: AST\n");
									Write.write("\t - Body : \"Main\"  \n");
									}
									Write.write("\t\t - Type : \"int\"  \n");
									Write.write("\t\t\t + Name : \"" + userInteger.name + "\"\n");
									Write.write("\t\t\t + Val : \"" + userInteger.val + "\"\n");
									if (tree2.root==null) {
										tree2.root=new Node(userInteger.name, userInteger.val);
										}
									else if (tree2.root!=null) {
											if (tree2.root.left==null) {
												tree2.root.left=new Node (userInteger.name, userInteger.val);
											}
											else if (tree2.root.right==null && tree2.root.left!=null) {
												tree2.root.right=new Node (userInteger.name, userInteger.val);
											}
											else if (tree2.root.left.left==null && tree2.root.right!=null) {
												tree2.root.left.left=new Node (userInteger.name, userInteger.val);
											}
											else if(tree2.root.left.right==null && tree2.root.left.left!=null) {
												tree2.root.left.right=new Node(userInteger.name, userInteger.val);
											}
										}
										
						i++;
						break;
					 case 1:
						Boolean userBoolean = new Boolean();
						System.out.println("Please name your boolean value: ");
						userBoolean.name = names.nextLine();
						System.out.println("Please enter true or false for your boolean value: ");
						userBoolean.val = values.nextBoolean();

						if (i == 0) {
						System.out.println("File created: " + userCreation.getName());
						Write.write("Program: AST\n");
						Write.write("\t - Body \"Main\" : \n");
						}
						Write.write("\t\t - Type \"boolean\" : \n");
						Write.write("\t\t\t + Name : \"" + userBoolean.name + "\"\n");
						Write.write("\t\t\t + Val : \"" + userBoolean.val + "\"\n");				
						if (tree2.root==null) {
							tree2.root=new Node(userBoolean.name, userBoolean.val);
							}
						else if (tree2.root!=null) {
								if (tree2.root.left==null) {
									tree2.root.left=new Node (userBoolean.name, userBoolean.val);
								}
								else if (tree2.root.right==null && tree2.root.left!=null) {
									tree2.root.right=new Node (userBoolean.name, userBoolean.val);
								}
								else if (tree2.root.left.left==null && tree2.root.right!=null) {
									tree2.root.left.left=new Node (userBoolean.name, userBoolean.val);
								}
								else if(tree2.root.left.right==null && tree2.root.left.left!=null) {
									tree2.root.left.right=new Node(userBoolean.name, userBoolean.val);
								}
							}
				i++;
				break;
			}
			}
						System.out.print("Level order traversal of binary tree one is:");
						tree1.printLevelOrder();
						System.out.println();
						System.out.print("Level order traversal of binary tree two is:");
						tree2.printLevelOrder();
						Write.close();
			}
			catch (IOException e) {
						System.out.println("An error occurred: ");
						e.printStackTrace();
			}
			}
		}
	}
}