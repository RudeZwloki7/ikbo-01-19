package lab10;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class Exercise4 {
    private static final String path = "src/lab10";

    public static List<File> getDirrectories(File dirrectory) {
     return Exercise1.convert(Objects.requireNonNull(dirrectory.listFiles()));
    }

    public static void main(String[] args) {
        List<File> list = getDirrectories(new File(path));

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
