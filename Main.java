/**
 *This is something
 *@author some person
 *@version 0.0.1
 */
class Main{
   public  void main(){
      System.out.println("IT WORKS!");
      MyArrayList arrayTEST = new MyArrayList();
      arrayTEST.addEnd(1);
   }
}

class MyArrayList
{
   private int[] list;
   /**
    * This is the constructor for the My array 
    * @param var message
    */
   public MyArrayList()
   {
      
   }
   /**
    * This adds an int to the end of the array.
    * @param x This is an integer you would like to add to an array
    */
   public void addEnd(int x)
   { 
      int[list.length+1] newList;
      if(list.length==0){list[0] = x; System.out.println("YSYA");}
          
      else
      {
         for(int i = 0; i<= list.length; i++)
            newList[i] = list[i];
            
         newList[list.length + 1] = x;  
      }
   }
   public void addMiddle()
   {
      
   }
   public void addBeginning(int x)
   {
      int[] newList;
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