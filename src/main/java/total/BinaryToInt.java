package total;

public class BinaryToInt {
    public static void main(String[] args) {
        int translatable = 156, resultNumber;
        StringBuilder sb = new StringBuilder();
        while (translatable != 0) {
            resultNumber = translatable % 2;
            sb.append(resultNumber);
            translatable = translatable / 2;
        }
        System.out.println(sb);
    }
}
