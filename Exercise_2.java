Time Complexity :-
For isEmpty = O(1)
Push = O(1)
Pop = O(1)
Peek = O(1)

Space Complexity :- O(1)




public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data);
        temp.next = null;
        if(root == null)
        {
            root = temp;
        }
        else
        {
            temp.next = root;
            root = temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	    StackNode temp = root;
	    if(root == null)
	    {
	        return 0;
	    }
	    else
	    {
	        int x = temp.data;
	        root = temp.next;
	        return x;
	        
	    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 