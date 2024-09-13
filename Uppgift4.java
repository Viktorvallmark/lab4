public class Uppgift4 {
  public static void main(String[] args) {

    int[] row = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] column = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    System.out.printf("%s ", "  ");
    for (int indexi = 0; indexi < row.length; indexi++) {
      System.out.printf("%d ", row[indexi]);
    }
    System.out.printf("%n");

    for (int i = 0; i < row.length; i++) {
      System.out.printf("%d ", row[i]);
      for (int j = 0; j < column.length; j++) {
        System.out.printf(" %d", row[i] * column[j]);
      }
      System.out.printf("%n");
    }
  }
}
