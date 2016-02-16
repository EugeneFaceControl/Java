import org.apache.axis.client.Call;

import javax.xml.soap.*;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.transform.TransformerException;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Iterator;


public class StoreMessage {
	static String fileXml;
	static SOAPMessage reqMess, respMess;
	static SOAPElement soapEle;

	public void createSOAPRequest() throws SOAPException, TransformerException {
		MessageFactory factory = MessageFactory.newInstance();
		reqMess = factory.createMessage();
		

		SOAPPart soapPart = reqMess.getSOAPPart();
		SOAPEnvelope envelope = soapPart.getEnvelope();
		SOAPHeader header = envelope.getHeader();
		SOAPBody body = envelope.getBody();
		header.detachNode();

		Name bodyName = envelope.createName("GetFile");
		
		SOAPBodyElement bodyElement = body.addBodyElement(bodyName);
		Name name = envelope.createName("file");
		
		SOAPElement fileName = bodyElement.addChildElement(name);
		fileName.addTextNode(fileXml);
		
	}

	public static void displayMessage(SOAPMessage mess) throws SOAPException {
		SOAPBody body = mess.getSOAPBody();
//		goods.xml
//		for (Iterator it = body.getChildElements();it.hasNext();) {
//			Object a = it.next().toString();
//			SOAPBodyElement bodyElement = (SOAPBodyElement)a;
//			System.out.println(bodyElement);
//		}
		SOAPBodyElement bodyElement;
		Iterator it = body.getChildElements();
		while(it.hasNext()){
			Object o = it.next();
			if(o instanceof SOAPBodyElement){
				bodyElement = (SOAPBodyElement) ((SOAPBodyElement )o).getChildElements();
			}
		}
//		System.out.println(it.next());
//		тут ошибка
//		SOAPBodyElement bodyElement = (SOAPBodyElement) it.next();
//		System.out.println(bodyElement);
//		int childrenCount = 0;
//		for (Iterator it = body.getChildElements();it.hasNext();) {
//		String bodyElemen = it.next().toString();
//			System.out.println(bodyElemen);
//			childrenCount++;
//		
//		}
	}

	public void start() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter the file XML: ");
			fileXml = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//	malformed - плохо сформированный
	public static void main(String[] args) throws SOAPException, MalformedURLException, TransformerException{
		StoreMessage client = new StoreMessage();
		
		client.start();
		client.createSOAPRequest();
		
		SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
		
		SOAPConnection connection = soapConnectionFactory.createConnection();
//		Тут не было services
		URL endpoint = new URL("http://localhost:8080/axis/services/StoreService");
	
		respMess = connection.call(reqMess, endpoint);
		displayMessage(respMess);
	}
}
