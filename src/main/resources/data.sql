DROP TABLE IF EXISTS billionaires;

CREATE TABLE billionaires (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              model VARCHAR(250) NOT NULL,
                              enginer int(250) NOT NULL,
                              kolor VARCHAR(250) DEFAULT NULL
);

INSERT INTO billionaires (model, enginer, kolor) VALUES
                                                             ('Ford', '8.0', 'Niebieski'),
                                                             ('Bill', '8', 'Billionaire Tech Entrepreneur'),
                                                             ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');