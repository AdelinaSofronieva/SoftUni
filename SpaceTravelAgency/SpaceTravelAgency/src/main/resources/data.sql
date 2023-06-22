INSERT INTO `space_travel_agency`.`users` (`id`, `email`, `first_name`, `image_urls`, `is_active`, `last_name`, `password`, `age`, `monthly_income`, `user_type`)
VALUES ('1', 'adi@example.com', 'Adelina', 'null', 1, 'Sofronieva', '52ffdc166e8695e8c156207a936a4b5441ee447ed3b09ca72e', 33, 50000, 'adult');

INSERT INTO `space_travel_agency`.`user_types` (`id`, `user_type`)
VALUES ('1', 'child'),
    ('2', 'adult'),
    ('3', 'retired'),
    ('4', 'notSuitable');
