package e02_set;

import java.util.HashSet;
import java.util.Iterator;

public class SetObjectExample {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동",20));
		set.add(new Person("김철수",30));
		set.add(new Person("홍길동",20));
		set.add(new Person("박수형",32));
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}





