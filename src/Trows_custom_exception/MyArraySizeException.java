package Trows_custom_exception;

public class MyArraySizeException  extends Exception{
    public MyArraySizeException(){

        super("Недопустимый размер массива");

    }
}
