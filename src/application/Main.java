package application;
import java.util.Iterator;

import impl.Employee;
import impl.QueueImpl;
import skeleton.Person;

public class Main {

	public static void main(String[] args) {
		QueueImpl qu = new QueueImpl();
		Employee emp = new Employee("Fritz", "Fischer", "Dep1", "Techniker");
		qu.add(emp);
		qu.add(new Employee("Heinz", "Fischer", "Dep2", "Maler"));
		qu.add(new Employee("Susi", "Maier", "Dep3", "Köchin"));


		System.out.println("Ausdruck durch eigene Methode");
		extracted(qu);

		System.out.println("--------------------------------------------------------------------------");

		System.out.println(" Das erste Element wird gelöscht");
		qu.retrieve();
		System.out.println(qu.toString());

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Alle Elemente werden gelöscht -> Ausdruck mit toString()");
		qu.clear();
		System.out.println(qu.toString());

		System.out.println("------------------------------------------------------------------------");
		System.out.println("Versuch, zu löschen, obwohl Liste schon leer");

		qu.retrieve();

		}

	private static void extracted(QueueImpl qu) {
		Iterator<Person> it = qu.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
