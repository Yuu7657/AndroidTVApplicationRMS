# 🎬 AndroidTVApplicationRMS

Aplicación desarrollada en **Kotlin** para **Android TV**, diseñada con un enfoque moderno y orientado a la experiencia del usuario en pantallas grandes.  
Este proyecto demuestra la integración de fragmentos personalizados, navegación fluida y diseño adaptado para televisores, utilizando el **Leanback Library** de Android.

---

## 🚀 Características principales

- 🧩 **Interfaz modular** basada en fragments (`MainFragment`, `DetailsActivity`, `PlaybackActivity`, etc.)
- 🎥 **Reproducción de video** con control remoto y soporte multimedia.
- 🎨 **Diseño responsivo** optimizado para Android TV.
- 📁 **Gestión de contenido** mediante listas y adaptadores personalizados (`CardPresenter`, `MovieList`).
- ⚙️ Configuración moderna con **Gradle Kotlin DSL** (`build.gradle.kts`).
- 💡 Incluye fragmentos personalizados para secciones de:
  - `AboutMeFragment`
  - `ExperienceFragment`
  - `ProjectsFragment`
  - `SkillsFragment`
  - `WelcomeFragment`

---

## 🧠 Tecnologías utilizadas

- **Lenguaje:** Kotlin  
- **Framework:** Android Jetpack  
- **Arquitectura:** Fragmentos + Presenters  
- **Dependencias:** Leanback, AndroidX, Gradle KTS  
- **Entorno:** Android Studio (Electric Eel o superior)  

---

## 🧩 Estructura del proyecto

AndroidTVApplicationRMS/
│
├── app/
│ ├── src/main/java/com/example/androidtvapplicationrms/
│ │ ├── activities/
│ │ ├── fragments/
│ │ ├── presenters/
│ │ └── models/
│ ├── res/
│ ├── build.gradle.kts
│ └── proguard-rules.pro
│
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md

## 🔧 Requisitos de instalación

1. Tener instalado **Android Studio (Electric Eel o superior)**.  
2. Clonar el repositorio:
   ```bash
   git clone https://github.com/TU_USUARIO/AndroidTVApplicationRMS.git

   🧰 Configuración recomendada

Gradle: 8.0+
Kotlin: 1.9+
Compile SDK: 34
Target SDK: 34

👨‍💻 Autor
Ricardo Mejía Santillán
Ingeniero en Desarrollo y Gestión de Software
📍 UTOM — Universidad Tecnológica del Oriente de Michoacán
💼 GitHub

🧾 Licencia
Este proyecto se distribuye bajo la licencia MIT.
Eres libre de usarlo, modificarlo y compartirlo con atribución correspondiente.

“La televisión inteligente no solo muestra contenido, también puede reflejar la creatividad del desarrollador que la construye.”
