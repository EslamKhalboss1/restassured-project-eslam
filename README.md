# RestAssured API Test – Kullanıcı Bilgisi Doğrulama

Bu proje, [RestAssured] kütüphanesi kullanılarak bir REST API isteğinin test edilmesini amaçlamaktadır.  
Amaç, `https://reqres.in` adresinden bir [GET] isteği göndererek kullanıcının doğru bir şekilde döndüğünü doğrulamaktır.

---

## 👩‍🎓 Öğrenci Bilgileri
İsim: Eslam Khalboss  
Öğrenci No: 030121114  
Ders: Software Testing

---

## 📌 Proje Açıklaması
Bu test senaryosunda RestAssured ve JUnit4 kullanılarak aşağıdaki doğrulamalar yapılmıştır:

- HTTP durum kodu *200* olmalıdır
- `data.id` değeri *1* olmalıdır
- `data.email` alanı *@* karakteri içermelidir
- Yanıt süresi *3000 ms* altında olmalıdır

API testleri için ücretsiz bir test ortamı sunan *ReqRes.in* kullanılmıştır.

---

## 🧰 Gereksinimler (Prerequisites)

Projenin çalışması için gerekli araçlar:

- Java JDK 17
- IntelliJ IDEA
- Maven
- RestAssured kütüphanesi
- JUnit4

---

## ▶️ Test Nasıl Çalıştırılır?

1- Projeyi IntelliJ IDEA ile açın
2- Aşağıdaki dizine gidin:
    src/test/java/GetUserTest.java
3-Dosyaya sağ tıklayın
4-Run 'GetUserTest' seçeneğini seçin 
5-Test sonucu aşağıdaki gibi görüntülenecektir:
✔ 1 Test Passed !
