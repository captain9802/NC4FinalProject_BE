INSERT IGNORE INTO member (password, role, user_nickname, username, wannabe_teacher, created_at, modified_at)
VALUES ('$2a$12$anLXoztRzTwiDhxX9ZMrs.1Y/dusENJGAjHWDdFwfmI6w0omaGa12', 'ADMIN', 'admin', 'admin@mail.com', false, NOW(), NOW());

INSERT IGNORE INTO member (password, role, user_nickname, username, wannabe_teacher, created_at, modified_at)
VALUES ('$2a$12$anLXoztRzTwiDhxX9ZMrs.1Y/dusENJGAjHWDdFwfmI6w0omaGa12', 'RESIGNED', 'test1', 'test1@mail.com', false, NOW(), NOW());
