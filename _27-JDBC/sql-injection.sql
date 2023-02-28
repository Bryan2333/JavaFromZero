CREATE TABLE `admin`
(
    `name` VARCHAR(30) NOT NULL UNIQUE,
    `pwd`  VARCHAR(30) NOT NULL DEFAULT ''
) CHARSET utf8mb4;

INSERT INTO admin (name, pwd)
VALUES ('tom', '123');

SELECT *
FROM admin
WHERE name = 'tom' AND pwd = '123';

