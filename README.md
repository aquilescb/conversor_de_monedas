# 💱 Conversor de Monedas - Java API Client

Este proyecto fue desarrollado como parte del curso de **Oracle Next Education (ONE) - LATAM**, donde aprendimos conceptos clave como:
- Programación orientada a objetos en Java
- Consumo de APIs externas y usando libreria GSON
- Manejo de excepciones
- Estructuración de proyectos y archivos de configuración
El objetivo de este proyecto es aplicar esos conocimientos en un caso real: consumir una API de tasas de cambio y realizar la conversión de monedas en tiempo real desde una aplicación Java.
---
## Como conseguir tu API
1. Ingresá a [Exchangerate](https://www.exchangerate-api.com/)
2. Hacé click en **"Get Free API Key"**
3. Registrate con tu email
4. Una vez logueado, recibirás tu clave (API Key) en el dashboard
---
## 📦 Instalación y configuración

### 1. Clonar el repositorio
```bash
git clone https://github.com/aquilescb/conversor_de_monedas
cd conversor_de_monedas
```
### 2. Configurar tu propia API Key
Creá un archivo llamado config.properties dentro de la carpeta src
Dentro de ese archivo, agregá tu clave:
```bash
API_KEY=TU_CLAVE_AQUI
```
### 3. Instalar la libreria GSON
1. Descargá el archivo .jar de GSON desde este enlace: [GSON](https://mvnrepository.com/artifact/com.google.code.gson/gson)
   Recomendacion: Instalar la ultima version y pulsar donde dice Files -> JAR.
2. En IntelliJ IDEA, ir a la parte superior izquierda donde figura Project Structure. Ir a la parte de Modudles, luego dependencias y luego clickiar en el boton +. Se elije el archivo jar del gson y luego pones aplicar
(captura de pantalla)
## Ejecutar el programa
Desde IntelliJ IDEA
1. Asegurate de tener config.properties accesible en el classpath.
2. Ejecutá la clase ConversorApp.
## 🎥 Video tutorial 
Si preferís ver el paso a paso, mirá este video donde se explica cómo usar el proyecto desde cero:

📹 Ver el video en YouTube [![Ver en YouTube] (LINK)

