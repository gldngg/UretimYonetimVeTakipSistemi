Mevcut README’yi koruyup **yeni `AnaMenuEkrani` kalıtım değişikliğine göre güncelledim**. Özellikle `ui`, `Inheritance`, `Admin Menü`, `Operatör Menü` ve ortak ekran yapısı kısımlarını düzelttim. Mevcut README içeriğini baz aldım. 

Aşağıdakini direkt **README.md** içine kopyalayabilirsin:

````markdown
# Üretim Yönetim ve Takip Sistemi

Bu proje, üretim süreçlerinde makine, sipariş, planlama, duruş/kayıp ve raporlama işlemlerini takip etmek amacıyla geliştirilmiş bir masaüstü uygulamasıdır.

Proje Java programlama dili ile geliştirilmiştir. Kullanıcı arayüzü için Java Swing, veritabanı işlemleri için SQLite ve JDBC kullanılmıştır.

## Kullanılan Teknolojiler

- Java
- Java Swing
- SQLite
- JDBC
- Eclipse IDE

## Projenin Temel Özellikleri

- Kullanıcı kayıt ve giriş işlemleri yapılabilir.
- Admin ve operatör rolleri ayrılabilir.
- Admin ve operatör için ayrı ana menü ekranları bulunur.
- Admin ve operatör menüleri ortak `AnaMenuEkrani` sınıfından kalıtım alır.
- Ana menü ekranlarında ikonlu butonlar ile ilgili modüllere geçiş yapılabilir.
- Makine bilgileri eklenebilir, güncellenebilir ve silinebilir.
- Sipariş bilgileri eklenebilir, güncellenebilir ve silinebilir.
- Siparişlere iş emri eklenebilir.
- Planlama ekranında iş emirleri takvim üzerinde görüntülenebilir.
- Admin, iş emirlerinin plan tarihini ve durumunu güncelleyebilir.
- Admin, planlama ekranından iş emri silebilir.
- Operatör, planlama ekranını yalnızca görüntüleme amacıyla kullanabilir.
- Duruş/kayıp kayıtları oluşturulabilir.
- Duruş/kayıp ekranında başlangıç ve bitiş saatine göre süre otomatik hesaplanır.
- Raporlama ekranında sistem özeti, duruş analizi ve duruş/kayıp kayıtları görüntülenebilir.

## Proje Yapısı

```text
UretimYonetimTakipSistemi
├── src
│   ├── database
│   ├── interfaces
│   ├── model
│   ├── service
│   └── ui
├── lib
│   └── sqlite-jdbc-3.53.0.0.jar
├── .classpath
├── .project
└── README.md
````

## Paket Açıklamaları

### database

Veritabanı bağlantısı ve oturum bilgileri bu pakette yer alır.

Bu paketteki temel sınıflar:

* `Veritabani.java`
* `Session.java`

`Veritabani.java`, SQLite bağlantısını kurar ve gerekli tabloları oluşturur.

`Session.java`, giriş yapan aktif kullanıcının kullanıcı adı ve rol bilgisini tutar. Bu bilgiler, kullanıcının hangi ekrana ve hangi yetkilere sahip olacağını belirlemek için kullanılır.

### model

Projede kullanılan temel veri sınıfları bu pakette yer alır.

Örnek model sınıfları:

* `Kullanici.java`
* `Admin.java`
* `Operator.java`
* `Makine.java`
* `Siparis.java`
* `Planlama.java`
* `DurusKayip.java`

Bu sınıflar sistemde kullanılan temel nesneleri temsil eder.

### service

Veritabanı işlemlerinin yapıldığı sınıflar bu pakette yer alır.

Örnek service sınıfları:

* `KullaniciService.java`
* `MakineService.java`
* `SiparisService.java`
* `PlanlamaService.java`
* `DurusKayipService.java`
* `RaporService.java`

Bu sınıflarda JDBC kullanılarak ekleme, silme, güncelleme ve listeleme işlemleri yapılır.

### interfaces

Service sınıflarının uyguladığı interface yapıları bu pakette yer alır.

Örnek interface sınıfları:

* `IKullaniciIslemleri.java`
* `IMakineIslemleri.java`
* `ISiparisIslemleri.java`
* `IPlanlamaIslemleri.java`
* `IDurusKayipIslemleri.java`
* `IRaporIslemleri.java`

Interface kullanımı sayesinde service sınıflarında yapılacak işlemler soyut olarak tanımlanmış ve ilgili sınıflarda uygulanmıştır.

### ui

Kullanıcı arayüzü ekranları bu pakette yer alır.

Örnek arayüz sınıfları:

* `GirisEkrani.java`
* `KayitEkrani.java`
* `AnaMenuEkrani.java`
* `AdminMenuEkrani.java`
* `OperatorMenuEkrani.java`
* `OrtakEkran.java`
* `MakineGirisEkrani.java`
* `SiparisEkrani.java`
* `PlanlamaEkrani.java`
* `DurusKayipEkrani.java`
* `RaporEkrani.java`

`AnaMenuEkrani.java`, admin ve operatör ana menülerinde kullanılan ortak menü yapısını içerir. Bu sınıfta pencere ayarları, başlık alanı, çıkış butonu, ikon oluşturma, menü elemanı ekleme ve ekranlar arası geçiş işlemleri ortak olarak tanımlanmıştır.

`AdminMenuEkrani.java` ve `OperatorMenuEkrani.java`, `AnaMenuEkrani` sınıfından kalıtım alır. Bu iki sınıf yalnızca kendi rollerine uygun menü elemanlarını ekler.

`OrtakEkran.java`, makine, sipariş, planlama, duruş/kayıp ve rapor gibi işlem ekranlarında kullanılan ortak üst menü ve pencere yapısını içerir.

## Kullanıcı Rolleri

Projede iki kullanıcı rolü bulunmaktadır: Admin ve Operatör.

### Admin

Admin kullanıcısı sistemde daha geniş yetkilere sahiptir.

Admin kullanıcısı:

* Makine girişi yapabilir.
* Sipariş girişi yapabilir.
* Sipariş silebilir.
* Planlama ekranında güncelleme yapabilir.
* Planlama ekranında iş emri ekleyebilir/silebilir.
* Raporlama ekranını görüntüleyebilir.

Admin giriş yaptığında `AdminMenuEkrani` açılır. Bu ekran `AnaMenuEkrani` sınıfından kalıtım alır ve admin kullanıcısına uygun menü elemanlarını gösterir.

Admin ana menüsünde bulunan temel ekranlar:

* Raporlar
* Makine Girişi
* Planlama
* Sipariş Girişi

### Operatör

Operatör kullanıcısı daha sınırlı yetkilere sahiptir.

Operatör kullanıcısı:

* Makine ekranını kullanabilir.
* Duruş/kayıp kaydı oluşturabilir.
* Planlama ekranını yalnızca görüntüleyebilir.
* Raporlama ekranını görüntüleyebilir.
* Sipariş girişi yapamaz.
* Planlama ekranında güncelleme veya silme işlemi yapamaz.

Operatör giriş yaptığında `OperatorMenuEkrani` açılır. Bu ekran `AnaMenuEkrani` sınıfından kalıtım alır ve operatör kullanıcısına uygun menü elemanlarını gösterir.

Operatör ana menüsünde bulunan temel ekranlar:

* Raporlar
* Makine Girişi
* Planlama
* Duruş/Kayıp

## OOP Kullanımı

Projede nesne yönelimli programlama yapıları kullanılmıştır.

### Encapsulation

Model sınıflarında değişkenler `private` olarak tanımlanmıştır. Bu değişkenlere erişim getter metotları ile sağlanmıştır.

Bu yapı sayesinde sınıfların içindeki veriler dışarıdan doğrudan değiştirilemez. Böylece veri güvenliği ve kod düzeni sağlanır.

### Inheritance

Projede kalıtım yapısı kullanılmıştır.

Kullanıcı rolleri için:

```java
public class Admin extends Kullanici
```

```java
public class Operator extends Kullanici
```

Menü ekranları için:

```java
public class AnaMenuEkrani extends JFrame
```

```java
public class AdminMenuEkrani extends AnaMenuEkrani
```

```java
public class OperatorMenuEkrani extends AnaMenuEkrani
```

İşlem ekranları için:

```java
public class OrtakEkran extends JFrame
```

```java
public class SiparisEkrani extends OrtakEkran
```

```java
public class PlanlamaEkrani extends OrtakEkran
```

```java
public class RaporEkrani extends OrtakEkran
```

```java
public class MakineGirisEkrani extends OrtakEkran
```

```java
public class DurusKayipEkrani extends OrtakEkran
```

`AnaMenuEkrani` sınıfı sayesinde admin ve operatör ana menülerindeki ortak pencere yapısı, başlık alanı, çıkış işlemi, ikon oluşturma ve menü elemanı ekleme işlemleri tek merkezde toplanmıştır.

`AdminMenuEkrani` ve `OperatorMenuEkrani` sınıfları, ortak menü yapısını tekrar yazmak yerine `AnaMenuEkrani` sınıfını miras alır. Böylece kod tekrarı azaltılmıştır.

`OrtakEkran` sınıfı ise işlem ekranlarında kullanılan ortak üst menü, renkler, pencere ayarları ve rol kontrollerini içerir.

### Polymorphism

`Kullanici` sınıfında bulunan `yetkiBilgisi()` metodu, `Admin` ve `Operator` sınıflarında override edilmiştir.

Böylece aynı metot, kullanıcının rolüne göre farklı sonuç döndürebilmektedir.

Örneğin admin kullanıcısı için admin yetki bilgisi, operatör kullanıcısı için operatör yetki bilgisi döndürülür.

### Interface Kullanımı

Service sınıfları ilgili interface yapılarını implement etmektedir.

Örnek:

```java
public class SiparisService implements ISiparisIslemleri
```

```java
public class MakineService implements IMakineIslemleri
```

```java
public class PlanlamaService implements IPlanlamaIslemleri
```

Bu yapı ile servis sınıflarında yapılacak işlemler soyut olarak tanımlanmış ve ilgili sınıflarda uygulanmıştır.

### Design Pattern Kullanımı

Projede veritabanı bağlantısı için Singleton mantığı kullanılmıştır.

`Veritabani` sınıfı üzerinden tek bir veritabanı bağlantısı yönetilir. Böylece uygulamanın farklı yerlerinde tekrar tekrar bağlantı oluşturmak yerine merkezi bir bağlantı yapısı kullanılmış olur.

Bu yapı kaynak kullanımını azaltır ve veritabanı işlemlerinin daha düzenli yönetilmesini sağlar.

## Ana Menü Yapısı

Projede admin ve operatör kullanıcıları için ayrı ana menü ekranları bulunmaktadır. Ancak bu ekranlarda tekrar eden kodları azaltmak için ortak bir `AnaMenuEkrani` sınıfı oluşturulmuştur.

`AnaMenuEkrani` sınıfında şu ortak işlemler bulunur:

* Ana menü pencere boyutu ve arka plan rengi
* Üst başlık alanı
* Aktif kullanıcı adının gösterilmesi
* Çıkış butonu
* Menü ikonlarının oluşturulması
* Menü butonlarının oluşturulması
* Menü başlıklarının oluşturulması
* Buton hover ve basılma renkleri
* İlgili ekrana yönlendirme işlemleri

`AdminMenuEkrani` ve `OperatorMenuEkrani` sınıfları bu ortak yapıyı kullanır. Bu sınıfların görevi sadece kendi rollerine ait menü elemanlarını eklemektir.

Örneğin admin menüsünde sipariş girişi bulunurken, operatör menüsünde duruş/kayıp ekranı bulunur.

Bu yapı sayesinde:

* Kod tekrarı azaltılmıştır.
* Admin ve operatör menüleri daha düzenli hale getirilmiştir.
* Yeni bir rol eklenmek istenirse ortak menü yapısı tekrar kullanılabilir.
* Menü tasarımındaki değişiklikler tek bir sınıf üzerinden yönetilebilir.

## Veritabanı

Projede SQLite veritabanı kullanılmıştır.

Program ilk çalıştırıldığında `uys.db` dosyası otomatik olarak oluşturulur ve gerekli tablolar hazırlanır.

Oluşturulan temel tablolar:

* `users`
* `machines`
* `siparisler`
* `is_emirleri`
* `downtimes`

## JDBC Kullanımı

Java uygulaması ile SQLite veritabanı arasındaki bağlantı JDBC ile sağlanmıştır.

Projede JDBC kullanılarak:

* Kullanıcı kayıt ve giriş işlemleri
* Makine ekleme, güncelleme, silme ve listeleme işlemleri
* Sipariş ekleme, güncelleme, silme ve listeleme işlemleri
* Planlama işlemleri
* Duruş/kayıp işlemleri
* Raporlama işlemleri

gerçekleştirilmiştir.

SQLite bağlantısı için kullanılan JDBC jar dosyası proje içinde `lib` klasöründe yer almaktadır.

```text
lib/sqlite-jdbc-3.53.0.0.jar
```

Bu nedenle proje farklı bir bilgisayarda açıldığında ayrıca jar dosyası indirmeye gerek yoktur.

## İlk Çalıştırma

Bu projede hazır kullanıcı bilgisi bulunmayabileceği için ilk kullanımda kullanıcı oluşturulmalıdır.

İlk çalıştırma adımları:

1. Proje Eclipse ile açılır.
2. `GirisEkrani.java` çalıştırılır.
3. Açılan giriş ekranında **Kayıt Ol** butonuna basılır.
4. Admin veya Operatör rolünde kullanıcı oluşturulur.
5. Oluşturulan kullanıcı adı, şifre ve rol bilgisi ile giriş yapılır.
6. Kullanıcı rolüne göre admin veya operatör ana menüsüne yönlendirilir.

## Eclipse Üzerinde Çalıştırma

Projeyi Eclipse üzerinde çalıştırmak için:

1. Repository bilgisayara indirilir.
2. Eclipse açılır.
3. `File > Import > Existing Projects into Workspace` seçilir.
4. Proje klasörü seçilir.
5. Proje import edilir.
6. `src/ui/GirisEkrani.java` dosyası çalıştırılır.

## Temel Ekranlar

### Giriş Ekranı

Kullanıcı adı, şifre ve rol bilgisi ile sisteme giriş yapılır.

Giriş başarılı olursa kullanıcının rolüne göre `AdminMenuEkrani` veya `OperatorMenuEkrani` açılır.

### Kayıt Ekranı

Yeni admin veya operatör kullanıcısı oluşturulur.

### Admin Menü

Admin kullanıcısının erişebileceği ekranlara yönlendirme yapılır.

Admin menüsü `AnaMenuEkrani` sınıfından kalıtım alır. Bu sayede ortak menü tasarımı ve yönlendirme işlemleri tekrar yazılmadan kullanılır.

Admin menüsünde bulunan ekranlar:

* Raporlar
* Makine Girişi
* Planlama
* Sipariş Girişi

### Operatör Menü

Operatör kullanıcısının erişebileceği ekranlara yönlendirme yapılır.

Operatör menüsü `AnaMenuEkrani` sınıfından kalıtım alır. Bu sayede admin menüsü ile ortak olan tasarım ve yönlendirme işlemleri tek bir sınıfta tutulur.

Operatör menüsünde bulunan ekranlar:

* Raporlar
* Makine Girişi
* Planlama
* Duruş/Kayıp

### Makine Girişi

Makine tipi, makine kodu, bölüm, kapasite, bakım periyodu ve lokasyon bilgileri yönetilir.

Bu ekranda makine ekleme, güncelleme, silme ve listeleme işlemleri yapılabilir.

### Sipariş Girişi

Sipariş adı, sipariş kodu, müşteri, ürün adı, miktar ve termin tarihi bilgileri yönetilir.

Siparişlere iş emirleri eklenebilir. Bu iş emirleri planlama ekranında kullanılmaktadır.

### Planlama

İş emirleri takvim üzerinde görüntülenir.

Admin kullanıcısı planlama tarihi ve durum güncellemesi yapabilir. Operatör kullanıcısı ise planlama ekranını yalnızca görüntüleme amacıyla kullanabilir.

Planlama durumları:

* Bekliyor
* Üretimde
* Bitti

### Duruş/Kayıp

Makineye ait duruş veya kayıp bilgileri kaydedilir.

Başlangıç ve bitiş zamanı seçildiğinde süre otomatik hesaplanır.

Duruş türü planlı veya plansız olarak seçilebilir.

### Raporlama

Sistem özeti, duruş analizi ve duruş/kayıp kayıtları görüntülenir.

## Raporlama Özellikleri

Raporlama ekranında şu bilgiler görüntülenir:

* Toplam makine sayısı
* Toplam sipariş sayısı
* Toplam duruş/kayıp sayısı
* Toplam iş emri sayısı
* Planlı duruş sayısı
* Plansız duruş sayısı
* En çok görülen duruş nedeni
* Duruş/kayıp rapor tablosu

## Projedeki Kod Tekrarını Azaltan Yapılar

Projede kod tekrarını azaltmak amacıyla ortak sınıflar kullanılmıştır.

### AnaMenuEkrani

`AnaMenuEkrani`, admin ve operatör ana menülerinde ortak olan kodları tek yerde toplar.

Bu sınıf sayesinde aşağıdaki kodlar tekrar tekrar yazılmamıştır:

* Menü penceresi oluşturma
* Header alanı oluşturma
* Aktif kullanıcıyı gösterme
* Çıkış işlemi
* Menü ikonlarını oluşturma
* Menü butonlarını oluşturma
* Buton renk ve hover ayarları
* Ekranlar arası geçiş işlemleri

### OrtakEkran

`OrtakEkran`, işlem ekranlarında ortak olan üst menü ve tasarım yapısını içerir.

Bu sınıf sayesinde makine, sipariş, planlama, duruş/kayıp ve rapor ekranlarında ortak üst menü yapısı tekrar yazılmadan kullanılmaktadır.

## Notlar

* Program ilk çalıştırıldığında `uys.db` dosyası otomatik oluşur.
* İlk giriş için önce kayıt ekranından kullanıcı oluşturulmalıdır.
* Admin ve operatör rolleri farklı yetkilere sahiptir.
* Admin ve operatör ana menüleri `AnaMenuEkrani` sınıfından kalıtım alır.
* İşlem ekranları `OrtakEkran` sınıfından kalıtım alır.
* Veritabanı işlemleri JDBC ile yapılmaktadır.
* Kullanıcı arayüzü Java Swing ile geliştirilmiştir.
* Proje Eclipse IDE üzerinde hazırlanmıştır.




```
