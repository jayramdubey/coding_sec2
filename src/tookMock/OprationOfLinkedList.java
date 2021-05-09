package tookMock;

public class OprationOfLinkedList {

	public static void main(String[] args) {
       LinkedListOpration obj=new LinkedListOpration();
       obj.insertElement(5);
       obj.insertElement(10);
       obj.insertElement(15);
       obj.addAtFirstPosition(25);
       obj.addPossition(2, 50);
       System.out.println("before the reverse: ");
       obj.show();
/*       obj.dltFrst();
       obj.dltLast();
       obj.dltposs(2);*/
       System.out.println("After the reverse: ");
       obj.rvrsll();
       obj.show();
	}
}
