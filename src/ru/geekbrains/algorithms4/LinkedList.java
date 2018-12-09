package ru.geekbrains.algorithms4;

public class LinkedList <T> {
    private Link <T> first;


    public LinkedList(){
        first = null;

    }

    public Link <T> getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public LinkInterator getIterator(){
        return new LinkInterator(this);
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void display(){
        Link <T> current = first;
        while(current != null){
            System.out.println(current.getValue());
            current = current.getNext();;
        }
        System.out.println("");
    }

}
