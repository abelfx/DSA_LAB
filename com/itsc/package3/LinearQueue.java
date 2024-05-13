package com.itsc.package3;



public class LinearQueue {
	
	Stack stackA;
	Stack stackB;
	int size;
	
	
	LinearQueue(int maxsize){
		stackA = new Stack(maxsize);
		stackB = new Stack(maxsize);
		size = 0;
	}
	

	public void enqueue(int number) {
		stackA.push(number);
		size++;
	}
	
	public void stackchanger() {
		if(stackB.isempty()) {
			while(!stackA.isempty()) 
				stackB.push(stackA.pop());
			
		}
	}

	public int dequeue() {
		if(stackB.isempty()) {
			throw new IllegalStateException ("Queue is empty!");
		}
		else {
		   stackchanger();
		   size--;
		   return stackB.pop();
		
		}
	}
	
	public  int peek() {
	    stackchanger();
	    if (!stackB.isempty()) {
	        return stackB.peek(); 
	    } else {
	        return stackA.peek(); 
	    }
	}
	
	public int size() {
		return size;
	}
	
	
	public static void main(String[] args) {
		    LinearQueue queue = new LinearQueue(5);

		    // Enqueue several elements to the queue
		    queue.enqueue(11);
		    queue.enqueue(22);
		    queue.enqueue(33);
		    queue.enqueue(44);
		    queue.enqueue(55);
		    
		    System.out.println("Front element before dequeue: " + queue.peek());

		    System.out.println("First removed element: " + queue.dequeue());
		    System.out.println("Second removed element: " + queue.dequeue());
		    
		    System.out.println("Front element after dequeue: " + queue.peek());
		    
		    
		    int size = queue.size();
		    System.out.print("The remaining elements in the queue are: ");
		    for(int i = 0; i< size; i++) {
		    	System.out.print(queue.dequeue() + " ");
		    }

	
	}
}




