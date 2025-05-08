# 💱 Currency Converter - Java API Client

This project was developed as part of the **Oracle Next Education (ONE) - LATAM**, where we covered key concepts such as:

- Object-oriented programming in Java

- Consuming external APIs using the GSON library

- Exception handling

- Project structure and configuration file management

**Objective:** Apply these concepts in a real-world use case by consuming an exchange rate API to perform real-time currency conversion from a Java application.

The program presents the conversion from one currency to another, the history of all converted currencies, and a data entry guide for all possible currency combinations.

---
## How to get your API Key
1. Go to [ExchangerateAPI](https://www.exchangerate-api.com/)
2. Click on **Get Free API Key**
3. Sign up with your 
4. Once logged in, you’ll receive your API key in the dashboard
---
## 📦 Installation and Setup

### 1. Clone the repository
   ```bash
   git clone https://github.com/aquilescb/conversor_de_monedas
   cd conversor_de_monedas
   ```
### 2. Set up your API Key
   Create a file called `config.properties` inside the `src` folder.
   Inside that file, add `API_KEY` and then your generated key:

```bash
API_KEY=YOUR_API_KEY_HERE
```


### 3. Install the GSON library
1. Download the .jar file for GSON from this link: [GSON](https://mvnrepository.com/artifact/com.google.code.gson/gson) 
   (Recommended: download the latest version)

2. In IntelliJ IDEA:

   - Go to *File > Project Structure > Modules > Dependencies*
   - Click the "+" button and choose "JARs or directories"
   - Select the downloaded .jar file
   - Apply the changes

## ▶️ Running the program
From IntelliJ IDEA:

Make sure the `config.properties` file is accessible in the classpath

Run the `ConversorApp` class

## 🎥 Video Tutorial
Prefer a step-by-step walkthrough? Check out this tutorial video explaining how to use the project from scratch:

📹 Watch on YouTube [VIDEO](https://www.youtube.com/watch?v=cebbVvV_q2Q)