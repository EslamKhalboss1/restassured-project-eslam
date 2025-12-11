import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUserTest {

    @Test
    public void testCreateUser() {

        // Temel URL'i ayarlıyoruz
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // POST isteği için JSON formatında gövde (request body)
        String requestBody = """
                {
                    "name": "Eslam Khalboss",
                    "studentNumber": "030121114",
                    "email": "eslam@example.com"
                }
                """;

        given().
                // İstek gövdesinin JSON olduğunu belirtiyoruz
                        header("Content-Type", "application/json").
                // Sunucunun isteği engellememesi için User-Agent ekliyoruz
                        header("User-Agent", "Mozilla/5.0").
                // Gövdeyi POST isteğine gönderiyoruz
                        body(requestBody).

                when().
                // POST isteğini /users endpoint'ine gönderiyoruz
                        post("/users").

                then().
                // Sunucudan dönen HTTP durum kodunu kontrol ediyoruz (201 = Created)
                        statusCode(201).
                // Dönen cevaptaki "name" alanının doğru olduğunu kontrol ediyoruz
                        body("name", equalTo("Eslam Khalboss")).
                // Öğrenci numarasının doğru gönderildiğini kontrol ediyoruz
                        body("studentNumber", equalTo("030121114")).
                // E-posta kontrolü
                        body("email", equalTo("eslam@example.com")).
                // Cevap süresinin 3 saniyeden kısa olup olmadığını kontrol ediyoruz
                        time(lessThan(3000L));
    }
}
