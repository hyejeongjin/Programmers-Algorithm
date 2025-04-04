-- 코드를 입력하세요
SELECT B.BOOK_ID, A.AUTHOR_NAME, DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') PUBLISHED_DATE
FROM BOOK B LEFT JOIN AUTHOR A
ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE B.CATEGORY LIKE '경제'
ORDER BY DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') ASC;