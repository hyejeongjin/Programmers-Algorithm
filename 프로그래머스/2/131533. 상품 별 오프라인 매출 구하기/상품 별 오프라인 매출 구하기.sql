-- 코드를 입력하세요
SELECT P.PRODUCT_CODE, SUM(P.PRICE * O.SALES_AMOUNT) SALES
FROM OFFLINE_SALE O LEFT JOIN PRODUCT P
ON O.PRODUCT_ID = P.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY SUM(P.PRICE * O.SALES_AMOUNT) DESC, P.PRODUCT_CODE ASC;