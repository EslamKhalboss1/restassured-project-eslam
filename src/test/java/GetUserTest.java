import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserTest {

    @Test
    public void testGetUser() {

        // Temel URL ayarlanıyor
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given().
                // Sunucunun isteği engellememesi için User-Agent ekliyoruz
                        header("User-Agent", "Mozilla/5.0").

                when().
                // /users/1 endpoint'ine GET isteği gönderiliyor
                        get("/users/1").

                then().
                // Sunucudan dönen durum kodu kontrol ediliyor (200 = OK)
                        statusCode(200).

                // Dönen cevaptaki "id" alanının doğru olup olmadığı kontrol ediliyor
                        body("id", equalTo(1)).

                // JSON cevaptaki email alanında '@' karakteri olup olmadığı kontrol ediliyor
                        body("email", containsString("@")).

                // Cevap süresi 3 saniyeden kısa mı kontrol ediliyor
                        time(lessThan(3000L));
    }
}
