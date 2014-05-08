package array;

import com.rmuti.datastructure.ArrayList;




public class ArrayListPQ {
	
	
private int Maxindex = 0;
	ArrayList arl = new ArrayList();
	
public void enqueue(Object obj){
	arl.add(obj);
	}

public Object dequeue(){
	Object a=arl.get(maxIndex());
	arl.remove(maxIndex());
	return a;
	}

public int maxIndex(){
	int max = 0;
    for (int i = 0; i < arl.from ; i++) {
              Comparable d = (Comparable) arl.get(i);
              Object maxObj = arl.get(max);
              if (d.compareTo(maxObj) > 0) {
                         max = i;
              }
    }
    return max;

	}
	@Override
	public String toString() {
	
	return String.valueOf(arl);
	}
	

public static void main(String[] args) {	
		// TODO Auto-generated method stub
			ArrayListPQ arlq = new ArrayListPQ();
			arlq.enqueue(5);
			arlq.enqueue(13);
			arlq.enqueue(9);
			arlq.enqueue(8);
			arlq.enqueue(32);
			arlq.enqueue(34);
			System.out.println(arlq.dequeue());
			System.out.println(arlq);
			
			}
	

	}


