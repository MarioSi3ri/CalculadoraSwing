# 🧮 Calculadora Swing

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-blue)
![Estado](https://img.shields.io/badge/estado-acad%C3%A9mico-informational)
![Licencia](https://img.shields.io/badge/Licencia-MIT-green.svg)

Aplicación de escritorio desarrollada en **Java** utilizando **Swing** para implementar una calculadora básica con interfaz gráfica. El proyecto forma parte de la asignatura **Tópicos Avanzados de Programación** y corresponde a la actividad **R1. UVEG**.

La aplicación permite realizar operaciones aritméticas básicas mediante botones numéricos y operadores, mostrando los resultados directamente en una ventana gráfica.

## 📌 Tabla de contenido

- [Acerca del proyecto](#-acerca-del-proyecto)
- [Características](#-características)
- [Operaciones disponibles](#-operaciones-disponibles)
- [Tecnologías utilizadas](#-tecnologías-utilizadas)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Requisitos previos](#-requisitos-previos)
- [Instalación](#-instalación)
- [Ejecución](#-ejecución)
- [Uso](#-uso)
- [Detalles de implementación](#-detalles-de-implementación)
- [Limitaciones conocidas](#-limitaciones-conocidas)
- [Posibles mejoras](#-posibles-mejoras)
- [Contribución](#-contribución)
- [Autor](#-autor)

## 🧭 Acerca del proyecto

**Calculadora Swing** es una aplicación de escritorio sencilla orientada al aprendizaje de los fundamentos de la programación gráfica en Java. Su propósito es demostrar el uso de componentes de **Java Swing**, administradores de diseño, eventos de acción y eventos del mouse.

La ventana principal se construye a partir de un `JFrame` que contiene un panel personalizado con:

- Una pantalla de texto no editable para mostrar números, operadores y resultados.
- Un teclado numérico organizado en una cuadrícula.
- Botones para suma, resta, multiplicación, división, limpieza e igualdad.
- Efectos visuales al pasar el cursor sobre los botones.

## ✨ Características

- Interfaz gráfica de escritorio construida con Java Swing.
- Operaciones de suma, resta, multiplicación y división.
- Botón de limpieza (`C`) para reiniciar la operación actual.
- Validación básica de división entre cero.
- Ventana centrada automáticamente en la pantalla.
- Botones organizados mediante `GridLayout`.
- Resaltado visual de los botones cuando el cursor pasa sobre ellos.
- Código separado en clases para la ventana principal, la interfaz y el comportamiento del mouse.

## ➕ Operaciones disponibles

| Operación | Símbolo | Ejemplo |
|---|:---:|---|
| Suma | `+` | `8 + 4 = 12` |
| Resta | `-` | `8 - 4 = 4` |
| Multiplicación | `*` | `8 * 4 = 32` |
| División | `/` | `8 / 4 = 2` |
| Limpiar | `C` | Borra la entrada actual |
| Resultado | `=` | Calcula la operación seleccionada |

## 🛠️ Tecnologías utilizadas

- **Java**: lenguaje principal del proyecto.
- **Java Swing**: construcción de la interfaz gráfica de usuario.
- **AWT**: layouts, dimensiones, colores y eventos de la interfaz.
- **IntelliJ IDEA**: estructura de proyecto y configuración del módulo.
- **JDK 17 o superior**: la configuración del proyecto utiliza características compatibles con versiones modernas de Java.

El proyecto no utiliza dependencias externas ni un sistema de construcción como Maven o Gradle; únicamente requiere el JDK de Java.

## 📁 Estructura del proyecto

```text
CalculadoraSwing/
├── .idea/                                     # Configuración del proyecto para IntelliJ IDEA
├── Calculadora/
│   ├── .idea/                                 # Configuración específica del módulo
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── si3ri/
│   │   │   │           ├── Calculadora.java   # Punto de entrada y ventana principal
│   │   │   │           ├── interfaz/
│   │   │   │           │   └── Interfaz.java  # Componentes y lógica de la calculadora
│   │   │   │           └── mouse/
│   │   │   │               └── MouseListener.java # Efectos visuales del mouse
│   │   │   └── META-INF/
│   │   │       └── MANIFEST.MF                # Clase principal del JAR
│   │   └── .gitignore
├── CalculadoraSwing.iml                       # Módulo de IntelliJ IDEA
└── README.md
```

> Nota: los paquetes Java del proyecto incluyen el prefijo `main.java.com.si3ri`, por lo que las rutas de compilación y ejecución deben respetar el nombre completo de la clase principal.

## ✅ Requisitos previos

Antes de instalar y ejecutar el proyecto, asegúrate de contar con:

1. **JDK 17 o superior** instalado.
2. Git, si deseas clonar el repositorio.
3. Opcionalmente, **IntelliJ IDEA** u otro IDE compatible con proyectos Java.

Para comprobar que Java está instalado, ejecuta:

```bash
java -version
javac -version
```

## 📥 Instalación

### Opción 1: clonar el repositorio con Git

```bash
git clone https://github.com/MarioSi3ri/CalculadoraSwing.git
cd CalculadoraSwing
```

### Opción 2: descargar el código fuente

1. Accede al repositorio en GitHub.
2. Selecciona **Code**.
3. Elige **Download ZIP**.
4. Descomprime el archivo en la ubicación que prefieras.
5. Abre la carpeta del proyecto desde tu IDE o terminal.

## ▶️ Ejecución

### Desde IntelliJ IDEA

1. Abre IntelliJ IDEA.
2. Selecciona **Open** y elige la carpeta `CalculadoraSwing`.
3. Verifica que el proyecto utilice un JDK 17 o superior.
4. Abre el archivo:

   ```text
   Calculadora/src/main/java/com/si3ri/Calculadora.java
   ```

5. Ejecuta el método `main` de la clase `Calculadora`.

### Desde la terminal en Linux o macOS

Desde la raíz del repositorio, compila todos los archivos fuente:

```bash
mkdir -p out
javac -d out $(find Calculadora/src/main/java -name "*.java")
```

Después, inicia la aplicación:

```bash
java -cp out main.java.com.si3ri.Calculadora
```

### Desde PowerShell en Windows

Desde la raíz del repositorio, ejecuta:

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -d out (Get-ChildItem -Recurse -Filter *.java Calculadora/src/main/java | ForEach-Object { $_.FullName })
java -cp out main.java.com.si3ri.Calculadora
```

### Crear y ejecutar un archivo JAR

Una vez compiladas las clases en la carpeta `out`, puedes generar un archivo ejecutable JAR con:

```bash
jar cfe Calculadora.jar main.java.com.si3ri.Calculadora -C out .
java -jar Calculadora.jar
```

## 🧑‍💻 Uso

1. Inicia la aplicación.
2. Introduce el primer número utilizando los botones numéricos.
3. Selecciona una operación: `+`, `-`, `*` o `/`.
4. Introduce el segundo número.
5. Presiona `=` para mostrar el resultado.
6. Presiona `C` para limpiar la pantalla y comenzar una nueva operación.

### Ejemplo

Para calcular `25 + 17`:

```text
25 → + → 17 → =
Resultado: 42
```

Si intentas dividir entre cero, la aplicación muestra un mensaje de error y evita completar la operación.

## ⚙️ Detalles de implementación

### Clase `Calculadora`

Extiende `JFrame` y representa la ventana principal de la aplicación. Se encarga de:

- Definir el título y tamaño de la ventana.
- Configurar el cierre de la aplicación.
- Centrar la ventana en la pantalla.
- Instanciar y agregar el componente `Interfaz`.

### Clase `Interfaz`

Extiende `JPanel` e implementa `ActionListener`. Contiene:

- La pantalla de resultados basada en `JTextField`.
- Los botones numéricos y de operaciones.
- La distribución visual mediante `BorderLayout` y `GridLayout`.
- La lógica para capturar eventos y calcular resultados.

### Clase `MouseListener`

Extiende `MouseAdapter` y agrega una respuesta visual cuando el cursor entra o sale del área de cada botón. Al ingresar el cursor, se aplica un borde azul claro; al salir, se restaura el borde predeterminado.

## ⚠️ Limitaciones conocidas

- La calculadora está diseñada para realizar operaciones sencillas de dos operandos.
- No incluye botones para decimales, cambio de signo, porcentaje o funciones científicas.
- Los resultados se muestran como valores enteros, por lo que la parte decimal de algunas divisiones puede no visualizarse.
- No permite encadenar varias operaciones en una sola expresión.
- La entrada se realiza mediante los botones de la interfaz; no se incluye soporte específico para el teclado.
- La validación de entradas y estados intermedios es básica.

## 🚀 Posibles mejoras

- Añadir soporte para números decimales mediante un botón `.`.
- Mostrar resultados de división conservando los decimales.
- Incorporar operaciones encadenadas y prioridad matemática.
- Agregar botones de porcentaje, cambio de signo y retroceso.
- Permitir la entrada mediante el teclado físico.
- Mejorar los mensajes de error y la validación de estados incompletos.
- Separar la lógica de cálculo de la interfaz para facilitar las pruebas unitarias.
- Añadir pruebas automatizadas.
- Incorporar un sistema de construcción con Maven o Gradle.
- Mejorar la accesibilidad y adaptar la interfaz a diferentes tamaños de ventana.

## 🤝 Contribución

Las contribuciones son bienvenidas para fines educativos y de mejora del proyecto.

1. Realiza un fork del repositorio.
2. Crea una rama para tu cambio:

   ```bash
   git checkout -b mejora/nombre-de-la-mejora
   ```

3. Realiza tus modificaciones.
4. Comprueba que el proyecto compile y se ejecute correctamente.
5. Guarda los cambios:

   ```bash
   git add .
   git commit -m "Mejora la funcionalidad de la calculadora"
   ```

6. Envía la rama a tu fork:

   ```bash
   git push origin mejora/nombre-de-la-mejora
   ```

7. Abre un Pull Request describiendo claramente los cambios realizados.

## 👤 Autor

**Mario Si3ri**

- GitHub: [@MarioSi3ri](https://github.com/MarioSi3ri)
- Repositorio: [CalculadoraSwing](https://github.com/MarioSi3ri/CalculadoraSwing)

## 📄 Licencia

Este proyecto se distribuye bajo la **Licencia MIT**. Consulta el archivo [LICENSE](LICENSE) para conocer los términos completos.

---

<p align="center">
  Desarrollado con Java Swing como proyecto académico de programación.
</p>
