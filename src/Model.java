import java.io.*;
import java.util.Properties;

public class Model implements WorkWithProperties, WorkWithHTML {


    private String DOB;
    private String email;
    private String skype;
    private String target;
    private String FIO;
    private String phone;
    private String avatar2;
    private String study;


    public static final String PATH_TO_PROPERTIES = "java.properties";

    private FileInputStream fileInputStream;
    private Properties prop;

    public Model() {

        prop = new Properties();
        propWork();
        DOB = prop.getProperty("DOB");
        email = prop.getProperty("email");
        skype = prop.getProperty("skype");
        target = prop.getProperty("target");
        FIO = prop.getProperty("FIO");
        phone = prop.getProperty("phone");
        avatar2 = prop.getProperty("avatar2");
        study = prop.getProperty("study");


    }


    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar2() {
        return avatar2;
    }

    public void setAvatar2(String avatar2) {
        this.avatar2 = avatar2;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    @Override
    public void propWork() {
        try {

            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);

            prop.load(new InputStreamReader(fileInputStream, "UTF-8"));


        } catch (IOException e) {
            System.out.println("Ошибка в файле " + PATH_TO_PROPERTIES);
            e.printStackTrace();
        }


    }

    @Override
    public void htmlWork() throws FileNotFoundException, UnsupportedEncodingException {
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
                "   <img alt=\"Мой котик  \"class=\"rightpic\"  src=\"" + avatar2 + "\"></p><br>" +
                "  </div>\n" +
                "<div class = \"layer1\">\n" +
                " <br><h3><b>Цель: </b></h3>" + target +
                " <br><h3><b>Образование: </b></h3>" + study +
                "</div>" +
                " </body>"
        );

        writer.close();
    }
}
