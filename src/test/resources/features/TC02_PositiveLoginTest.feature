Feature: Feature: TC02 Positive Login Test
  @login
  Scenario: Dogru e-posta ve sifre ile kullanici oturum acma
    Given kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then anasayfanin gorunur oldugunu test eder
    Then kullanici signup-login butonuna tiklar
    Then kullanicinin Login to your account yazisinin gorunur oldugunu test eder
    Then kullanici dogru email ve sifreyi girer
    Then kullanici login butonuna tiklar
    Then kullanici oturum actigini test eder(Logged in as username)