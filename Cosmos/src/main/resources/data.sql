INSERT INTO `cosmos`.`users` (`id`, `email`, `first_name`, `image_urls`, `is_active`, `last_name`, `password`, `age`, `monthly_income`, `user_type`)
VALUES ('1', 'adi@example.com', 'Adelina', 'null', 1, 'Sofronieva', '78ce976db3d3cd7533a675a197df82537af8e31db4f761858afc9627d077413fd8394631c02e4a58', 33, 50000, 'adult');

INSERT INTO `cosmos`.`user_types` (`id`, `user_type`)
VALUES ('1', 'child'),
    ('2', 'adult'),
    ('3', 'retired'),
    ('4', 'notSuitable');

INSERT INTO `cosmos`.`user_roles`
VALUES (1, 'Admin');

INSERT INTO `cosmos`.`users_user_roles`
VALUES (2, 1);
