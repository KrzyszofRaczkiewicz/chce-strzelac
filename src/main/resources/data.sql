DROP TABLE IF EXISTS strzelnice;

create table strzelnice (
      id INT NOT NULL AUTO_INCREMENT,
      name VARCHAR(100) NOT NULL,
      description VARCHAR(300) NOT NULL,
      url VARCHAR(100) NOT NULL,
      email VARCHAR(100) NOT NULL,
      telefon VARCHAR(25) NOT NULL,
      iloscStanowisk INT NOT NULL,
      dlugoscOsiMin INT NULL,
      dlugoscOsiMax INT NULL,
      godzinyOtwarcia VARCHAR(15) NOT NULL,
      dostępneDni VARCHAR(100) NOT NULL,
      status INT NOT NULL,
      PRIMARY KEY (id)
      )
