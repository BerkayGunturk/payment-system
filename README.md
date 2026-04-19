
## Yeni Ödeme Yöntemi Entegrasyonu UML Diyagramı
Sistemimde ödeme yöntemlerini bir arayüz (IPayment) altında topladım. Böylece Open/Closed prensibine uyarak yeni ödeme yöntemlerini kolayca ekleyebiliyorum. Nesne oluşturma mantığını bir Factory sınıfına devrederek karmaşıklığı azalttım. En önemlisi, PaymentProcessor sınıfım doğrudan ödeme yöntemlerine değil, arayüze bağımlı olduğu için (DIP), sistemim tamamen esnek ve test edilebilir bir yapıya sahip oldu.

## Şemada gösterilen ilişkiler:

Teal (yeşil) kutular CreditCardPayment ve PayPalPayment → kesik çizgi + içi boş üçgen = implements (OCP)
Coral (turuncu) kutular PaymentFactory ve PaymentProcessor → kesik çizgi + ok = uses IPayment (DIP)
Main → hem PaymentFactory hem PaymentProcessor kullanıyor
Sol kenardan dönen uzun ok = PaymentProcessor'ın IPayment'a bağımlılığı

## Package'lar da küçük etiketlerle gösterildi:

contract → IPayment
method → CreditCard, PayPal
factory → PaymentFactory
processor → PaymentProcessor

## Package'lar da küçük etiketlerle gösterildi:

contract → IPayment
method → CreditCard, PayPal
factory → PaymentFactory
processor → PaymentProcessor

<img width="765" height="482" alt="payment_uml_diagram" src="https://github.com/user-attachments/assets/9cefc030-a855-4acc-a473-efe2f1b03792" />
