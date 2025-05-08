# 💱 Conversor de Monedas - Java API Client

Este proyecto fue desarrollado como parte del curso de **Oracle Next Education (ONE) - LATAM**, donde se abordaron conceptos clave como:
- Programación orientada a objetos en Java
- Consumo de APIs externas utilizando libreria GSON
- Manejo de excepciones
- Estructuración de proyectos y archivos de configuración

**Objetivo:** Aplicar estos conocimientos en un caso practico: consumir una API de tasas de cambio y realizar la conversión de monedas en tiempo real desde una aplicación Java.

El programa presenta la conversion de una moneda a otra, el historial de todas las monedas convertida y una guia de entrada de datos para todas las combinaciones posibles de monedas.

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
Creá un archivo llamado `config.properties` dentro de la carpeta `src`
Dentro de ese archivo, agregá `API_KEY` y luego tu clave generada:
```bash
API_KEY=TU_CLAVE_AQUI
```
### 3. Instalar la libreria GSON
1. Descargá el archivo .jar de GSON desde este enlace: [GSON](https://mvnrepository.com/artifact/com.google.code.gson/gson)
(Recomendacion:descargar la última version)
3. En IntelliJ IDEA:
   - Ir a *file> Project Structre > Modules > Dependencies*
   - Hacer clic en el boton "+" y seleccionar "JARs or directories"
   - Elegi el archivo `.jar` descargado
   - Aplica los cambio

---
## ▶️ Ejecutar el programa
Desde IntelliJ IDEA
1. Asegurate de tener `config.properties` accesible en el classpath.
2. Ejecutá la clase `ConversorApp`

## 🎥 Video tutorial 
Si preferís ver el paso a paso, mirá este video donde se explica cómo usar el proyecto desde cero:

📹 Ver el video en YouTube [VIDEO](https://www.youtube.com/watch?v=cebbVvV_q2Q)

