import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SimpleAPIClient {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		
		// STEP 1 - Use scanner class to ask for Input (customer id)
		System.out.println("What is your customer id?");
		String id = in.nextLine();
		
		
		// STEP 2 - Use SimpleJson Library to create a Json document
		
		JSONObject map = new JSONObject();
		map.put("cust_id",id);
		System.out.println(map.toString());
		String custID = map.toString();
		// STEP 3 - Invoke the document on the API given below
		HttpResponse<String> res1 = invokeAPI(custID);
		
		// STEP 4 - Print results 
		System.out.println(res1.statusCode());
		System.out.println(res1.body());
		System.out.println(res1.headers().map());
		
//		String json="{\"cust_id\":\"5000\"}";
//		
//		
//		HttpResponse<String> res = invokeAPI(json);
//		
//		
//		System.out.println(res.statusCode());
//		System.out.println(res.body());
//		System.out.println(res.headers().map());
	}

	
	
	
	public static HttpResponse invokeAPI(String json) throws Exception {

		// STEP 1 - Build HTTP Request
		HttpRequest.Builder builder = HttpRequest.newBuilder();
		builder.uri(URI.create("https://e3m1dkivq8.execute-api.us-west-1.amazonaws.com/Production/get-record"));
		
		
		builder.POST(HttpRequest.BodyPublishers.ofString(json));
		
		
		builder.setHeader("x-api-key", "RdOufnPVRh7ns4WzLWk509UFrx9nL9aZ2jFBDMP5");
		
		//builder.header("User-Agent", "iPhone");
		HttpRequest req = builder.build();

		// STEP 2 - Send HTTP Request

		HttpClient client = HttpClient.newHttpClient();

		// Step 3 - Receive HTTP Response

		return client.send(req, BodyHandlers.ofString());

	}

}