# Spring Boot Actuator Demo

Bu proje, **Spring Boot Actuator** kullanılarak uygulamanın çalışma durumu, sistem bilgileri ve metriklerini
gözlemlemek amacıyla geliştirilmiş örnek bir uygulamadır.

Actuator sayesinde uygulamanın **health**, **info**, **metrics** gibi kritik noktaları
HTTP endpoint’leri üzerinden izlenebilir.

---

## 🚀 Kullanılan Teknolojiler

- Java 17
- Spring Boot
- Spring Boot Actuator
- Maven

---

## 📌 Spring Boot Actuator Nedir?

Spring Boot Actuator, çalışan bir Spring Boot uygulaması hakkında:

- Uygulamanın ayakta olup olmadığını
- Sistem kaynak kullanımını
- Ortam bilgilerini
- HTTP istek metriklerini

gibi bilgileri **hazır endpoint’ler** üzerinden sunar.

Bu sayede:
- Monitoring
- Logging
- Health Check
- Production takibi

kolayca yapılabilir.

---

## 🔧 Aktif Actuator Endpoint’leri

Bu projede aşağıdaki endpoint’ler aktiftir:

| Endpoint | Açıklama |
|--------|---------|
| `/actuator/health` | Uygulamanın ayakta olup olmadığını gösterir |
| `/actuator/info` | Uygulama hakkında genel bilgiler |
| `/actuator/metrics` | JVM ve uygulama metrikleri |
| `/actuator/env` | Ortam değişkenleri |
| `/actuator/beans` | Spring Bean’leri |

---

