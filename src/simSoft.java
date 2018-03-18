

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.Object;
import java.io.FileOutputStream;
import java.util.SortedMap;
import java.net.*;


public class simSoft {

    public static final String PATH_TO_PROPERTIES = "java.properties";
    //  public static final String PATH_TO_HTML = "index.html";


    public static void main(String[] args) throws IOException {


        FileInputStream fileInputStream;
        Properties prop = new Properties();

        try {


            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);

            prop.load(new InputStreamReader(fileInputStream, "UTF-8"));

            String DOB = prop.getProperty("DOB");
            String email = prop.getProperty("email");
            String skype = prop.getProperty("skype");
            String target = prop.getProperty("target");
            //   String avatar = prop.getProperty("avatar");
            String FIO = prop.getProperty("FIO");
            String phone = prop.getProperty("phone");
            String avatar2 = prop.getProperty("avatar2");
            String study = prop.getProperty("study");

            PrintWriter writer = new PrintWriter("index.html", "UTF-8");


            writer.println(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">" +
                    "<style>" +
                    " .layer1 {\n" +
                    "    float: left; /* Обтекание по правому краю */\n" +
                    "    padding: 10px; /* Поля вокруг текста */\n" +
                    "    margin-right: 20px; /* Отступ справа */\n" +
                    "    width: 40%; /* Ширина блока */\n" +
                    "   }" +
                    "</style>" +
                    " <body> \n" +
                    "<center><b><h4>Резюме</h4></b><br> На должность: java - стажер <br></center>" +

                    "  <div class=\"layer1\">\n" +
                    " <b>ФИО: </b>" + FIO +
                    "<b><br>Дата рождения: </b>" + DOB +
                    "<b><br>e-mail: </b>" + email +
                    "<b><br>Телефон: </b>" + phone +
                    "<b><br>Skybe: </b>" + skype +
                    "\n" +
                    "  </div>\n" +

                    "  <div>\n" +
                    "   <img class=\"rightpic\"  src=\"" + avatar2 + "\"></p><br>" +
                    "  </div>\n" +
                    "<div class = \"layer1\">\n" +
                    " <br><h3><b>Цель: </b></h3>" + target +
                    " <br><h3><b>Образование: </b></h3>" + study +
                    "</div>" +


                    " </body>"
            );

            writer.close();

        } catch (IOException e) {
            System.out.println("Ошибка в файле " + PATH_TO_PROPERTIES);
            e.printStackTrace();
        }
    }

}
