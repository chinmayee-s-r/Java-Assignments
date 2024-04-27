package assignment7;

public class Node {
	
	Node left, right;
    String word, meaning;

    // empty constructor
    Node(String word){     
        this(word, "");
    }
    
    // constructor of class node
    Node(String word, String meaning){
        left = right = null;
        this.word = word;
        this.meaning = meaning;
    }
}
