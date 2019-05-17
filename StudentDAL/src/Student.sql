USE projectdb;
CREATE TABLE IF NOT EXISTS studenttab(
id INT PRIMARY KEY AUTO_INCREMENT,
sname VARCHAR(20),
scourse VARCHAR(30),
sfee INT);
SELECT * FROM studenttab;
DROP TABLE studenttab;