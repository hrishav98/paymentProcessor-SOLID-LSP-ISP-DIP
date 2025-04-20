# Payment Processing System – SOLID Principles (SRP, OCP, LSP, ISP, DIP)

This Spring Boot project demonstrates the practical application of **all 5 SOLID principles** using a simple and extensible **Payment Processing System**.

---

## 💡 About the Project

This application simulates a **payment system** that:
1. Handles payments using multiple methods (e.g., Card, UPI).
2. Supports refunds for eligible payment methods (e.g., Card only).

---

## 🔍 Focused SOLID Principles

### ✅ Single Responsibility Principle (SRP)
- `PaymentController` is responsible only for HTTP layer logic.
- `PaymentProcessor` handles business logic.
- Each service class has one job: processing a specific payment type.

### ✅ Open/Closed Principle (OCP)
- Add new payment types (like NetBanking, Wallets) by implementing `PaymentService`.
- No need to modify the existing flow.

### ✅ Liskov Substitution Principle (LSP)
- All `PaymentService` implementations (e.g., Card, UPI) can replace the parent type without breaking functionality.

### ✅ Interface Segregation Principle (ISP)
- `Refundable` is a separate interface. Only refund-supporting services implement it.

### ✅ Dependency Inversion Principle (DIP)
- `PaymentProcessor` depends on abstractions (`PaymentService`, `Refundable`), not concrete implementations.

---

## 📁 Project Structure

```plaintext
com.hrishav.solid
├── controller
│   └── PaymentController.java
├── model
│   ├── PaymentRequest.java
│   └── RefundRequest.java
├── service
│   ├── PaymentService.java
│   ├── Refundable.java
│   ├── CardPaymentService.java
│   ├── UpiPaymentService.java
│   └── PaymentProcessor.java
└── SolidApplication.java


```

---

## 🛠️ Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Maven

---

## 🧪 API Testing

### ➤ Process Payment

**Endpoint:**  
`POST /api/payment`

**Sample JSON:**
```json
{
  "method": "card",
  "amount": 1000
}

```

### ➤  Process Refund

**Endpoint:**  
`POST /api/payment/refund`

**Sample JSON:**
```json
{
  "method": "card",
  "amount": 500
}
```

## 🙌 Contributing
This is a learning project to demonstrate clean architecture.
Feel free to fork, extend it with more payment types, validations, or even persistence!


---

> Made with ❤️ by Hrishav
