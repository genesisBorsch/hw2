class Main {
	public static void main(String[] args) {
		
	}
}


class MyArrayList
{
   private int[] list;

   public MyArrayList()
   {
      
   }

   public void addEnd(int x)
   {
		//make a new array 1 larger than the previous array
      int[] newList = new int[list.length + 1];
		
		//if the length is 0 that means there is nothing in the array
      if(list.length==0){
			//Put the arg in the first position
			list[0] = x;
		}
      //There is something in the array
      else
      {	
			//Coppy the old array to the new array
         for(int i = 0; i<= list.length; i++){
            newList[i] = list[i];
			}
			//add the arg to the end of the list
         newList[list.length + 1] = x;  
      }
   }
	
	
   public void addMiddle(int x)
   {
		//make a new array 1 larger than the previous array
		int[] newList = new int[list.length + 1];
   }
   public void addBeginning(int x)
   {
      int[] newList = new int[list.length + 1];
      if(list.length == 0)
         list[0] = x;
      else
      {
         for(int i = 0; i<= list.length; i++)
            newList[i] = list[i];
         
         newList[list.length + 1] = x;  
      }   
   }
   public void print()
   {
      
   }
   public void remove(int index)
   {
      
   }
   public void size()
   {
      
   }
   public void doubleItems()
   {
      
   }
   public void convertToArray()
   {
   
   }
}