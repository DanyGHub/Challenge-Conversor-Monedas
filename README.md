#  Conversor de Monedas
Este proyecto es una aplicación de consola en Java que permite convertir entre distintas monedas utilizando la API gratuita de [ExchangeRate-API](https://www.exchangerate-api.com/)

## 📁 Estructura del Proyecto
El proyecto está dividido en dos paquetes principales:
- `Class/`
  - `Conversion.java`  
    ▸ Representa un record que mapea los datos de respuesta JSON de la API.  
  - `Consulta.java`  
    ▸ Se encarga de realizar las peticiones HTTP a la API de ExchangeRate.

- `Main/`
  - `Principal.java`  
    ▸ Clase principal
      - Muestra las monedas disponibles.  
      - Solicita al usuario la moneda de origen, el valor y la moneda destino.  
      - Realiza la conversión usando la API.  
      - Muestra el resultado en consola.  
      - Permite salir del programa escribiendo `salir`.

## ❓ ¿Qué hace?
- Muestra una lista de todas las monedas disponibles.
- Permite al usuario:
  - Seleccionar una moneda a convertir.
  - Ingresar su valor.
  - Seleccionar una moneda de destino.
- Realiza la conversión usando tasas actualizadas.
- Permite salir del programa colocando `salir` por terminal.

## 🛠️ Tecnologías y dependencias
- Java 17 o superior
- [Gson]([https://github.com/google/gson](https://mvnrepository.com/artifact/com.google.code.gson/gson)) para parseo de JSON
- `java.net.http` para hacer las peticiones HTTP

## 📋 Requisitos para compilar y ejecutar
1. Tener Java JDK 17 o superior instalado.
2. Incluir la librería **Gson**.
