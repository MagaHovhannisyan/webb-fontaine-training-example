package information.networking;

import org.json.JSONArray;
import org.json.JSONObject;

public class json {
    public static void main(String[] args) {
        getJSON();
    }

    private static void createJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "hello");
        jsonObject.put("completed", "false");
        jsonObject.put("views", "111");

        JSONObject nested1 = new JSONObject();
        nested1.put("name", "Smbat");
        nested1.put("age", "22");

        JSONObject nested2 = new JSONObject();
        nested2.put("name", "Arshak");
        nested2.put("age", "33");

        JSONArray array = new JSONArray();
        array.put(nested1);
        array.put(nested2);

        jsonObject.put("members", array);

        System.out.println("jsonObject.toString() = " + jsonObject.toString());
    }

    private static void getJSON(){
        String data = "{\n" +
                "  \"userId\": 1,\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "}";
        JSONObject jsonObject = new JSONObject(data);
        System.out.println("jsonObject.toString() = " + jsonObject.toString());
    }
}