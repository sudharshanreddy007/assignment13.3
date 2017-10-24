package bufferandbuilder;

public class BufferAndBuilder {

	
			public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				StringBuffer buffer=new StringBuffer("Sudharshan");
			//created String buffer with variable buffer
				System.out.println("It gives the output has:"+buffer);
				
				//here it prints the buffer value
				System.out.println("The length is:"+buffer.length());
				//here it prints the buffer length which is 10
				System.out.println("Capacity is:"+buffer.capacity());
				//here it prints the buffer capacity which is 26 default and is added to the string capacity
				//then it will be 26
				buffer.append(" is student of Acadgild.");
				//this is used to append the specified string with the string
				System.out.println("It gives the output has:"+buffer);
				System.out.println("The length is:"+buffer.length());//length will become 34
				System.out.println("Capacity is:"+buffer.capacity());
				//capacity will be 54
				buffer.append(" It is an Organization");
				
				System.out.println("Capacity is:"+buffer.capacity()); 
				//capacity will be 110
				System.out.println(buffer);
				System.out.println("The length is:"+buffer.length());
				//length will be 56
				System.out.println("Capacity is:"+buffer.capacity());
						//this is how the append happens uses the capacity of string buffer or string builder		

		//String builder and String buffer have same method but there is one difference between them.
		//String buffer is synchronized that is thread is safe whenever we are working with thread we use String buffer		
			}

		}
