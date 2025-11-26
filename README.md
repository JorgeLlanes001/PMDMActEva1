#  Actividad Evaluable 1 – Aplicación Android en Kotlin

Proyecto desarrollado como parte de la actividad práctica de desarrollo Android, utilizando Kotlin, Android Studio y layouts XML.
La aplicación está compuesta por tres pantallas principales, navegación mediante Intents explícitos, un formulario con validaciones, y mejoras visuales mediante styles.xml, ConstraintLayout y un icono de app personalizado.

---

##  1. Estructura de la aplicación

La aplicación contiene 3 Activities:

1. MainActivity

   * Título de la aplicación
   * Logo
   * Botón para ir a la pantalla de presentación

2. PresentacionActivity

   * Información personal simulada (nombre, edad, descripción)
   * Botón para ir al formulario

3. FormularioActivity

   * Campos: nombre, correo, mensaje
   * Validaciones: campos vacíos y formato correcto de email
   * Confirmación mediante Toast y TextView

---

##  2. Tecnologías utilizadas

| Tecnología            | Descripción                                    |
| --------------------- | ---------------------------------------------- |
| Kotlin                | Lenguaje principal de la aplicación            |
| XML                   | Definición de interfaces gráficas              |
| ConstraintLayout      | Organización de los elementos de cada pantalla |
| Android Studio Iguana | Entorno de desarrollo                          |
| Intents explícitos    | Navegación entre Activities                    |
| Android SDK 24+       | Versión mínima configurada                     |

---

##  3. Cómo ejecutar el proyecto

###  Requisitos previos

* Android Studio instalado
* Kotlin habilitado
* Emulador o dispositivo físico conectado

###  Pasos para abrir y ejecutar

1. Descargar o clonar el proyecto.
2. Abrir Android Studio → Open Project → seleccionar carpeta del proyecto.
3. Esperar a que finalice la sincronización de Gradle.
4. Seleccionar un emulador o dispositivo físico.
5. Pulsar el botón Run.

---

##  4. Navegación de la aplicación

La navegación se realiza mediante Intents explícitos, es decir, llamando directamente a la Activity objetivo.

##  5. Validaciones implementadas en el formulario

El formulario controla que:

###  1. Ningún campo esté vacío

```kotlin
if (nombre.isEmpty() || correo.isEmpty() || mensaje.isEmpty()) {
    Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
    return@setOnClickListener
}
```

###  2. El correo tenga un formato válido

Uso de la expresión regular integrada:

```kotlin
if (!Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
    Toast.makeText(this, "Correo inválido", Toast.LENGTH_SHORT).show()
    return@setOnClickListener
}
```

###  3. Confirmación

Muestra los datos en un TextView y un Toast:

```kotlin
tvConfirmacion.text = "Nombre: $nombre\nCorreo: $correo\nMensaje: $mensaje"
Toast.makeText(this, "Formulario enviado", Toast.LENGTH_SHORT).show()
```

---

##  6. Personalización visual

###  Uso de styles.xml

Se definió un tema personalizado para toda la aplicación:

```xml
<style name="Theme.PrimeraActividad" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
    <item name="colorPrimary">@color/purple_500</item>
    <item name="colorPrimaryVariant">@color/purple_700</item>
    <item name="colorOnPrimary">@color/white</item>

    <item name="colorSecondary">@color/teal_200</item>
    <item name="colorOnSecondary">@color/black</item>

    <item name="android:fontFamily">sans-serif</item>
</style>
```

###  Icono personalizado

Se creó un icono propio usando:

> res → mipmap → New → Image Asset

Android Studio generó automáticamente versiones para todas las densidades.

---

##  7. Capturas de pantalla (añadir al entregar)

> Debes incluir imágenes de cada pantalla.
> Sugiero que añadas títulos así:

### Pantalla 1 – MainActivity

*(inserta captura aquí)*

### Pantalla 2 – PresentacionActivity

*(inserta captura aquí)*

### Pantalla 3 – FormularioActivity

*(inserta captura aquí)*

---

##  8. Estructura de carpetas del proyecto

```
app/
 ├── java/com.example.primeraactividad/
 │    ├── MainActivity.kt
 │    ├── PresentacionActivity.kt
 │    └── FormularioActivity.kt
 │
 └── res/
      ├── layout/
      │    ├── activity_main.xml
      │    ├── activity_presentacion.xml
      │    └── activity_formulario.xml
      ├── mipmap/ (iconos personalizados)
      ├── values/
      │    ├── colors.xml
      │    ├── strings.xml
      │    └── themes.xml / styles.xml
```

---

##  9. Conclusión

El proyecto cumple todos los requisitos:

App nativa Android
Kotlin + layouts XML
Tres pantallas conectadas con Intents
Paso de información y validaciones
Diseño organizado con ConstraintLayout
Estilos personalizados
Icono de app propio
README detallado

Esta estructura permite seguir ampliando la aplicación de manera fácil, añadiendo más pantallas, más validaciones o nuevas funcionalidades.
