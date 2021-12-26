import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    static LocalDateTime s = LocalDateTime.now();
    static StringBuilder sb = new StringBuilder("Созданы файлы:" + "\n");

    public static void main(String[] args) {
        mkdir();
        createFile();
        try (
                OutputStream out = new FileOutputStream("D:\\Games\\tmp\\temp.txt");
                Writer file = new OutputStreamWriter(out);) {
            file.append(sb);
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
            e.printStackTrace();
        }
        System.out.println("Данные успешно записаны в файл");

    }

    private static void mkdir() {
        File src = new File("D:\\Games\\src");
        src.mkdir();
        sb.append(s.format(FORMATTER))
                .append("Имя файла: " + src.getName())
                .append("Родительский каталог: " + src.getParent())
                .append("Размер файла: " + src.length());

        File res = new File("D:\\Games\\res");
        res.mkdir();
        sb.append(s.format(FORMATTER))
                .append("Имя файла: " + res.getName())
                .append("Родительский каталог: " + res.getParent())
                .append("Размер файла: " + res.length());

        File sg = new File("D:\\Games\\savegames");
        sg.mkdir();
        sb.append(s.format(FORMATTER))
                .append("Имя файла: " + sg.getName())
                .append("Родительский каталог: " + sg.getParent())
                .append("Размер файла: " + sg.length());

        File tmp = new File("D:\\Games\\tmp");
        tmp.mkdir();
        sb.append(s.format(FORMATTER))
                .append("Имя файла: " + tmp.getName())
                .append("Родительский каталог: " + tmp.getParent())
                .append("Размер файла: " + tmp.length());

        File main = new File("D:\\Games\\src\\main");
        main.mkdir();
        sb.append(s.format(FORMATTER))
                .append("Имя файла: " + main.getName())
                .append("Родительский каталог: " + main.getParent())
                .append("Размер файла: " + main.length());

        File test = new File("D:\\Games\\src\\test");
        test.mkdir();
        sb.append(s.format(FORMATTER))
                .append("Имя файла: " + test.getName())
                .append("Родительский каталог: " + test.getParent())
                .append("Размер файла: " + test.length());

        File drawables = new File("D:\\Games\\res\\drawables");
        drawables.mkdir();
        sb.append(s.format(FORMATTER))
                .append("Имя файла: " + drawables.getName())
                .append("Родительский каталог: " + drawables.getParent())
                .append("Размер файла: " + drawables.length());

        File vectors = new File("D:\\Games\\res\\vectors");
        vectors.mkdir();
        sb.append(s.format(FORMATTER))
                .append("Имя файла: " + vectors.getName())
                .append("Родительский каталог: " + vectors.getParent())
                .append("Размер файла: " + vectors.length());

        File icons = new File("D:\\Games\\res\\icons");
        icons.mkdir();
        sb.append(s.format(FORMATTER))
                .append("Имя файла: " + icons.getName())
                .append("Родительский каталог: " + icons.getParent())
                .append("Размер файла: " + icons.length());

    }

    private static void createFile() {
        File Main = new File("D:\\Games\\src\\main\\Main.java");
        try {
            Main.createNewFile();
            sb.append(s.format(FORMATTER))
                    .append("Имя файла: " + Main.getName())
                    .append("Родительский каталог: " + Main.getParent())
                    .append("Размер файла: " + Main.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
        File Utils = new File("D:\\Games\\src\\main\\Utils.java");
        try {
            Utils.createNewFile();
            sb.append(s.format(FORMATTER))
                    .append("Имя файла: " + Utils.getName())
                    .append("Родительский каталог: " + Utils.getParent())
                    .append("Размер файла: " + Utils.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
        File temp = new File("D:\\Games\\tmp\\temp.txt");
        try {
            temp.createNewFile();
            sb.append(s.format(FORMATTER))
                    .append("Имя файла: " + temp.getName())
                    .append("Родительский каталог: " + temp.getParent())
                    .append("Размер файла: " + temp.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

