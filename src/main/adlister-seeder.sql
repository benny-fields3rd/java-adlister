use adlister_db;

INSERT INTO users (username, email, password)
VALUES ('user1', 'user1@gmail.com', 'password'),
       ('user2', 'user2@msn.com', 'password');

SELECT * FROM ads;

INSERT INTO ads (user_id, title, description) VALUES
(1, 'Cars', 'Test description'),
(2, 'Dogs', 'Test description2'),
(2, 'Cars', 'Test description3');

SELECT * FROM ads;
