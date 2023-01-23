package czescB;

import java.util.ArrayList;

public class ArrayListStack {

    private ArrayList<Integer> intStack;

    public ArrayListStack()    // konstruktor
    {
        intStack = new ArrayList<Integer>();
    }

    public void push(int elem)    // odkłada element na szczyt stosu
    {
        intStack.add(elem);
        //intStack.add(0, elem); // lewa strona
    }

    public int pop() // pobiera element ze szczytu stosu
    {
        //int topElem = intStack.get(intStack.size()-1); //Pobiera ostatni element tablicy dynamicznej
        //intStack.remove(intStack.size()-1); //usuwa ostatni element
        //return topElem; //Zwraca ostatni element

        return intStack.remove(intStack.size()-1); // to samo ale w jednej lini
        // return intStack.remove(0); //tu tez na lewa mozna
    }

    public int peek()  // podgląda wartość na szczycie stosu
    {
        return intStack.get(intStack.size()-1);//Zwraca ostatni element
        //return intStack.get(0); //lewa strona
    }

    public boolean isEmpty()    // zwraca true, jeżeli stos pusty
    {
        return intStack.isEmpty();
    }

    public static void main(String[] args)
    {
        ArrayListStack theStack = new ArrayListStack();  // tworzymy nowy stos o rozmiarze 10 (z relokacja)
        theStack.push(20);     // odkładamy elementy na stosie
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(81);

        while (!theStack.isEmpty())     // dopóki stos nie jest pusty...
        {                             // ...pobieramy z niego elementy
            int value = theStack.pop();
            System.out.println(value+" ");      // wypisanie elementu
        }
        System.out.println("");
    }
}
