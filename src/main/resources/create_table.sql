CREATE TABLE CONTACT
(
    id        SERIAL PRIMARY KEY,
    firstname VARCHAR(30),
    lastname  VARCHAR(30),
    telephone VARCHAR(15),
    email     VARCHAR(30),
    login     VARCHAR(15),
    password  VARCHAR(15),
    created   TIMESTAMP DEFAULT NOW()
);