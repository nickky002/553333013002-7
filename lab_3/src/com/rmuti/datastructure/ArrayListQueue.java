package com.rmuti.datastructure;

public class ArrayListQueue {

		
		private ArrayList lst = new ArrayList();

		public int getSize() {
			return lst.getSize() - 1;
		}

		public void enQueue(Object e) {
			lst.addLast(e);

		}

		public Object deQueue() {
			Object e = new Object();
			e = lst.getData(0);
			lst.remove(0);
			return e;

		}

		public Object peek() {

			return lst.getData(0);
		}

		public void Show_Queue() {
			if (lst.getSize() > 0) {
				System.out.print("Data in Queue : ");
				for (int i = 0; i < lst.getSize() - 2; i++) {
					System.out.print(lst.getData(i) + ",");
				}
				System.out.print(lst.getData(lst.getSize() - 1));
			}

			if (lst.getSize() == 0) {
				System.out.print("Queue is Empty ");
			}
			System.out.println();

		}

	

	}


