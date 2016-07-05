package datenstrukturen.queue;

import java.util.Vector;

public class Queue<T> {

		Vector<T> data = new Vector<T>();
		
		public void enqueue(T obj){
			this.data.addElement(obj);
		}
		
		public T dequeue(){
			if(data.size() > 0){
				T obj = this.data.get(0);
				this.data.remove(0);
				return obj;
			}
			return null;
		}
		
		public int size(){
			return this.data.size();
		}

}
