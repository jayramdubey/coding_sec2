package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.PriorityQueue;
public class Ideone

{
    public static void main(String args[]) throws IOException
    {
        FileOutputStream out = null;
        try 
        {
            out = new FileOutputStream("test.txt");
            out.write(122);
        }
        catch(IOException io) 
        {
            System.out.println("IO Error.");
        }
        finally 
        {
            out.close();
        }
    }
}

/*{
    public static void gfg(String s)
    {    
        System.out.println("String");
    }
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }
 
    public static void main(String args[])
    {
        gfg(null);
    }
}
*/
/*public class Ideone { 
    public static void main(String[] args) { 
        PriorityQueue toDo = new PriorityQueue(); 
         toDo.add("dishes");          toDo.add("laundry"); 
         toDo.add("bills"); 
        toDo.offer("bills"); 
         System.out.print(toDo.size() + " " + toDo.poll()); 
         System.out.print(" " + toDo.peek() + " " + toDo.poll()); 
         System.out.println(" " + toDo.poll() + " " + toDo.poll()); 
     }
 }*/

/*public  class Ideone {
	
	
	    public static void main(String[] args){
	        int i = 010;
	        int j = 07;
	        System.out.println(i);
	        System.out.println(j);
	    }
	
}*/
/*    class Inner {
            void test() {
                    if (Ideone.this.flag) {
                            sample();
                    }
            }
    }
    private boolean flag = true;
    public void sample() {
            System.out.println("Sample");
    }
    public Ideone() {
            (new Inner()).test();
    }
    public static void main(String args []) {
            new Ideone();
    }
}*/
/*class Base {
    public static void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public static void show() {
       System.out.println("Derived::show() called");
    }
}
  
public class Ideone {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}
*/
/*public class Ideone
{
    static Ideone t ;
    static int count =0;
    public static void main(String[] args) throws InterruptedException
    {
    	Ideone t1 = new Ideone();
        t1 = null; 
        System.gc(); 
        Thread.sleep(1000); 
        t = null; 
        System.gc(); 
        Thread.sleep(1000); 
        System.out.println("finalize method called "+count+" times");
    }
    @Override
    protected void finalize() 
    { 
        count++;
        t = this; 
    }
}
*/




/*class Parent 
{
    public void method() throws IOException //line 4
    {
        System.out.println("Parent");
    }
}
 
public class Ideone extends Parent
{
    public void method() throws Exception //line 11
    {
        System.out.println("Child class");
    }
    public static void main(String[] args) throws IOException //line 15
    {
        Parent obj = new Child(); //line 17
        obj.method();
    }
}*/