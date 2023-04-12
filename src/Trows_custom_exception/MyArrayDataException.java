package example;

public class MyArrayDataException extends Exception{
    public MyArrayDataException  (int i, int j){

        super("Элемент неизвестного типа в ячейке " + i + " " + j);

    }
}
