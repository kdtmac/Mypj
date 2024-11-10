-- 确保数据库和表存在
CREATE DATABASE IF NOT EXISTS demo;
USE demo;

-- 创建表
CREATE TABLE IF NOT EXISTS products (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        name VARCHAR(255) NOT NULL,
                                        price DECIMAL(10, 2) NOT NULL,
                                        description TEXT
);

-- 检查表中是否存在数据
SET @row_count = (SELECT COUNT(*) FROM products);
