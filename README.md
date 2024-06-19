# Web-API-Automation

Final Project ini dibuat dengan spesifikasi berikut:
1. Java 11
2. Selenium Java v4.11
3. WebDriver v5.7
4. Cucumber v7.15
5. Jupiter v
6. Rest Assured v5.4
7. Json v20240303
8. Json Schema  v5.4
9. AssertJ v3.25.3
10. Chrome v125.xx
11. Gradle 8.0
12. IntelliJ IDEA

Pembuatan project ini bertujuan untuk pengujian Web secara api untuk web https://www.demoblaze.com/ dan API pada web https://gorest.co.in/.
Tahap-tahap yang dilakukan untuk membuat project sebagai berikut:
1. set depedencies Selenium, WebDriverManager, Cucumber, Junit dll yang akan di simpan pada file build.gradle
   ![image](https://github.com/romirosmawati/Web-API-Automation/assets/32626103/f4506b2f-c2fa-4997-a368-19d346405817)
2. tambahkan konfigurasi berikut pada file uild.gradle
   
   ![image](https://github.com/romirosmawati/Web-API-Automation/assets/32626103/d0723990-e956-492e-967d-a20d0493f612)
4. membuat Gherkin format untuk pengujian web API dan mengujian web demo.
3. dilanjutkan membuat class Step Definition dan class untuk menyimpan method
4. buat class CucumberTest dan tambahkan option plugin pretty untuk membuat report menjadi lebih readable
   ![image](https://github.com/romirosmawati/Web-API-Automation/assets/32626103/f9dccd61-ebd8-45a5-a9fa-0c1f7c8b5925)
5. push repository pada Github dan buat Github Action pada repository tersebut

