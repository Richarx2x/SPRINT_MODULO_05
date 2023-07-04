# SPRINT_MODULO_05
Bootcamp Awakelab: Tareas grupales + Sprint final módulo 05

- Aracely Morales
- Mauricio Morales
- Ricardo Cea
- Eduardo Torres
- Simon Zelada

------------------------
Enlace repositorio remoto:
https://github.com/Richarx2x/SPRINT_MODULO_05.git
------------------------

Este proyecto es un ejemplo de una aplicación web que utiliza servlets, DTO y DAO para interactuar con una base de datos SQL para atender los requerimientos que se señalan en el contexto.

Archivos
El proyecto contiene los siguientes archivos:

login.jsp: Archivo JSP que muestra el formulario de inicio de sesión y valida las credenciales del usuario.
index.jsp: Archivo JSP principal de la aplicación. Muestra un listado de opciones y redirige a diferentes páginas según la selección del usuario.
usuario.jsp: Archivo JSP que permite ingresar un usuario y contraseña y acceder al index.jsp.
listados.jsp: Archivo JSP que muestra un listado de registros según la opción seleccionada por el usuario.
modificacion.jsp: Archivo JSP que permite modificar registros en la base de datos.
contacto.jsp: Archivo JSP que muestra un formulario de contacto con campos como nombre, rut, correo electrónico, teléfono y mensaje.
procesar-contacto.jsp: Archivo JSP que procesa los datos enviados desde el formulario de contacto y realiza las acciones necesarias.
styles.css: Archivo CSS que define los estilos visuales para los archivos JSP.
Servlets
En este proyecto, los servlets se utilizan para manejar las diferentes acciones y lógica de la aplicación. Algunos servlets importantes incluyen:

LoginServlet: Se encarga de validar las credenciales de inicio de sesión y redirigir al usuario a la página principal (index.jsp) si las credenciales son correctas.
ListadosServlet: Recibe la opción seleccionada por el usuario desde index.jsp y muestra los registros correspondientes según esa opción.
ModificacionServlet: Maneja las solicitudes de modificación de registros en la base de datos y actualiza los datos correspondientes.
ContactoServlet: Procesa los datos enviados desde el formulario de contacto en contacto.jsp y realiza las acciones necesarias, como enviar un correo electrónico o almacenar los datos en la base de datos.
DTO y DAO

Los DTO (Data Transfer Objects) se utilizan para representar los datos de los objetos en la aplicación. Algunos DTO importantes en este proyecto son:

UserDTO: Representa los datos de un usuario, incluyendo el ID, nombre de usuario y contraseña.
ClteDTO: Representa los datos de un cliente, incluyendo el nombre, apellido, correo electrónico, teléfono, etc.
ProfDTO: Representa los datos de un profesional, incluyendo el nombre, apellido, correo electrónico, teléfono, cargo, etc.
Los DAO (Data Access Objects) se utilizan para acceder y manipular los datos en la base de datos. Proporcionan métodos para realizar operaciones como la inserción, actualización y consulta de registros. Algunos DAO importantes en este proyecto son:

UserDAO: Proporciona métodos para acceder a los datos de los usuarios en la base de datos.
ClteDAO: Proporciona métodos para acceder a los datos de los clientes en la base de datos.
ProfDAO: Proporciona métodos para acceder a los datos de los profesionales en la base de datos.


Conexión con la Base de Datos SQL
Este proyecto se conecta a una base de datos SQL utilizando JDBC (Java Database Connectivity). La configuración de la conexión se realiza en un archivo de configuración, que contiene la URL de la base de datos, el nombre de usuario y la contraseña. La conexión se establece en los DAO correspondientes, donde se utilizan los métodos de JDBC para ejecutar consultas y manipular los datos en la base de datos.


CONTEXTO

En la última década, han aumentado los índices de accidentabilidad, especialmente en las
empresas del rubro industrial, minero y construcción. Las cifras son alarmantes, a pesar de las
leyes y normativas que obligan a las empresas a tomar todaslas medidas necesarias para proteger
la vida y salud de los trabajadores. Para dar cumplimiento a la normativa y mantener ambientes
de trabajo seguros, muchas empresas se ven en la obligación de contratar asesoría profesional,
lo cual representa un costo elevado y fomenta la disminución o la no implementación de medidas
necesarias para la seguridad. Muchas de las empresas que han optado por no invertir en asesoría
preventiva, se ven expuestas a aplicación de multas de las entidades fiscalizadoras, gastos por
días perdidos en accidentabilidad, bajas en la producción, alzas en el pago de cotizaciones (al
organismo administrador del seguro de accidentes del trabajo, ley 16.744), entre otros. Además,
hay que considerar posibles demandas y pagos de indemnizaciones a lostrabajadores y familiares
afectados por accidentes del trabajo.
Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos
laborales y necesita una solución tecnológica que ayude a administrar los procesos que se deben
ejecutar en cada una de las empresas que son clientes de la compañía. Este servicio finalmente
pretende ofrecer una solución completa en prevención de riesgos para las empresas a un costo
razonable, cumpliendo estrictamente todos los procesos necesarios para dar cumplimiento a la
normativa vigente, mejorando los ambientes de trabajo, la productividad, contribuyendo a un
ahorro económico.

PROBLEMA
La empresa no posee un sistema de información que le permita administrar toda la cantidad de
información que se genera, ni controlar las actividades y el recurso humano. Existen problemas
con la planificación de las visitas, generalmente los profesionales están en terreno por lo que no

están disponibles para informarles sus actividades futuras. No existe registro del profesional que
ha estado con mayor actividad ni se sabe dónde está cada uno.
Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación con el cliente.
Asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina la ejecución de
la capacitación, lo que trae consigo multas para la empresa. No se tiene un control de los clientes
que pagan y los que no, lo que hace que muchas actividades de los profesionales corran por
cuenta de la empresa, generando desbalances financieros. Las actividades se registran en
carpetas lo que dificulta el seguimiento de las asesorías y el resumen de resultados por empresa.
Además, generalmente no se cumplen c iertas actividades de control de implementación de
soluciones y a veces no se ha cumplido con la dirección del trabajo, lo que genera multas para los
clientes, bajando la calidad del servicio. Los profesionales que han atendido la empresa
esporádicamente han variado, no existiendo un registro de la totalidad de actividades preventivas
realizadas y no se tiene certeza de los avances.

SOLUCIÓN
Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio descritos y
que proponga una mejora en la gestión, el control, la seguridad, y disponibilidad de información
para la empresa y sus clientes. El sistema debe permitir la planificación de actividades y el control
de ejecución de éstas, la gestión de clientes, la coordinación entre la empresa, los profesionales
y los clientes para la respuesta temprana ante incidentes de seguridad. Además, se requiere que
el sistema genere reportes y estadísticas que ayuden a tomar de decisiones y mejorar el
rendimiento de la empresa, considerando la carga laboral, y la demanda de clientes y las
actividades que cada uno involucra para el cumplimiento de los contratos. Es imprescindible,
mantener comunicación con los profesionales en todo momento, aún en terreno, y darle la
posibilidad de realizar todas sus actividades aun no teniendo conectividad (internet), ya que
muchas empresas se encuentran en zonas donde no hay conexión de ese tipo.

DESARROLLO
Una empresa de asesorías en prevención de riesgos necesita contar con un sistema de información
que le permita administrar los principales procesos que se llevan a cabo en ella día a día.
Hasta el momento se han definido las siguientes funcionalidades en el sistema:
ID Nombre Detalle Actor(es)
1 Inicio Página de inicio del portal con
información relevante del proyecto
que se está realizando.

Cliente /
Administrativo /
Profesional

2 Contacto Formulario de contacto para realizar

consultas.

Cliente
3 Crear Capacitación Formulario para crear una
capacitación en el sistema.

Cliente

4 Listar Capacitaciones Listado de capacitaciones
registradas.

Cliente

5 Listado de Usuarios Listado con los usuarios existentes

enplataforma.

Administrativo

6 Crear Usuario Formulario que permitirá crear un

usuario en sistema.

Administrativo

7 Editar Cliente Formulario que permite modificar los
datos de un usuario de tipo cliente.

Administrativo

8 Editar Administrativo Formulario que permite modificar
losdatos de un usuario
de tipo
administrativo.

Administrativo

9 Editar Profesional Formulario que permite modificar
losdatos de un usuario
de tipo
profesional.

Administrativo

10 Listado Visitas Lista de todas las visitas realizadas a
cada uno de los clientes. Además,
posee un formulario que permite
agregar nuevas visitas a sistema.

Profesional

11 Responder checklist Listado de chequeos de una visita. Profesional
12 Listado Pago Lista de todoslos pagosrealizados por

los clientes.

Administrativo
13 Crear Pago Permitirá agregar un pago al sistema. Administrativo
14 Listado Asesorías Lista con las asesoríasrealizadas hasta

el momento.

Profesional

15 Crear Asesorías Contiene un formulario para agregar

una nueva asesoría.

Profesional
16 Reportes Despliega reportes específicos. Profesional
17 Administrar Asistentes Administración de asistentes a una
capacitación; incluye listarlos,
poder
agregar asistentes y eliminarlos.

Cliente

18 Login Contendrá un acceso a un usuario
alportal a través de un RUT de
usuario y
una clave.

Cliente /
Administrativo /
Profesional

19 Gestionar accidentes Listado con todos los accidentes
registrados en plataforma. Además,
permite editarlos, agregar uno nuevo
y eliminarlos. En esta sección cada
cliente administra sus propios
accidentes.

Cliente

20 Administrar chequeos Permite mostrar los distintos
chequeos realizados a cada cliente
en
una visita a terreno, y permite
agregaruno nuevo, y cambiar su
estado.

Administrativo

En los ejercicios del presente módulo, se crearon servlets para los siguientes casos de uso:
- Inicio
- Contacto
- Crear Capacitación

- Listar Capacitación
- Login
- Listado de Usuarios
- Crear Usuario

Algunos de ellos ya fueron implementados en ejercicios anteriores. Como parte de este ejercicio
se pide realizar lo siguiente:
- Actualice los componentes del caso de uso “Crear Usuario”, permitiendo que se pueda
registrar un usuario en la base de datos. Considere que un usuario puede ser un cliente,
un administrativo o un profesional, por lo que ese dato se debe solicitado, y generar
una funcionalidad que solicite los datos de un usuario según su tipo.
- Agregue funcionalidad a los servlets correspondientes a los casos de uso Editar Cliente,
Editar Administrativo y Editar Profesional. Recuerde que a estos casos de uso se accede
desde el listado de usuarios, desplegando el formulario adecuado según el tipo.
- Actualice el servlet correspondiente al caso de uso “Contacto”. En este caso de uso se
debe desplegar el formulario de contacto; una vez que se procese el formulario, se debe
llamara un método que despliegue los datos ingresados a través de la consola de Java.
En este ejercicio se pide entregar como evidencia el despliegue del proyecto en un servidor. Por
tanto, se pide entregar en un documento Word al menos cuatro fotos que demuestren que el
proyecto fue probado exitosamente en un ambiente local. Es importante considerar que en este
archivo Word se deben indicar los nombres de los integrantes del equipo que desarrolla el
trabajo.
Consideraciones generales
- Puede realizar las mejoras que considere pertinentes al modelo de datos obtenido en
ejercicios anteriores.
- Debe adjuntar a la entrega el modelo de datos utilizado en la solución en base a un
archivoSQL.
- Todas las páginas deben ser responsivas. Se pide como mínimo una definición de
estilospara tres dispositivos distintos.
- Todas las páginas deben compartir la misma hoja de estilos. Considere que todas
laspáginas deben tener el mismo diseño (colores, fuentes, tamaños).
- Se puede tener uno o más archivos JS. Cada archivo JS debe ir debidamente
comentado,indicando la función en el proyecto.
- Se solicita que cada alumno disponga, en un repositorio personal de tipo público, el
códigoperteneciente al proyecto.
- El proyecto debe incluir un archivo README.txt, en el cual debe hacer alusión a todo lo
que se necesite saber del proyecto: nombre de los integrantes, ruta de los repositorios
enGitHub de cada alumno, un resumen del proyecto, y aquellos aspectos que el equipo
considere relevante indicar.
- El sitio debe ser navegable, esto significa que debe existir la manera de poder moverse
entre distintos sitios a través de un menú de tipo compartido entre todas las páginas.

Requerimientos de los participantes

Conocimientos previos
 HTML
 Hojas de estilo
 Responsividad
 Javascript
 JEE
 Servlets
 Bases de datos
 Java Server Pages
 Tomcat

Actitudes para el trabajo
 Cumplimiento de plazos
 Diseño y Estructura
 Trabajo en equipo

Valores
Tiempo de
resolución.
Enfoque al
requerimiento.
Estructura de
Solución.

Objetivo General de Aprendizaje El participante al finalizar el proyecto será capaz de:
Desarrollar un sitio web dinámico bajo el patrón de
diseño MVC, conectándose a una base de datos Oracle.

Objetivos particulares

- HTML
- Hojas de estilo
- Responsividad
- Utilización de plataformas de almacenamiento y
versionamiento en línea
- Servlets
- JSP
- Bases de datos

Duración del proyecto 2 jornadas de clases
Tips o listado de Preguntas Guía

Productos para obtener durante la realización del proyecto

- Un proyecto Java Web Dinámico. Debe incluir clases java, interfaces, archivos JSP, hojas
de estilo, scripts, y todos aquellos elementos que sean necesarios para su despliegue en
un servidor de aplicaciones.
- Un archivo de extensión SQL con el script de creación de la base de datos. En el script
debe incluir al menos tres registros en cada tabla.
- Un archivo Readme.txt con todo lo que se necesite saber del proyecto: nombre de los
integrantes, ruta de los repositorios en GitHub de cada alumno, un resumen del
proyecto, y aquellos aspectos que el equipo considere relevante indicar.
- Un repositorio en Github de tipo público con el contenido del proyecto. Cada integrante
del equipo debe tener un repositorio diferente, independiente de que el código sea el
mismo.

Especificaciones de desempeño

Deberá realizar la actividad según requerimientos técnicos; el resultado deberá ser entregado
de acuerdo con lo indicado en el punto anterior, acompañado por archivo de texto plano
Readme.txt, contextualizando el problema y planteamiento de la solución. La solución deberá
ser gestionada a repositorio Github, a fin de que cada alumno vaya generando un repositorio
documental.
