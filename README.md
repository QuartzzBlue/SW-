# 직무부트캠프_SW백엔드과정

---

> 1주차 주간보고

### 1. 산출물 관리

- **Github 계정 및 해당 Repository 생성**
    - Github 계정 생성 > 기존 Github 계정 재사용 (완료)
    - Repository 생성 (완료)

### 2. 개발환경 셋팅

- **JDK, Eclipse, Tomcat 환경 설정**
    - JDK 1.8 설치 및 환경설정 (완료)
    - Eclipse (2019-06) 설치 및 환경설정 (완료)
    - Tomcat 9.0 설치 및 환경설정 (완료)
- **MariaDB 설치**
    - 로컬 하드드라이브에 MariaDB 설치 (완료)
        - 포트 3360으로 설정 (MySQL 포트 3306 사용 중)
    - Database IDE 설치 > MariaDB호환 가능한 MySQL Workbench 8.0 설치 (완료)
- **샘플 데이터 생성**
    - theater 스키마(Default Schema) 생성 (완료)
    - movie 테이블 생성 및 샘플 데이터 생성 (완료)
- **스프링과 스프링 부트 환경 설정 및 검토**
    - 스프링 5.2.8 환경설정
        - STS 플러그인 설치 > Spring Tools 3 (3.9.11 RELEASE) 설치 (완료)
        - Maven 의존 라이브러리 버전 관리 > 최신 버전 5.2.8로 업그레이드 (완료)
        - 디팬던시 추가 > MariaDB, MyBatis, log4j 디팬던시 추가 (완료)
        - DB 연결정보 설정 (완료)
        - 스프링 MVC  디자인 패턴 구현
            - Service, DAO, VO 객체 구현 (완료)
            - Controller 객체 구현 (완료)
            - JSP 파일 생성 (완료)
        - 클라이언트 화면에 movie 테이블 출력 (완료)
        - [이슈] root-context.xml 에서 `<context:component-scan>` 태그 오류
            - <bean> 루트 엘리먼트에 xml 스키마 정보 추가 (해결)
    - 스프링 부트 환경설정 (예정)

### 3. 기타

- 개발 과정 내용 기록
    - Notion으로 관리 (진행)
