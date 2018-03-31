package exam;

public class Substring {
    public static void main(String[] args) {

        String str = "c:/WebServers/hometestsite/www/myfile.txt";
        String replaced = str.replaceAll(".txt", "");
        System.out.println(replaced);

    }

}
