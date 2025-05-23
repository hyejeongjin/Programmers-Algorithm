-- 코드를 입력하세요
# SELECT *
# FROM CART_PRODUCTS JOIN (SELECT NAME, CART_ID, COUNT(CART_ID) FROM CART_PRODUCTS GROUP BY CART_ID) AS JOIN_TABLE ON CART_PRODUCTS.NAME = JOIN_TABLE.NAME
# WHERE CART_PRODUCTS.NAME IN ('Yogurt', 'Milk')
# AND NOT CART_PRODUCTS.NAME <> JOIN_TABLE.NAME


# SELECT CART_ID, NAME, COUNT(CART_ID)
# FROM CART_PRODUCTS
# WHERE NAME IN (SELECT NAME
#                FROM CART_PRODUCTS
#                WHERE NAME IN ('Milk', 'Yogurt'))
# GROUP BY CART_ID
# HAVING COUNT(NAME) >= 2
# ORDER BY CART_ID

SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME IN ('Yogurt', 'Milk')
GROUP BY CART_ID
HAVING COUNT(DISTINCT NAME) >= 2


