# 💎 Backend - E-commerce de Joyería Personalizada 💎

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring"/>
  <img src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL"/>
</div>

---

## 🔗 Navegación del Proyecto

- **🎨 [Ir al Repositorio Frontend](https://github.com/dreaice/Sprintasticos)** - Interfaz de usuario y experiencia del cliente

---

## 📝 Descripción

API REST desarrollada con Spring Boot para el sistema de e-commerce de joyería personalizada. Este backend proporciona todos los servicios necesarios para:

- 🔐 **Autenticación y autorización** de usuarios
- 💎 **Gestión de productos** y catálogo de joyas
- 🎨 **Sistema de personalización** y cotizaciones
- 📦 **Gestión de pedidos** con folios de seguimiento
- ⚙️ **Panel administrativo** para gestión completa

---

## 🎯 Características del Backend

- ✨ **API RESTful** con endpoints bien documentados
- 🔐 **Sistema de autenticación** y autorización
- 📊 **Base de datos MySQL** para persistencia
- 🛡️ **Validación de datos** robusta
- 📈 **Sistema de cotizaciones** en tiempo real
- 🗃️ **Gestión de inventario** automática

---

## 🛠️ Tecnologías Utilizadas

### Core Backend
<div align="center">
  <img src="https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 17"/>
  <img src="https://img.shields.io/badge/Spring_Boot_3-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot 3"/>

  <img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Data JPA"/>
</div>

### Base de Datos
<div align="center">
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL"/>
</div>

### Herramientas de Desarrollo
<div align="center">
  <img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle"/>

</div>

---

## 🧑‍🤝‍🧑 Equipo de Desarrollo (Scrum Roles) A-Z

| Nombre                           | Rol             |
|----------------------------------|------------------|
| Aguirre López Andrea Eunice      | **Scrum Master** |
| Aragón Suárez Jorge Daniel       | **Product Owner**|
| Delgado Maza Lilian              | Developer        |
| Ginez Eligio Joshua Edwin        | Developer        |
| González Rangel Maria José       | Developer        |
| Huescas Vergara Abizaic Salvador | Developer        |
| Jimenez Molina Karla Itzel       | Developer        |
| Landeros Sandoval José Eduardo   | Developer        |
| Ramirez Bautista Oswaldo Alfredo | Developer        |

---

## 🚀 Instalación y Configuración

### 📋 Prerrequisitos

- Java JDK 17 o superior
- MySQL 8.0 o superior
- Gradle 7.6+
- IDE recomendado: IntelliJ IDEA o Eclipse

### 🔧 Configuración del Entorno

1. **Clona el repositorio**
   ```bash
   git clone git@github.com:dreaice/Sprintasticos-backend.git
   cd backend-joyeria
   ```

2. **Configura la base de datos**
   
   Crea una base de datos en MySQL:
   ```sql
   CREATE DATABASE ecommerce_joyeria_aurum_designer;
   CREATE USER 'aurum_user'@'localhost' IDENTIFIED BY 'tu_password';
   GRANT ALL PRIVILEGES ON joyeria_db.* TO 'aurum_user'@'localhost';
   FLUSH PRIVILEGES;
   ```

3. **Configura application.properties**
   ```properties
   # Database Configuration
   spring.datasource.url=jdbc:mysql://localhost:3306/joyeria_db
   spring.datasource.username=aurum_user
   spring.datasource.password=tu_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   # JPA Configuration
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

   # Server Configuration
   server.port=8080
   server.servlet.context-path=/api

   ```

4. **Instala las dependencias y ejecuta**
   ```bash
   # Con Gradle
   ./gradlew build
   ./gradlew bootRun
   
   # Si modificas build.gradle, actualiza las dependencias
   ./gradlew --refresh-dependencies
   ```

La API estará disponible en: `http://localhost:8080/api`

---

## 📊 Estructura del Proyecto

```
backend-joyeria/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── aurum/ecommerce/
│   │   │       ├── Application.java
│   │   │       ├── controller/      # Controladores REST
│   │   │       ├── service/         # Servicios de negocio
│   │   │       ├── repository/      # Repositorios JPA
│   │   │       ├── model/           # Entidades JPA
│   │   │       ├── security/        # Configuración de seguridad
│   │   │       └── util/            # Utilidades
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql            # Datos iniciales
│   └── test/                       # Pruebas unitarias
├── build.gradle
├── gradle/
├── gradlew
├── gradlew.bat
└── README.md
```

---


## 🤝 Contribución

1. Haz un Fork del proyecto
2. Crea una rama para tu feature (`git checkout -b feature/BackendFeature`)
3. Commit tus cambios (`git commit -m 'Add backend feature'`)
4. Push a la rama (`git push origin feature/BackendFeature`)
5. Abre un Pull Request

---

## 📞 Contacto

Para consultas técnicas sobre el backend, contacta al equipo de desarrollo Sprintasticos.

---

<div align="center">
  <sub>Backend desarrollado con ❤️ por el equipo Sprintasticos</sub>
</div>
