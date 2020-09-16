
/* 일별 접속자수 */
SELECT SUBSTR(createDate, 1, 8) AS date, COUNT(DISTINCT(userID)) AS cnt
FROM requestinfo
WHERE requestCode = 'L' 
	AND createDate BETWEEN #{beginMonth} AND #{endMonth}
GROUP BY SUBSTR(createDate, 1, 8)
ORDER BY SUBSTR(createDate, 1, 8);

/* 월별 일평균 로그인 수 */
SELECT SUBSTR(loginDay, 1, 6) AS date, AVG(loginCnt) AS cnt
FROM(
	SELECT SUBSTR(createDate, 1, 8) AS loginDay, COUNT(*) AS loginCnt
	FROM REQUESTINFO
	WHERE requestCode = 'L'
		AND createDate BETWEEN #{beginMonth} AND #{endMonth}
	GROUP BY SUBSTR(createDate, 1, 8)
	ORDER BY SUBSTR(createDate, 1, 8)
) AS tmp
GROUP BY SUBSTR(loginDay, 1, 6);

/* 월별 휴일 제외 로그인 수 */
SELECT SUBSTR(createDate, 1, 6) AS date, COUNT(*) AS cnt
FROM (
	SELECT createDate, dayofweek(SUBSTR(createDate, 1, 8)) AS weekday
	FROM REQUESTINFO
	WHERE requestCode = 'L'
   		AND createDate BETWEEN #{beginMonth} AND #{endMonth}
) AS tmp
WHERE weekday != 1 AND weekday != 7
GROUP BY SUBSTR(createDate, 1, 6)
ORDER BY date;
 
/* 부서 별 로그인 수 */
SELECT * , RANK() OVER (ORDER BY totalLoginCnt DESC) AS deptRank
FROM (
	SELECT u.HR_DEPT, COUNT(*) AS totalLoginCnt
	FROM REQUESTINFO AS r, USER AS u
	WHERE r.userID = u.userID AND r.requestCode = 'L' AND SUBSTR(createDate, 1, 6) = #{month}
	GROUP BY u.HR_DEPT
) AS counts
ORDER BY deptRank;