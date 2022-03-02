INSERT INTO company (id, name) VALUES
                                  (1, 'Apple'),
                                  (2, 'Google');

SELECT setval('company_id_seq', (SELECT MAX(id) FROM company));