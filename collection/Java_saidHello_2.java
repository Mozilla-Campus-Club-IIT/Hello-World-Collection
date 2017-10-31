import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class helloWord {

public static void main(String[] args) {
DocumentBuilderFactory
factory=DocumentBuilderFactory.newInstance();
try {
DocumentBuilder builder=factory.newDocumentBuilder();
Document document=builder.parse("hwxml.xml");
NodeList titlelist=document.getElementsByTagName("title");
for(int i=0;i<titlelist.getLength();i++){
Node t=titlelist.item(i);
if(t.getNodeType()==Node.ELEMENT_NODE){
Element title=(Element)t;
NodeList namelist=title.getChildNodes();
for(int x=0;x<namelist.getLength();x++){
Node n=namelist.item(x);
Node name =(Node) n;
System.out.println(name.getTextContent());
}
}
}
} catch (ParserConfigurationException e) {

e.printStackTrace();
} catch (SAXException e) {

e.printStackTrace();
} catch (IOException e) {

e.printStackTrace();
}
}
}
<?xml version="1.0"?>
-<title>
<name>Hello World</name>
</title>
