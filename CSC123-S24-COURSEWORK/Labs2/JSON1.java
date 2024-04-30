import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class JSON1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			JSONArray ints = new JSONArray();
			ints.add(30);
			ints.add(31);
			ints.add(34);
			ints.add(28);
			ints.add(49);
			System.out.println(ints);
			
			JSONArray strings = new JSONArray();
			strings.add("One");
			strings.add("Two");
			strings.add("Three");
			strings.add("Four");
			System.out.println(strings);
			
			JSONArray objects = new JSONArray();
			objects.add(31);
			objects.add(32);
			objects.add("Hello World");
			
			JSONArray stringObjs = new JSONArray();
			objects.add(stringObjs);
			stringObjs.add("One");
			stringObjs.add("Two");
			stringObjs.add("Three");
			System.out.println(objects);
			
			JSONObject map=new JSONObject();
			map.put("Name","Name1");
			map.put("Addres","213 Washington Blv");
			map.put("Zip","90532");
			
			System.out.println(map);
			
			JSONObject map2=new JSONObject();
			map2.put("Name","Name1");
			map2.put("Addres","213 Washington Blv");
			map2.put("Zip","90532");
			
			JSONArray friends = new JSONArray();
			friends.add("Friend 1");
			friends.add("Friend 2");
			map2.put("Friends",friends);
			System.out.println(map2);
	}

}
