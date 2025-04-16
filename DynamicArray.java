class Array
{
  private int arr[];
  private int count;
  Array (int size)
  {
    arr=new int[size];
	count=0;
	}
	public void insert (int element)
	{
	   if(arr.length==count)
	   {  
          int newArr[]=new int [count*2];
		  for(int i=0;i<count; i++)
		  {
			  newArr [i]=arr[i];
		  }
		  arr=newArr;
	   }
	   arr[count++]=element;
	}
	public void display()
	{
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
class DynamicArray
{ 
  public static void main(String []str)
  {
  Array a=new Array(3);
  a.insert(10);
  a.insert(20);
  a.insert(30);
  a.insert(40);
  a.display();
  }
  
}