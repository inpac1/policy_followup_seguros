Descripción
policy_followup_seguros es una aplicación web diseñada para facilitar la gestión y el seguimiento de pólizas de seguros, permitiendo a los usuarios monitorear la vigencia y el estado de sus pólizas de manera eficiente y centralizada.

Problema Identificado
La administración manual de pólizas de seguros puede resultar en errores, olvidos y vencimientos no controlados, lo que conlleva a pérdidas financieras y operativas para las empresas aseguradoras y sus clientes.

Solución
La implementación de policy_followup_seguros automatiza el proceso de seguimiento de pólizas, ofreciendo:

Registro y actualización de pólizas: Permite ingresar y modificar información relevante de cada póliza.
Notificaciones de vencimiento: Alerta a los usuarios sobre próximas fechas de expiración.
Interfaz intuitiva: Facilita la navegación y el acceso a la información necesaria para la toma de decisiones oportunas.

Arquitectura
Backend: Desarrollado con Java utilizando Spring Boot para la gestión de servicios y lógica de negocio.
Frontend: Construido con JSP y Bootstrap para una interfaz de usuario responsiva y amigable.
Base de Datos: MySQL para el almacenamiento y gestión de datos.
Servidor de Aplicaciones: Apache Tomcat para el despliegue de la aplicación.

Tabla de Contenidos
-Requerimientos
-Instalación
-Configuración
-Uso
-Usuario Final
-Administrador
-Contribución
-Roadmap
-Producto

Requerimientos
Java: JDK 23.
Servidor de Aplicación: Apache Tomcat 10.
Base de Datos: MySQL 8.0.
Gestor de Dependencias: Maven.
Docker: Para la gestión de contenedores de MySQL.
Dependencias Adicionales:
Spring Data JPA.
Thymeleaf.

Instalación
Clonar el repositorio:
bash
Copiar código
git clone https://github.com/inpac1/policy_followup_seguros.git
cd policy_followup_seguros

Configurar la base de datos:


Configurar las credenciales:
Editar el archivo application.properties con las credenciales de la base de datos.

Construir y ejecutar el proyecto:
bash
Copiar código
mvn clean install
mvn spring-boot:run

onfiguración
Archivo application.properties: Contiene configuraciones de la base de datos, puerto del servidor, entre otros.
Requerimientos del Sistema:
Java: Instalar JDK 22.
Servidor de Aplicación: Instalar Apache Tomcat 10.
Base de Datos: Configurar MySQL 8.0.


Uso
Usuario Final
Acceso: A través de la página de inicio de sesión.
Funcionalidades:
Registro de nuevas pólizas.
Consulta de pólizas existentes.
Recepción de notificaciones sobre vencimientos próximos.
Administrador
Auditoría: Monitoreo de actividades y cambios en las pólizas.

Contribución
Clonar el repositorio:
bash
Copiar código
git clone https://github.com/inpac1/policy_followup_seguros.git

Crear una nueva rama:
bash
Copiar código
git checkout -b feature/nueva-funcionalidad

Realizar cambios y confirmar:
bash
Copiar código
git add .
git commit -m "Descripción de los cambios"

Enviar el Pull Request:
Subir los cambios:
bash
Copiar código
git push origin feature/nueva-funcionalidad

Crear un Pull Request en GitHub y esperar la revisión.

Roadmap
Próximas Implementaciones:
Integración de notificaciones por correo electrónico.
Mejora de la interfaz de usuario.
Implementación de autenticación multifactor.

