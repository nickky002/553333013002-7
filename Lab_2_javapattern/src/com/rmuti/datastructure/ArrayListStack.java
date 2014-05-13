package com.rmuti.datastructure;

public class ArrayListStack {
	
	private ArrayList lst = new ArrayList();

	public int getSize() {

		return lst.getSize() - 1;
	}

	public void push(Object e) {

		lst.addLast(e);
	}

	public Object pop() {
		Object e = new Object();
		e = lst.getDataLast();
		lst.remove(lst.getSize() - 1);
		return e;
	}

	public Object peek() {

		return lst.getDataLast();
	}

	public void Show_Stack() {
		if (lst.getSize() > 0) {
			System.out.print("Data in Stack : ");
			for (int i = 0; i < lst.getSize() - 2; i++) {
				System.out.print(lst.getData(i) + ",");
			}
			System.out.print(lst.getDataLast());
		}

		if (lst.getSize() == 0) {
			System.out.print("Stack is Empty ");
		}
		System.out.println();

	}

}

