## Descripción
API REST desarrollada con Spring Boot 3 para gestionar catálogos de monedas y empleados utilizando H2 como base de datos en memoria.

## Requisitos
- Java 17
- Maven
- Docker (opcional)

## Ejecución Local
1. Clona el repositorio:
   ```bash
   git clone <repository-url>
2. Navegar al dictorio del proyecto
   ```bash
   cd rep-hucatmoneda-huempls
3. Ejecutar la aplicacion
   ```bash
   ./mvnw spring-boot:run
## Endpoints
 - Monedas  /api/HU_CAT_MONEDA
 - Empleados : /api/HU_EMPLS
 - Swagger UI: http://localhost:8001/swagger-ui/index.html
## Construccion de Docker
1. Construye la imagen:
   ```bash
   docker build -t moneda-empleados-api .
2. Ejecuta el contenido
   ```bash
   docker run -p 8080:8080 moneda-empleados-api
## Seguridad
- Usuario admin
- Contrseña password







   
