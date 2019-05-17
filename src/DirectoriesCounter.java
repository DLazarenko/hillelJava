import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;


public class DirectoriesCounter {

    static long fileCounter = 0;
    static long directoryCounter = 0;
    static long size = 0;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(scanner.nextLine());

        if (!Files.isDirectory(path)) {
            System.out.println(path.toAbsolutePath() + " - не папка");
            return;
        }

        Files.walkFileTree(path, new CountFilesAndDirectories());
        System.out.println("Всего папок - " + (directoryCounter - 1));
        System.out.println("Всего файлов - " + fileCounter);
        System.out.println("Общий размер - " + size);
    }

    private static class CountFilesAndDirectories extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
            directoryCounter++;
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            fileCounter++;
            size = size + attrs.size();
            return FileVisitResult.CONTINUE;
        }
    }
}

