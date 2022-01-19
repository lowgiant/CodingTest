import java.util.Arrays;

public class ReorderLogFiles {
    public static String[] reorderLogFiles(String[] logs) {
        if (logs == null || logs.length == 0) {
            return logs;
        }
        Arrays.sort(logs, (a, b) -> {
            String[] sa = a.split("\\s+", 2);
            String[] sb = b.split("\\s+", 2);

            boolean isDigitA = Character.isDigit(sa[1].charAt(0));
            boolean isDigitB = Character.isDigit(sb[1].charAt(0));

            if (!isDigitA && !isDigitB) {
                int com = sa[1].compareTo(sb[1]);
                if (com == 0) {
                    return sa[0].compareTo(sb[0]);
                }
                return com;
            } else if (isDigitA && isDigitB) {
                return 0;
            } else if (isDigitA && !isDigitB) {
                return 1;
            } else {
                return -1;
            }
        });
        return logs;
    }

    public static void main(String[] args) {
        String[] logs = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        System.out.println(Arrays.toString(reorderLogFiles(logs)));
    }
}
