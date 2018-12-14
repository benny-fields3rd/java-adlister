use adlister_db;

INSERT INTO users (username, email, password)
VALUES ('user1', 'user1@gmail.com', 'password'),
       ('user2', 'user2@msn.com', 'password');

SELECT * FROM ads;

INSERT INTO ads (user_id, title, description) VALUES
(1, 'Apple MacBooks for sale!', 'Used MacBooks in great condition'),
(2, 'Dogs', 'Rottweilers bred for you! '),
(2, 'Tesla', 'Model 3 for sale!');

SELECT * FROM ads;
