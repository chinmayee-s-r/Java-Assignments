package assignment8;
import java.util.*;

public class Graph {
	
	Scanner sc=new Scanner(System.in);
	int n;//number of vertices
	int e = 0;//number of edges
	int [][] adjMat=new int [20][20];//adjacency matrix of the graph
	Node[] head = new Node[10];//array of heads of linked list used for adjacency list

	void createUsingAdjMat() {
		System.out.println("Enter the number of houses:");
		n=sc.nextInt();
		System.out.println("Enter the number of Lanes:");
		e=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				adjMat[i][j]=0;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the house number and lane number:");
			int house=sc.nextInt();
			int lane=sc.nextInt();
			adjMat[house][lane]=1;
			adjMat[lane][house]=1;
			}
		}
	
	
	void displayAdjMat() {
		int i=0,j=0;
		for(i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for( i=1;i<=n;i++) {
			for( j=1;j<=n;j++) {
				System.out.print(adjMat[i][j]+" ");
			}
			System.out.println();
			}
		}
	
	
	void create_list() {
		System.out.println("Enter the number of houses:");
		n=sc.nextInt();
		System.out.println("Enter the number of Lanes:");
		e=sc.nextInt();
		for(int i=1;i<=e;i++) {
			System.out.println("Enter the house number and lane number:");
			int house=sc.nextInt();
			int lane=sc.nextInt();
			insert(house,lane);
			insert(lane,house);
		}
	}
	
	
	void insert(int u,int v) {
		Node newnode=new Node(v);
		if(head[u]==null) {
			head[u]=newnode;
		}
		else {
			Node curr=head[u];
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=newnode;
		}
	}
	
	
	void display_list() {
		for(int i=1;i<=n;i++) {
			Node curr=head[i];
			System.out.print(i+" ");
			while(curr!=null) {
				System.out.print("->"+curr.data);
				curr=curr.next;
			}
			System.out.println();
		}
	}
	
	
	void bfs(int str) {
		System.out.println("BFS of given graph is:");
		Queue<Integer>q=new LinkedList<Integer>();
		int visited[]=new int[n+1];
		for(int i=0;i<=n;i++) {
			visited[i]=0;
			}
		q.add(str);
		visited[str]=1;
		System.out.println(str+" ");
		while(!q.isEmpty()) {
			int a=q.remove();
			Node curr=head[a];
			while(curr!=null) {
				if(visited[curr.data]!=1) {
					q.add(curr.data);
					visited[curr.data]=1;
					System.out.println(curr.data+" ");
				}
				curr=curr.next;
			}
		}
	}
	
	
	void dfs(int str) {
		System.out.println("DFS of given graph is:");
		Stack<Integer>st=new Stack<Integer>();
		int visited[]=new int[10];
		for(int i=0;i<=n;i++) {
			visited[i]=0;
		}
		visited[str]=1;
		st.push(str);
		System.out.println(str+" ");
		while(!st.isEmpty()) {
			int a=st.pop();
			System.out.println(" "+a);
			for(int i=1;i<=n;i++) {
				if(adjMat[a][i]==1 && visited[i]==0) {
					st.push(i);
					visited[i]=1;
				}
			}
		}
	}
}
