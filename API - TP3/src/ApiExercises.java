import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiExercises {

    public static void main(String[] args) {

        System.out.println("1) GET todas entidades");
        request("GET", "https://apichallenges.eviltester.com/sim/entities", null);

        System.out.println("\n2) GET entidade específica (1 a 3 exemplo)");
        for(int i=1;i<=3;i++){
            request("GET", "https://apichallenges.eviltester.com/sim/entities/" + i, null);
        }

        System.out.println("\n3) GET inexistente (ID 13)");
        request("GET", "https://apichallenges.eviltester.com/sim/entities/13", null);

        System.out.println("\n4) GET com parâmetros");
        String urlParams = "https://apichallenges.eviltester.com/sim/entities?categoria=teste&limite=5";
        System.out.println("URL: " + urlParams);
        request("GET", urlParams, null);

        System.out.println("\n5) POST criar entidade");
        String postData = "{\"name\":\"aluno\"}";
        request("POST", "https://apichallenges.eviltester.com/sim/entities", postData);

        System.out.println("\n6) GET entidade criada (ID 11)");
        request("GET", "https://apichallenges.eviltester.com/sim/entities/11", null);

        System.out.println("\n7) POST atualizar entidade 10");
        String updateData = "{\"name\":\"atualizado\"}";
        request("POST", "https://apichallenges.eviltester.com/sim/entities/10", updateData);

        System.out.println("\n8) PUT atualizar entidade 10");
        request("PUT", "https://apichallenges.eviltester.com/sim/entities/10", updateData);

        System.out.println("\n9) DELETE entidade 9");
        request("DELETE", "https://apichallenges.eviltester.com/sim/entities/9", null);

        System.out.println("\nConfirmando DELETE com GET:");
        request("GET", "https://apichallenges.eviltester.com/sim/entities/9", null);

        System.out.println("\n10) DELETE inválido entidade 2");
        request("DELETE", "https://apichallenges.eviltester.com/sim/entities/2", null);

        System.out.println("\n11) OPTIONS verificar métodos");
        request("OPTIONS", "https://apichallenges.eviltester.com/sim/entities", null);

        System.out.println("\n12a) GET simpleapi items");
        request("GET", "https://apichallenges.eviltester.com/simpleapi/items", null);

        System.out.println("\n12b) GET random ISBN");
        request("GET", "https://apichallenges.eviltester.com/simpleapi/randomisbn", null);

        System.out.println("\n12c) POST criar item");
        String item = "{\"type\":\"book\",\"isbn13\":\"9781234567897\",\"price\":5.99,\"numberinstock\":5}";
        request("POST", "https://apichallenges.eviltester.com/simpleapi/items", item);

        System.out.println("\n12d) PUT atualizar item");
        request("PUT", "https://apichallenges.eviltester.com/simpleapi/items", item);

        System.out.println("\n12e) DELETE item");
        request("DELETE", "https://apichallenges.eviltester.com/simpleapi/items/9781234567897", null);
    }

    public static void request(String method, String urlStr, String body) {
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod(method);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            if (body != null) {
                OutputStream os = conn.getOutputStream();
                os.write(body.getBytes());
                os.flush();
                os.close();
            }

            int status = conn.getResponseCode();
            System.out.println("Status: " + status);

            BufferedReader reader;
            if (status >= 200 && status < 400) {
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            String allow = conn.getHeaderField("Allow");
            if (allow != null) {
                System.out.println("Métodos permitidos: " + allow);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
