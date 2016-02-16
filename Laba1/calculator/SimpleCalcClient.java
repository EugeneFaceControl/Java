package calculator;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.utils.Options;
import javax.xml.rpc.ParameterMode;
public class SimpleCalcClient {
	public static void main(String[] args) throws Exception{
		String endpoint = "http://localhost:8080/axis/SimpleCalculator.jws";
		
		if(args == null|| args.length!=3){
			System.err.println("Usage: SimpleCalcClient <add|subtract> a b");
			return;
		}
		String method = args[0];
		if(!(method.equals("add")||method.equals(("subtract")))){
			System.err.println("Usage: SimpleCalcClient <add|subtract> a b");
			return;
		}
		Integer a = new Integer(args[1]);
		Integer b = new Integer(args[2]);
		
		Service service = new Service();
		Call call = (Call)service.createCall();
		call.setTargetEndpointAddress(new java.net.URL(endpoint));
		call.setOperationName(method);
		call.addParameter("op1", XMLType.XSD_INT, ParameterMode.IN);
		call.addParameter("op2", XMLType.XSD_INT, ParameterMode.IN);
		call.setReturnType(XMLType.XSD_INT);
//		invoke - вызывать
		Integer ret = (Integer)call.invoke(new Object[]{a, b});
		System.out.println("Got result: "+ ret);
	}
}
