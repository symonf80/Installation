import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    static LocalDateTime s = LocalDateTime.now();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        mkdir();
        createFile();
        writeLog();

    }

    private static void mkdir() {
        List<File> folderList = Arrays.asList(
                new File("D:\\Games\\src"),
                new File("D:\\Games\\res"),
                new File("D:\\Games\\savegames"),
                new File("D:\\Games\\tmp"),
                new File("D:\\Games\\src\\main"),
                new File("D:\\Games\\src\\test"),
                new File("D:\\Games\\res\\drawables"),
                new File("D:\\Games\\res\\vectors"),
                new File("D:\\Games\\res\\icons")
        );
        folderList.forEach(folder -> {
            if (folder.mkdir()) sb.append(s.format(FORMATTER))
                    .append("Каталог " + folder + " создан\r\n");
            else sb.append("Каталог " + folder + " не создан\r\n");
        });
    }

    private static void createFile() {
        List<File> fileList = Arrays.asList(
                new File("D:\\Games\\src\\main\\Main.java"),
                new File("D:\\Games\\src\\main\\Utils.java"),
                new File("D:\\Games\\tmp\\temp.txt")
        );
        fileList.forEach(file -> {
            try {
                if (file.createNewFile()) sb.append(s.format(FORMATTER)).append("Файл " + file + " создан\r\n");
                else sb.append("Файл " + file + " не создан\r\n");
            } catch (IOException ex) {
                sb.append(ex.getMessage() + '\n');
            }
        });
    }
    private static void writeLog(){
        try(FileWriter log=new FileWriter("D:\\Games\\tmp\\temp.txt",false)){
            log.write(sb.toString());
            log.flush();
        }catch (IOException ex){
            sb.append(ex.getMessage())
                    .append('\n');
        }
        try (BufferedReader br=new BufferedReader(new FileReader("D:\\Games\\tmp\\temp.txt"))){
            String s;
            while ((s=br.readLine()) !=null)System.out.println(s);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

