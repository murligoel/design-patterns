interface Data {
    String getJsonData(String rawData);
}

class XDP {

    public String generateXMLData(String rawData) {
        int idx = rawData.indexOf(':');
        String name = rawData.substring(0, idx);
        String id = rawData.substring(idx + 1);
        return "<User>" +
                "<Name>" + name + "</Name>" +
                "<Id>" +   id + "</Id>" +
                "</User>";
    }
}

class XDPAdapter implements Data {

    private XDP xdp;

    public XDPAdapter(XDP xdp) {
        this.xdp = xdp;
    }

    @Override
    public String getJsonData(String rawData) {
        String xmlData = xdp.generateXMLData(rawData);
        return "Processed Json Data" + xmlData;
    }
}

class client {
    public void genera(Data data, String rawData) {
        System.out.println(data.getJsonData(rawData));
    }
}
public class Ap {

    public static void main(String[] args) {
        Data data = new XDPAdapter(new XDP());
        client c = new client();
        c.genera(data, "Alice:10");
    }
}
