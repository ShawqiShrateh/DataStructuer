package application;

public interface Listable < T extends Comparable<T>> {
	
	

		public void add(T data);

		public boolean delete(T data);

		public boolean find(T data);

		public void clear();

		public boolean isEmbpty();

		public int size();

		public void shaw();
	}


