public class Main {
    public static void main(String[] args) {
        XmlSystem xmlSystem = new XmlSystem();
        JsonService jsonService = new XmlToJsonAdapter(xmlSystem);

        jsonService.sendJson("{ \"name\": \"Chí Tường\" }");

        String json = jsonService.getJson();
        System.out.println("Client nhận JSON: " + json);
    }
}
