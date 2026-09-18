CREATE TABLE categorias (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    descripcion TEXT,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE marcas (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    descripcion TEXT,
    url_logo VARCHAR(255),
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE productos (
    id BIGSERIAL PRIMARY KEY,
    id_vendedor BIGINT NOT NULL,
    id_marca BIGINT,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    precio NUMERIC(12, 2) NOT NULL CHECK (precio >= 0),
    stock INT NOT NULL CHECK (stock >= 0),
    esta_activo BOOLEAN DEFAULT TRUE NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    CONSTRAINT fk_productos_marca
        FOREIGN KEY (id_marca)
        REFERENCES marcas(id)
        ON DELETE SET NULL
);

CREATE TABLE productos_categorias (
    id_producto BIGINT NOT NULL,
    id_categoria BIGINT NOT NULL,
    PRIMARY KEY (id_producto, id_categoria),
    CONSTRAINT fk_pc_producto FOREIGN KEY (id_producto) REFERENCES productos(id) ON DELETE CASCADE,
    CONSTRAINT fk_pc_categoria FOREIGN KEY (id_categoria) REFERENCES categorias(id) ON DELETE CASCADE
);