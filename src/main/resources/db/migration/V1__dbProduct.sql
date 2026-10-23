CREATE TABLE categories (
                            id BIGSERIAL PRIMARY KEY,
                            name VARCHAR(100) NOT NULL UNIQUE,
                            description TEXT,
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE brands (
id BIGSERIAL PRIMARY KEY,
name VARCHAR(100) NOT NULL UNIQUE,
description TEXT,
logo_url VARCHAR(255),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE products (
id BIGSERIAL PRIMARY KEY,
seller_id BIGINT NOT NULL,
brand_id BIGINT,
name VARCHAR(255) NOT NULL,
description TEXT,
price NUMERIC(12, 2) NOT NULL CHECK (price >= 0),
stock INT NOT NULL CHECK (stock >= 0),
is_active BOOLEAN DEFAULT TRUE NOT NULL,
creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,

CONSTRAINT fk_products_brand
FOREIGN KEY (brand_id)
REFERENCES brands(id)
ON DELETE SET NULL
);

CREATE TABLE product_categories (
product_id BIGINT NOT NULL,
category_id BIGINT NOT NULL,

PRIMARY KEY (product_id, category_id),

CONSTRAINT fk_product_categories_product
FOREIGN KEY (product_id)
REFERENCES products(id)
ON DELETE CASCADE,

CONSTRAINT fk_product_categories_category
FOREIGN KEY (category_id)
REFERENCES categories(id)
ON DELETE CASCADE
);