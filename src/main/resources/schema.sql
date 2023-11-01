DROP TABLE IF EXISTS spring_quickly.purchase;
CREATE TABLE spring_quickly.purchase
(
   ID INT auto_increment PRIMARY KEY,
   product VARCHAR (255),
   price numeric
   (
      20,
      2
   )
);