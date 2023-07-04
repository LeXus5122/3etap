import java.io.File;

public class z21 {
    public static void main(String[] args) {
        printFileExtensions(".");
    }

    public static void printFileExtensions(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    String name = files[i].getName();
                    int dotIndex = name.lastIndexOf('.');
                    if (dotIndex > 0) {
                        String extension = name.substring(dotIndex + 1);
                        System.out.println((i + 1) + " Расширение файла: " + extension);
                    } else {
                        System.out.println((i + 1) + " Расширение файла: ");
                    }
                }
            }
        }
    }
}
