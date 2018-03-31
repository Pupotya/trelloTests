package exam;

public class Substring2 {
    public static void main(String[] args) {
        String str = "Это ##тестовый пример## для задачи ##на## строки";
        String replaced = str.replace("##", "<");
        String x = replaced.replace("ер<", "ер>");
        String answer = x.replace("на<", "на>");

        System.out.println(answer);
    }


}
