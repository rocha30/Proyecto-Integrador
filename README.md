## Proyecto Integrador: API REST de Usuarios
Este proyecto es una API REST que permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre usuarios. Utiliza Spring Boot y Java para construir la aplicación, y un HashMap para simular la persistencia de datos en memoria.

### Funcionalidades
GET /users/{userId}: Obtiene la información de un usuario por su ID.
POST /users: Crea un nuevo usuario.
PUT /users/{userId}: Actualiza la información de un usuario existente.
DELETE /users/{userId}: Elimina un usuario existente.
### Configuración del Proyecto
Clonar el Repositorio: Clona este repositorio en tu máquina local utilizando el siguiente comando:

git clone https://github.com/tu-usuario/proyecto-api-usuarios.git
#### Importar el Proyecto: Importa el proyecto en tu IDE de Java (por ejemplo, IntelliJ IDEA, Eclipse).

#### Ejecutar la Aplicación: Ejecuta la aplicación desde tu IDE o utilizando Maven. La aplicación se ejecutará en el puerto predeterminado 8080.

### Uso de la API
Puedes utilizar cualquier cliente HTTP, como Postman, para probar los endpoints de la API. A continuación, se muestran algunos ejemplos:

#### GET /users/{userId}: Obtiene la información de un usuario por su ID.

GET http://localhost:8080/users/1
#### POST /users: Crea un nuevo usuario.

POST http://localhost:8080/users
Content-Type: application/json

{
"firstName": "John",
"lastName": "Doe",
"email": "john.doe@example.com"
}
#### PUT /users/{userId}: Actualiza la información de un usuario existente.

PUT http://localhost:8080/users/1
Content-Type: application/json

{
"firstName": "John",
"lastName": "Smith",
"email": "john.smith@example.com"
}
#### DELETE /users/{userId}: Elimina un usuario existente.

DELETE http://localhost:8080/users/1
Contribuciones
¡Las contribuciones son bienvenidas! Si deseas contribuir a este proyecto, por favor abre un problema o envía una solicitud de extracción.

Licencia
Este proyecto está licenciado bajo la Licencia MIT.