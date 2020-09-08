CREATE TABLE IF NOT EXISTS tbl_position (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(250) NOT NULL
);

CREATE TABLE IF NOT EXISTS tbl_profile (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(250) NOT NULL
);

CREATE TABLE IF NOT EXISTS tbl_uers (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  CPF VARCHAR(250) NOT NULL,
  gender VARCHAR(250) NOT NULL,
  birthday VARCHAR(250) NOT NULL,
  position VARCHAR(250) NOT NULL,
  profile VARCHAR(250) NOT NULL,
  status BIT DEFAULT TRUE
);

INSERT INTO tbl_position VALUES (1, 'Gerente');
INSERT INTO tbl_position VALUES (2, 'Supervisor');
INSERT INTO tbl_position VALUES (3, 'Técnico');
INSERT INTO tbl_position VALUES (4, 'Analista');

INSERT INTO tbl_profile VALUES (1, 'administrador');
INSERT INTO tbl_profile VALUES (2, 'comum');

INSERT INTO tbl_uers VALUES (1, 'Fulano de Tal', '26365789203', 'Homem', '05/09/1977', 'Supervisor', 'administrador', true);