package impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import skeleton.Person;
import skeleton.Queue;

public class QueueImpl extends Queue {

	public static int size = 0;

	public QueueImpl() {
			super();
	}

	@Override
	public void add(Person p) {
		Node newNode = new Node(p);
		if (isEmpty()) {
			super.first = super.last = newNode;
		} else {

		super.last.next= newNode;
		super.last = newNode;}

	size++;
	}


	@Override
	public Person retrieve() throws NoSuchElementException {
		Person p;

		if (isEmpty()) {
			System.out.println("Liste ist leer, es kann nichts mehr gelöscht werden");
			return null;
		} else {
			p=super.first.person;
		}

		if (super.first != super.last) {

			super.first = super.first.next;
		} else {
			super.last = super.first = null;}
		size--;
		return p;
		}


	@Override
	public int size() {
		if (super.first==null) {
			return -1;
		}
		else return size;
	}

	@Override
	public void clear() {
		super.first=super.last=null;
		size=0;


		/*
		 * Comment from the Java implementation of clear() from the LinkedList
		 * 
		 * Clearing all of the links between nodes is "unnecessary", but: - helps a
		 * generational GC if the discarded nodes inhabit more than one generation - is
		 * sure to free memory even if there is a reachable Iterator
		 */
	}

	/**
	 * Iterator mostly used for printing in this exercise.
	 * 
	 * @return new Person iterator.
	 */
	public Iterator<Person> iterator() {
		return new Iterator<Person>() {

			Node current = first;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public Person next() {
				if (current == null) {
					throw new NoSuchElementException();
				}

				//get the person from the node
				Person person = current.person;

				// get to the next node
				current = current.next;

				return person;

			}

		};
	}

	// This method is already implemented.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Person> it = iterator();

		while (it.hasNext()) {
			sb.append(it.next());
			sb.append(" -> ");
		}
		return sb.length() > 3 ? sb.substring(0, sb.length() - 3) : "empty list";
	}



}
