CREATE TABLE products (
                          id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
                          name VARCHAR(255) NOT NULL,
                          category VARCHAR(255) NOT NULL,
                          price DOUBLE PRECISION NOT NULL
);