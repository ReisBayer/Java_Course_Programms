package Wetter.API;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class WeatherFetcher {

    private static WeatherFetcher instance;

    private WeatherFetcher(){

    }

    public static WeatherFetcher getInstance(){

        if(instance == null){
            instance =  new WeatherFetcher();
        }
        return instance;

    }

    public WeatherInfo[] getWeather(String city) throws Exception {
        String uri = "http://api.openweathermap.org/data/2.5/forecast?q=" + city + "&units=metric&mode=xml&appid=8c8a61404bb5b0aebe5dceae305355a3";

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        Document document = documentBuilder.parse(uri);

        NodeList times = document.getElementsByTagName("time");

        //String message = "";

        WeatherInfo[] weatherInfos = new WeatherInfo[times.getLength()];


        for (int x = 0; x < times.getLength(); x++) {
            Node time = times.item(x);
            NamedNodeMap timeAttributes = time.getAttributes();

            String timestamp = timeAttributes.getNamedItem("from").getNodeValue();

            NodeList children = time.getChildNodes();

            for (int y = 0; y < children.getLength(); y++) {
                Node child = children.item(y);
                if (child.getNodeName().equals("temperature")) {
                    String temperature = child.getAttributes().getNamedItem("value").getNodeValue();
                    String unit = child.getAttributes().getNamedItem("unit").getNodeValue();

                    weatherInfos[x] = new WeatherInfo(timestamp, temperature, unit);
                    //message = message + "Temperatur: " + temperature + " " + unit + "\n";
                }

                /*
                if (child.getNodeName().equals("feels_like")) {
                    feeling = child.getAttributes().getNamedItem("value").getNodeValue();

                    //message = message + "Gefühlte Temperatur: " + feeling + " " + unit2 + "\n" + "\n";
                }

                if (child.getNodeName().equals("symbol")) {
                    weather = child.getAttributes().getNamedItem("name").getNodeValue();

                    //message = message + timestamp + "\n" + "Wetter: " + weather + "\n";

                }
                 */



            }




        }

        return weatherInfos;

    }
}
