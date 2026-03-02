# 📦 Sistema de Gestión Ayni SAC

Este es un sistema de escritorio (Desktop Application) desarrollado en **Java** para Empresa. El software permite gestionar el flujo completo desde la recepción de pedidos hasta el cumplimiento de las órdenes de compra.

---

## 🖥️ Interfaz Principal (Dashboard)
La aplicación cuenta con una interfaz **MDI (Multiple Document Interface)** que permite:
* **Menú Navegable:** Acceso rápido a Viabilidad, Presupuestos y Órdenes de Compra (OC).
* **Escritorio Virtual:** Uso de `JDesktopPane` para abrir múltiples ventanas internas sin salir de la principal.
* **Personalización:** Fondo corporativo y barra de estado con mensaje de bienvenida y fecha actual.

---

## 🛠️ Arquitectura y Tecnologías
El proyecto sigue un patrón de diseño por capas para separar la interfaz de la base de datos:

* **Lenguaje:** Java 17+
* **Gestor de Proyectos:** Maven
* **Base de Datos:** MySQL 8.0
* **Persistencia:** JPA (Java Persistence API) / Hibernate
* **Librerías GUI:** Swing & AbsoluteLayout (NetBeans Matisse)



---

## 📂 Estructura del Código Fuente

| Paquete | Descripción |
| :--- | :--- |
| `com.aynisac.proyectoayni.igu` | Contiene los JFrames y formularios (Interfaz Gráfica). |
| `com.aynisac.proyectoayni.logica` | Clases de entidad (Objetos de negocio). |
| `com.aynisac.proyectoayni.persistencia` | Controladores JPA y conexión a la BD. |
| `src/main/resources/META-INF` | Configuración del `persistence.xml`. |

---

## ⚙️ Configuración de la Base de Datos

Para conectar el sistema con tu instancia local de **MySQL**:

1. Abre el archivo:  
   `src/main/resources/META-INF/persistence.xml`
2. Modifica las siguientes líneas con tus credenciales:

```xml
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/proyecto_ayni"/>
<property name="javax.persistence.jdbc.user" value="root"/>
<property name="javax.persistence.jdbc.password" value="tu_password"/>