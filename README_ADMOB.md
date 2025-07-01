# 🎯 AdMob Kurulum Rehberi

Bu uygulama **Google AdMob** reklamları kullanır. Kendi AdMob hesabınızla para kazanabilirsiniz!

## 📋 Gereksinimler

1. **Google AdMob hesabı** ([admob.google.com](https://admob.google.com))
2. **Android Studio**
3. **Bu proje**

## ⚙️ Kurulum Adımları

### 1. AdMob Hesabı Oluşturun
- [AdMob Console](https://admob.google.com)'a gidin
- Google hesabınızla giriş yapın
- Yeni uygulama ekleyin

### 2. Reklam Birimleri Oluşturun
Şu reklam türlerini oluşturun:
- **Banner** (ana sayfada küçük reklam)
- **Geçiş** (tam ekran reklam - her 3 açılışta bir)

### 3. local.properties Dosyasını Yapılandırın

```bash
# local.properties.example dosyasını kopyalayın
cp local.properties.example local.properties
```

`local.properties` dosyasını açın ve AdMob ID'lerinizi ekleyin:

```properties
# AdMob Configuration
ADMOB_APP_ID=ca-app-pub-XXXXXXXXXXXXXXXX~XXXXXXXXXX
ADMOB_BANNER_ID=ca-app-pub-XXXXXXXXXXXXXXXX/XXXXXXXXXX  
ADMOB_INTERSTITIAL_ID=ca-app-pub-XXXXXXXXXXXXXXXX/XXXXXXXXXX
```

### 4. Projeyi Build Edin

```bash
./gradlew assembleDebug
```

## 🔒 Güvenlik

- **local.properties** Git'e dahil edilmez
- Gerçek AdMob ID'lerin GitHub'da görünmez
- Test ID'leri varsayılan olarak kullanılır

## 🎮 Test Modu

Eğer `local.properties` dosyası yoksa veya yanlış konfigüre edilmişse, uygulama otomatik olarak **Google test reklamlarını** kullanır.

## 💰 Para Kazanma

- Banner reklamlar **sabit gelir** sağlar
- Geçiş reklamları **yüksek gelir** getirir
- Her 3 açılışta bir tam ekran reklam gösterilir

## 📞 Destek

Kurulum sırasında sorun yaşarsanız issue açabilirsiniz.

---
**Başarılı gelir dilerim! 🚀💰**