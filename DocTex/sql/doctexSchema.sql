DROP TABLE IF EXISTS save_files;
DROP TABLE IF EXISTS templates;
DROP TABLE IF EXISTS template_types;
DROP TABLE IF EXISTS users;


CREATE TABLE IF NOT EXISTS users(
	user_id		VARCHAR(20) NOT NULL,
	password	VARCHAR(20) NOT NULL,
	email		VARCHAR(100) NOT NULL,
	
	PRIMARY KEY (user_id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS template_types(
	type_id		INT unsigned NOT NULL AUTO_INCREMENT,
	type_name	VARCHAR(20) NOT NULL,

	PRIMARY KEY (type_id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS templates(
	temp_id		INT unsigned NOT NULL AUTO_INCREMENT,
	type_id		INT unsigned NOT NULL,
	temp_name	VARCHAR(20) NOT NULL,
	pathname	VARCHAR(200) NOT NULL,

	PRIMARY KEY (temp_id),
	FOREIGN KEY (type_id) REFERENCES template_types(type_id)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS save_files(
	file_id		BIGINT unsigned NOT NULL AUTO_INCREMENT,
	user_id		VARCHAR(20) NOT NULL,
	temp_id		INT unsigned NOT NULL,
	filename	VARCHAR(20) NOT NULL,
	pathname	VARCHAR(200) NOT NULL,

	PRIMARY KEY (file_id),
	FOREIGN KEY (user_id) REFERENCES users(user_id),
	FOREIGN KEY (temp_id) REFERENCES templates(temp_id)
) ENGINE = InnoDB;