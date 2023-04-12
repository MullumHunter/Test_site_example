package Trows_custom_exception;


class MainL {
    public static void main(String[] args) {

        String[][] num = new String[4][4];
        num[0][0] = "1";
        num[0][1] = "1";
        num[0][2] = "1";
        num[0][3] = "1";
        num[1][0] = "1";
        num[1][1] = "1";
        num[1][2] = "1";
        num[1][3] = "I";
        num[2][0] = "1";
        num[2][1] = "1";
        num[2][2] = "1";
        num[2][3] = "1";
        num[3][0] = "1";
        num[3][1] = "1";
        num[3][2] = "1";
        num[3][3] = "1";

        try {
            int sum = sumArray(num);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumArray(String[][] num) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (num.length != 4 || num[0].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {

                    sum += Integer.parseInt(num[i][j]);

                } catch (NumberFormatException e) {

                    throw new MyArrayDataException(i, j);

                }
            }
        }
        return sum;
    }
}
