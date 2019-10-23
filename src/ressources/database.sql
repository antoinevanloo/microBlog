"""
You have successfully created a new database. The details are below.

Username: Ga7cBbDj3s

Database name: Ga7cBbDj3s

Password: X3g9wavyUF

Server: remotemysql.com

Port: 3306

These are the username and password to log in to your database and phpMyAdmin
"""

CREATE DATABASE  blog;
use blog;

CREATE TABLE utilisateur(
);

CREATE TABLE categorie(
	idCategorie INT NOT NULL AUTO_INCREMENT,
	libelle VARCHAR(255) NOT NULL,
	CONSTRAINT PK_categorie_id PRIMARY KEY (idCategorie)
);

CREATE TABLE article(
	idArticle INT NOT NULL AUTO_INCREMENT,
	datePublication date NOT NULL,
	contenu VARCHAR(255),
	categotieId INT NOT NULL,
	personneId INT NOT NULL,
	CONSTRAINT PK_article_id PRIMARY KEY (idArticle),
	CONSTRAINT FK_categorie_id FOREIGN KEY (categotieId) REFERENCES categorie(idCategorie),
	CONSTRAINT FK_personne_id FOREIGN KEY (personneId) REFERENCES personne(idPersonne)
);

CREATE TABLE droit(
	idDroit INT NOT NULL AUTO_INCREMENT,
	libelle VARCHAR(255) NOT NULL,
	CONSTRAINT PK_droit_id PRIMARY KEY (idDroit)
);

CREATE TABLE personne(
	idPersonne INT NOT NULL AUTO_INCREMENT,
	motDePasse VARCHAR(255),
	nom VARCHAR(255) NOT NULL,
	prenom VARCHAR(255) NOT NULL,
	CONSTRAINT PK_article_id PRIMARY KEY (idPersonne)
);

create table personne_droit(
  idPersonne int not null,
  idDroit int null,
  primary key (id_utilisateur, id_droit),
  foreign key fk_utilisateur(idPersonne) references personne(idPersonne),
  foreign key fk_droit(idDroit) references droit(idDroit)
) engine = InnoDB;



insert into droit (libelle)
values
('utilisateur'),
('administrateur');


INSERT INTO `article` (`idArticle`, `datePublication`, `contenu`, `categotieId`, `personneId`) VALUES ('1', '2019-10-23', 'Le Lorem Ipsum est simplement du faux texte employé dans la composition et la ', '1', '1');