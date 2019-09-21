CREATE TABLE CONTACT
(
    id        SERIAL PRIMARY KEY,
    firstname VARCHAR(30) NOT NULL,
    lastname  VARCHAR(30) NOT NULL,
    telephone VARCHAR(15) NOT NULL,
    email     VARCHAR(30) NOT NULL,
    login     VARCHAR(15) NOT NULL,
    password  VARCHAR(15) NOT NULL,
    role      VARCHAR(5) NOT NULL,
    created   TIMESTAMP NOT NULL
);