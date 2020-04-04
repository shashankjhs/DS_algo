package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class tiemPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]={2,5,3,6,4,1,4,3,5,4,3,5};
ArrayList<Integer> al=new ArrayList<>();
ArrayList<Integer> al1=new ArrayList<>();
for(int i=0;i<array.length;i++)
{
if(array[i]==3)
	al.add(i);
if(array[i]==4)
	al1.add(i);
}
System.out.println(al);
System.out.println(al1);

Iterator<Integer> it1=al.iterator();
Iterator<Integer> it2=al1.iterator();
while(it1.hasNext() && it2.hasNext())
{
	
	int a=it1.next();
	int b=it2.next();
	int temp =array[a+1];
	array[a+1]=array[b];
	array[b]=temp;
	}

for (int i=0;i<array.length;i++)
{
	System.out.print(array[i]);
	}
	}

}
