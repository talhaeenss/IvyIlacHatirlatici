# 💊 Ivy İlaç Hatırlatıcı

Akıllı ilaç takip ve hatırlatma uygulaması - İlaçlarınızı hiç unutmayın!

## 📱 Uygulama Özellikleri

### ⏰ Akıllı Hatırlatma Sistemi
- **Günlük Hatırlatmalar**: Her gün belirtilen saatlerde ilaç alma hatırlatması
- **Haftalık Hatırlatmalar**: Haftanın belirli günlerinde ilaç alma hatırlatması  
- **Aylık Hatırlatmalar**: Ayın belirli günlerinde ilaç alma hatırlatması
- **Yıllık Hatırlatmalar**: Yılın belirli tarihlerinde ilaç alma hatırlatması
- **Tam Ekran Bildirimler**: Kaçırılmayacak büyük hatırlatma ekranları
- **Sesli ve Titreşimli Uyarılar**: Etkili hatırlatma yöntemleri

### 💊 İlaç Yönetimi
- **Çoklu İlaç Türü Desteği**:
  - Tablet
  - Kapsül  
  - Şurup
  - Damla
  - Merhem
  - Enjeksiyon
  - İnhaler
  - Göz/Kulak Damlası
- **Esnek Zaman Planlaması**: Her ilaç için birden fazla zaman seçimi
- **Doz Takibi**: Kalan ilaç miktarını takip etme
- **Gün Sayısı Takibi**: Tedavi süresini izleme
- **Doktor Notları**: Her ilaç için özel notlar ekleme

### 📊 Takip ve Raporlama  
- **İlaç Alma Geçmişi**: Her ilaç için detaylı alma kayıtları
- **Doz Durumu**: Güncel doz miktarı ve kalan miktar
- **Tedavi Süresi**: Geçen/kalan gün sayısı
- **Sıralama Seçenekleri**:
  - Son eklenen
  - İlaç adına göre (A-Z)
  - İlaç adına göre (Z-A) 
  - Bir sonraki alma zamanına göre
  - En az alan
  - En çok alan

### 🔒 Güvenlik ve Güvenilirlik
- **Pil Optimizasyonu**: Arka plan çalışması için otomatik ayarlar
- **Sistem Yeniden Başlatma Desteği**: Telefon kapanıp açıldığında alarm korunması
- **Exact Alarm İzinleri**: Android 12+ için hassas alarm zamanlaması
- **Bildirim İzinleri**: Android 13+ için bildirim erişimi
- **Yerel Veri Saklama**: İnternet gerektirmeden çalışma

### 🎨 Kullanıcı Deneyimi
- **Modern Material Design**: Güzel ve kullanışlı arayüz
- **Karanlık Mod Desteği**: Gece kullanımı için konforlu görünüm
- **Kolay İlaç Ekleme**: Adım adım basit ilaç kayıt süreci
- **Hızlı Erişim**: Floating Action Button ile anında ilaç ekleme
- **Boş Durum Ekranı**: İlk kullanıcılar için yönlendirici ekran

### 📋 Bildirim Özellikleri
- **"Aldım" Butonu**: Tek tıkla ilaç alma onayı
- **"Daha Sonra" Butonu**: Hatırlatmayı 15 dakika erteleme
- **Arkaplan Çalışma**: Uygulama kapalıyken de aktif hatırlatma
- **Sistem Bildirimleri**: Android bildirim panelinde görünür uyarılar

## 🚀 Teknik Özellikler

### 📱 Platform Gereksinimleri
- **Android 8.0** (API Level 26) ve üzeri
- **Hedef SDK**: Android 14 (API Level 34)
- **Mimari**: ARM, ARM64, x86, x86_64 desteği

### 🛠️ Teknoloji Stack
- **Dil**: Java
- **UI Framework**: Native Android
- **Tasarım**: Material Design 3
- **Veri Saklama**: SharedPreferences + JSON
- **Alarm Sistemi**: AlarmManager + BroadcastReceiver
- **Reklam**: Google AdMob entegrasyonu
- **JSON Parsing**: Gson kütüphanesi

### 🔧 Önemli Sınıflar
- `MainActivity`: Ana uygulama ekranı ve ilaç listesi
- `IlacModel`: İlaç veri modeli
- `IlacAlarmYoneticisi`: Alarm ve hatırlatma yöneticisi
- `IlacAlarmAlicisi`: Alarm broadcast receiver
- `BildirimButonAlicisi`: Bildirim buton işlemleri
- `ReklamYoneticisi`: AdMob reklam yönetimi

## 🎯 Kullanım Alanları

### 👨‍⚕️ Hedef Kullanıcılar
- Kronik hastalar
- Yaşlı bireyler
- İlaç takibi gereken anne-babalar
- Düzenli vitamin alanlar
- Sağlık profesyonelleri

### 🏥 Kullanım Senaryoları
- **Diyabet hastaları** için insulin takibi
- **Hipertansiyon hastaları** için kan basıncı ilaçları
- **Kalp hastaları** için düzenli ilaç alımı
- **Çocuklar** için antibiyotik kürü takibi
- **Yaşlılar** için çoklu ilaç yönetimi
- **Hamile kadınlar** için vitamin takibi

## 📦 Kurulum ve Çalıştırma

### 🔄 Geliştirme Ortamı
```bash
# Repoyu klonlayın
git clone https://github.com/talhaeenss/IvyIlacHatirlatici.git

# Android Studio'da açın
# Gradle sync yapın
# local.properties dosyasını oluşturun (örnek: local.properties.example)

# Uygulamayı çalıştırın
./gradlew assembleDebug
```

### 📁 Önemli Dosyalar
- `local.properties.example`: AdMob ID yapılandırma örneği
- `app/proguard-rules.pro`: Release build optimizasyonları
- `app/src/main/AndroidManifest.xml`: İzinler ve aktivite tanımları

### 🔑 AdMob Yapılandırması
```properties
# local.properties dosyasında
ADMOB_APP_ID=your_app_id_here
ADMOB_BANNER_ID=your_banner_id_here
ADMOB_INTERSTITIAL_ID=your_interstitial_id_here
```

## 🔐 İzinler

### 📱 Gerekli İzinler
- `RECEIVE_BOOT_COMPLETED`: Sistem yeniden başlatıldığında alarmları geri yükleme
- `VIBRATE`: Titreşim ile uyarı verme
- `WAKE_LOCK`: Ekranı uyandırma
- `SCHEDULE_EXACT_ALARM`: Hassas alarm zamanlaması
- `POST_NOTIFICATIONS`: Android 13+ bildirim gönderme
- `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS`: Pil optimizasyonundan muafiyet

### 🌐 Ağ İzinleri (AdMob için)
- `INTERNET`: Reklam yükleme
- `ACCESS_NETWORK_STATE`: Ağ durumu kontrolü

## 🎨 Ekran Görüntüleri

### 📱 Ana Ekranlar
- **Ana Liste**: Kayıtlı ilaçların listesi
- **İlaç Ekleme**: Adım adım ilaç kayıt süreci
- **Hatırlatma Bildirimi**: Tam ekran alarm ekranı
- **Tanıtım Ekranı**: İlk açılışta kullanıcı yönlendirmesi

## 🚨 Önemli Notlar

### ⚠️ Güvenlik Uyarıları
- Bu uygulama yalnızca hatırlatma amaçlıdır
- Doktor tavsiyesi yerine geçmez
- Kritik ilaçlar için yedek hatırlatma sistemleri kullanın
- İlaç dozlarını doktorunuzla kontrol edin

### 🔧 Sistem Optimizasyonları
- Pil optimizasyonunu kapatın
- Oto-start izni verin
- Bildirim izinlerini açık tutun
- Sistem ayarlarında uygulamayı beyaz listeye ekleyin

## 📄 Lisans

Bu proje özel bir lisans altında yayınlanmaktadır. Kullanım koşulları için lütfen geliştirici ile iletişime geçin.

## 👤 Geliştirici

**Talha Eens**
- GitHub: [@talhaeens](https://github.com/talhaeens)
- Email: eraslanenes195@gmail.com

## 🤝 Katkıda Bulunma

1. Projeyi fork edin
2. Özellik branch'i oluşturun (`git checkout -b feature/YeniOzellik`)
3. Değişikliklerinizi commit edin (`git commit -am 'Yeni özellik eklendi'`)
4. Branch'i push edin (`git push origin feature/YeniOzellik`)
5. Pull Request oluşturun

## 📊 Versiyon Geçmişi

### v1.0.0 (İlk Sürüm)
- ✅ Temel ilaç ekleme ve düzenleme
- ✅ Günlük, haftalık, aylık, yıllık hatırlatmalar
- ✅ Bildirim sistemi
- ✅ Doz ve gün takibi
- ✅ Material Design arayüz
- ✅ AdMob reklam entegrasyonu
- ✅ Android 8-14 uyumluluğu

## 🔮 Gelecek Özellikler

- [ ] Cloud sync ve yedekleme
- [ ] İlaç etkileşimi uyarıları
- [ ] Doktor paylaşım modülü
- [ ] Aile üyesi takibi
- [ ] Akıllı saat entegrasyonu
- [ ] Sesli hatırlatmalar
- [ ] İstatistik ve raporlar
- [ ] Çoklu dil desteği

---

💊 **Sağlığınız bizim önceliğimiz!** 

*İlaçlarınızı zamanında almayı unutmayın!*