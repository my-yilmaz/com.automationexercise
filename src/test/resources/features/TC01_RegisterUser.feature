@TC01
Feature: TC01 Register User
  @register
  Scenario: TC01 Register User (kayit sayfasi)
    Given kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    And anasayfanin gorunur oldugunu test eder
    Then kullanici signup-login butonuna tiklar
    And kullanici,New User Signup! in gorunur oldugunu test eder
    Given kullanici olarak isim ve maili girer
    Then signup butonuna tiklar
    And acilan sayfada ENTER ACCOUNT INFORMATION yazisinn gorunur oldugunu test eder
    Then kullanici ayrintilari (birinci bolum) doldurur
    Then kullanici Sign up for our newsletter! checkbox ini secer
    Then kullanici Receive special offers from our partners! checkbox ini secer
    Then kullanici ayrintilari (ikinci bolum) doldurur
    Then kullanici Create Account butonuna tiklar
    And kullanici hesabin olustugunu dogrular