package buildWithDirector;


public class Main {
    public static void main(String[] args) {
        HttpRequest normalRequest = new HttpRequest.HttpRequestBuilder()
                .withUrl("https://api.example.com")
                .withMethod("POST")
                .withHeader("Content-Type", "application/json")
                .withHeader("Accept", "application/json")
                .withQueryParams("key", "12345")
                .withBody("{\"name\": \"Aditya\"}")
                .withTimeout(60)
                .build();

        normalRequest.execute();

        HttpRequest getRequest = HttpRequestDirector.createGetRequest("https://api.example.com/users");
        getRequest.execute();

        System.out.println("\n----------------------------\n");

        HttpRequest postRequest = HttpRequestDirector.createPostRequest(
                "https://api.example.com/users",
                "{\"name\": \"Aditya\", \"email\": \"aditya@example.com\"}");
        postRequest.execute();
    }
}
