public class XmlToJsonAdapter implements JsonService {

    private XmlSystem xmlSystem;

    public XmlToJsonAdapter(XmlSystem xmlSystem) {
        this.xmlSystem = xmlSystem;
    }

    @Override
    public void sendJson(String json) {
        String xml = convertJsonToXml(json);
        xmlSystem.sendXml(xml);
    }

    @Override
    public String getJson() {
        String xml = xmlSystem.getXml();
        return convertXmlToJson(xml);
    }

    // Giả lập chuyển đổi
    private String convertJsonToXml(String json) {
        return "<data>" + json + "</data>";
    }

    private String convertXmlToJson(String xml) {
        return "{ \"data\": \"" + xml + "\" }";
    }
}
