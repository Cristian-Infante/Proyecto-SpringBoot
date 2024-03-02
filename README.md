# Documentación API Proyecto

La API está construida con Spring Boot y utiliza una base de datos H2 en la cual persiste la información de los clientes y productos. Se exponen los siguientes endpoints para realizar operaciones CRUD sobre los clientes y productos.

La inyección se realizó en una lista tanto para clientes como para productos, estando en los archivos `ClientesService.java` y `ProductosService.java` respectivamente.


## Clientes

### Obtener Clientes
- **Método HTTP:** GET
- **URL:** `http://localhost:9090/api/clientes`
- **Descripción:** Retorna una lista de todos los clientes.

### Buscar Cliente
- **Método HTTP:** GET
- **URL:** `http://localhost:9090/api/clientes/{id}`
- **Descripción:** Retorna los detalles de un cliente específico por su ID.

### Nuevo Cliente
- **Método HTTP:** POST
- **URL:** `http://localhost:9090/api/clientes`
- **Headers:** Content-Type: application/json
- **Body:**
  ```json
  {
    "idCliente": 0,
    "razonSocial": "soft",
    "email": "contacto@soft.com"
  }
- **Descripción:** Crea un nuevo cliente con la información proporcionada en el cuerpo de la solicitud.

### Actualizar Cliente
- **Método HTTP:** PUT
- **URL:** `http://localhost:9090/api/clientes/{id}`
- **Headers:** Content-Type: application/json
- **Body:**
  ```json
  {
    "razonSocial": "soft",
    "email": "contacto@soft.com"
  }
- **Descripción:** Actualiza la información del cliente con el ID especificado.

### Eliminar Cliente
- **Método HTTP:** DELETE
- **URL:** `http://localhost:9090/api/clientes/{id}`
- **Descripción:** Elimina el cliente con el ID especificado.


## Productos

### Obtener Productos
- **Método HTTP:** GET
- **URL:** `http://localhost:9090/api/productos`
- **Descripción:** Retorna una lista de todos los productos.

### Buscar Producto
- **Método HTTP:** GET
- **URL:** `http://localhost:9090/api/productos/{id}`
- **Descripción:** Retorna los detalles de un producto específico por su ID.

### Nuevo Producto
- **Método HTTP:** POST
- **URL:** `http://localhost:9090/api/productos`
- **Headers:** Content-Type: application/json
- **Body:**
  ```json
  {
    "idProducto": 0,
    "nombre": "Producto 3",
    "precio": 200
  }
- **Descripción:** Crea un nuevo producto con la información proporcionada en el cuerpo de la solicitud.

### Actualizar Producto
- **Método HTTP:** PUT
- **URL:** `http://localhost:9090/api/productos/{id}`
- **Headers:** Content-Type: application/json
- **Body:**
  ```json
  {
    "nombre": "Producto 3",
    "precio": 200
  }
- **Descripción:** Actualiza la información del producto con el ID especificado.

### Eliminar Producto
- **Método HTTP:** DELETE
- **URL:** `http://localhost:9090/api/productos/{id}`
- **Descripción:** Elimina el producto con el ID especificado.
  
