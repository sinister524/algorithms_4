package ru.geekbrains.algorithms4;

public class Main {

    public static void main(String[] args) {
	LinkedList <Animals> cats = new LinkedList<>();
	LinkInterator <Animals> itr = new LinkInterator<>(cats);
	itr.insertAfter(new  Animals("Cisy", 2));
	itr.insertAfter(new Animals("Barsick", 8));
	itr.insertAfter(new Animals("Katti", 15));
	cats.display();

	itr.insertBefore(new Animals("Valera", 5));
	cats.display();

	itr.deleteCurrent();
	cats.display();

	itr.reset();
	itr.deleteCurrent();
	cats.display();
	itr.nextLink();
	itr.deleteCurrent();
	cats.display();


    }
}
