package com.rmuti.datastructure;

public class ShowArray {
	
	public static void main(String[] args) {

		/****************************** Show Arraylish ******************************/
				ArrayList lst = new ArrayList();
				System.out.println("<<<<< Show Arraylish >>>>>");
				lst.add("A");
				lst.add("B");
				lst.add("C");
				System.out.println(lst);
				System.out.println("");


		/****************************** Show Stack ******************************/
				ArrayListStack stk = new ArrayListStack();
				System.out.println("<<<<< Show Stack >>>>>");
				stk.push("A");
				stk.push("B");
				stk.push("C");
				stk.push("D");
				stk.push("E");
				stk.Show_Stack();
				System.out.println("pop = " + stk.pop());
				stk.Show_Stack();
				System.out.println("");

		/****************************** Show Queue ******************************/
				ArrayListQueue q = new ArrayListQueue();
				System.out.println("<<<<< Show Queue >>>>>");
				q.enQueue("A");
				q.enQueue("B");
				q.enQueue("C");
				q.enQueue("D");
				q.enQueue("F");
				q.enQueue("G");
				q.Show_Queue();
				System.out.println("De Queue = " + q.deQueue());
				q.Show_Queue();
				System.out.println("De Queue = " + q.deQueue());
				q.Show_Queue();
				System.out.println("De Queue = " + q.deQueue());
				q.Show_Queue();
				System.out.println("First Data = " + q.peek());
				System.out.println("Data in Queue = " + q.getSize());



			}

		}


