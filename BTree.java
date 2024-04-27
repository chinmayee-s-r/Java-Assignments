package assignment6;
import java.util.*;

public class BTree {
	
	Node root;
	Scanner sc = new Scanner(System.in);
	BTree()
	{
		root=null;
	}
	
	void create()
    {
        int flag = 1;
        Node temp = null;
        Node ptr;
        do
        {
            if(root== null)
            {
                System.out.print("Enter data to be added at root : ");
                int d = sc.nextInt();
                temp = new Node(d);
                this.root = temp;
            }
            else
            {
                ptr = root;
                while(ptr != null)
                {
                    System.out.print("\nChoose direction: Press 'l' for left and 'r' for right: ");
                    String ch = sc.next();
                    if(ch.equals("L")||ch.equals("l"))
                    {
                        if(ptr.left == null)
                        {
                            System.out.print("\nAdding data to the left of "+ptr.data+". Enter data:  ");
                            int d = sc.nextInt();
                            temp = new Node(d);
                            ptr.left =temp;
                            System.out.println("\n"+d+ " added to the left of "+ptr.data);
                            break;
                        }
                        else
                        {
                            System.out.print("\nPosition occupied by "+ptr.left.data+". Moving left.");
                            ptr = ptr.left;
                            System.out.println("\nPointer is now at "+ptr.data);
                        }
                    }
                    else if(ch.equals("R")||ch.equals("r"))
                    {
                        if(ptr.right==null)
                        {
                            System.out.print("\nAdding data to the right of "+ptr.data+". Enter data:  ");
                            int d = sc.nextInt();
                            temp = new Node(d);
                            ptr.right = temp;
                            System.out.println("\n"+d+ " added to the right of "+ptr.data);
                            break;
                        }
                        else
                        {
                            System.out.print("\nPosition occupied by "+ptr.right.data+". Moving right.");
                            ptr = ptr.right;
                            System.out.println("\nPointer is now at "+ptr.data);
                        }
                    }
                    else 
                    {
                        System.out.println("\nINVALID CHOICE");
                        break;
                    }
                }
            }
            System.out.print("\nDo you want to continue to add nodes ?\nPress 1 to continue\n0 to exit: ");
            flag = sc.nextInt();
        }while(flag ==1);
        System.out.println("\nBinary tree created.\n");
    }
	
	void recursive_Inorder(Node n1)
	{
		if (root==null)
		{
			System.out.println("\nThe tree is empty");
		}
		else
		{
		    if(n1==root)
		    {
		        System.out.println("\nRecursive inorder traversal of the tree:");
		    }
			if (n1==null)
		    {
			    return;
		    }
		    recursive_Inorder(n1.left);
		    System.out.print(n1.data + " ");
		    recursive_Inorder(n1.right);
		}
	}
	void nonRecursive_Inorder()
	{
		if(root ==null)
		{
			System.out.println("\nThe tree is empty.\n");
			return;
		}
		System.out.println("\nNon-recursive inorder traversal of the tree:");
		Stack <Node> s = new Stack<Node>();
		Node ptr = root;
		while (ptr!=null || s.size()>0)
		{
			while(ptr!=null)
			{
				s.push(ptr);
				ptr=ptr.left;
			}
			ptr=s.pop();
			System.out.print(ptr.data + " ");
			ptr=ptr.right;
		}
	}
	
	void recursive_Preorder(Node n1)
	{
		if (root==null)
		{
			System.out.println("\nThe tree is empty.");
		}
		else
		{
		    if(n1==root)
		    {
		        System.out.println("\nRecursive preorder traversal of the tree:");
		    }
			if (n1==null)
		    {
			    return;
		    }
		    System.out.print(n1.data + " ");
		    recursive_Preorder(n1.left);
		    recursive_Preorder(n1.right);
		}
	}
	void nonRecursive_Preorder()
	{
		if(root ==null)
		{
			System.out.println("\nThe tree is empty.");
			return;
		}
		System.out.println("\nNon-recursive preorder traversal of the tree:");
		Stack <Node> s = new Stack<Node>();
		Node ptr = root;
		s.push(ptr);
		while (!s.isEmpty())
		{
			ptr=s.peek();
			System.out.print(ptr.data + " ");
			ptr=s.pop();
			if (ptr.right!=null)
			{
				s.push(ptr.right);
			}
			if (ptr.left!=null)
			{
				s.push(ptr.left);
			}
		}
	}
	
	void recursive_Postorder(Node n1)
	{
		if (root==null)
		{
			System.out.println("The tree is empty.");
		}
		else
		{
		    if(n1==root)
		    {
		        System.out.println("Recursive post order traversal of the tree:");
		    }
			if (n1==null)
		    {
			    return;
		    }
		    recursive_Postorder(n1.left);
		    recursive_Postorder(n1.right);
		    System.out.print(n1.data + " ");
		}
	}
	void nonRecursive_Postorder()
	{
		if (root==null)
		{
			System.out.println("The tree is empty.\n");
			return;
		}
		System.out.println("Non-recurisve post order traversal of the tree:");
		Stack <Node> s1 = new Stack<Node>();
		Stack <Integer> s2 = new Stack<Integer>();
		s1.push(root);
		while(!s1.isEmpty())
		{
			Node ptr = s1.pop();
			s2.push(ptr.data);
			if (ptr.left!=null)
			{
				s1.push(ptr.left);
			}
			if (ptr.right!= null)
			{
				s1.push(ptr.right);
			}
		}
		while (!s2.isEmpty())
		{
			System.out.print(s2.pop() + " ");
		}
	}

}
