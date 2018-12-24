# JPA Servlet ListaCorreos

Utilizando JPA, se pide programar una aplicación para crear Listas de Correo que utilizará un canal (DBUsuario) para escribir los datos de los usuarios de una Lista de Correo en una base de datos relacional, de acuerdo con las siguientes condiciones:
1. La aplicación ha de permitir conectar rápidamente el programa “Cliente” a la base de datos de usuarios a través de un Servlet (“ListaCorreosServlet”) del tipo HttpServlet de Java.
2. Crear una aplicación de “Administración de Usuarios”, que permita: visualizar todos los usuarios incluídos en la BD, actualizar los usuarios existentes y eliminar los usuarios almacenados en la mencionada tabla usuario.
3. Ejecutar la aplicación como un proyecto Java de Eclipse y utilizar dicha aplicación para añadir usuarios a la lista de correo.

## Entorno de desarrollo
Para el desarrollo del proyecto se ha utilizado:
1. Netbeans 8.2 para el desarrollo de la clase encargada de la interfaz gráfica.
2. Apache Tomcat 9.0.14.
3. Eclipse IDE for Enterprise Java Developers 4.10.0
4. Java 7.0

## Acerca del desarrollo
En general el desarrollo del presente proyecto no ha sido excesivamente complicado a partir de la documentación de Prado, exceptuando los problemas generados en su puesta en marcha por el IDE y el servidor Tomcat.
Como se ha comenatdo en primer lugar se desarrolló la clase Interfaz.java en Netbeans haciendo uso de la herramienta de desarrollo de interfaz gráfica para Java y posteriormente fue exportada a Eclipse. Una vez ver se logró ejecutar el Servlet sin errores se completaron las distintas funciones a partir de la documentación encontrada en Prado y otras fuentes.

## Vídeo
En el siguiente enlace de YouTube se muestra el uso del proyecto insertando, actualizando y eliminando usuarios de las tablas:
[https://www.youtube.com/watch?v=ziRV5Jcdaks&feature=youtu.be](https://www.youtube.com/watch?v=ziRV5Jcdaks&feature=youtu.be)
