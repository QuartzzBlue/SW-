# 직무부트캠프_SW백엔드과정


## 1주차 주간보고


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
    - [Notion](https://www.notion.so/seul95/_-7aa48417b5c647738809afc1c78b7300)으로 관리 (진행)



---

## 2주차 주간보고


### 1. 기반 지식 이해

- HTTP 프로토콜
    - HTTP의 정의 및 특성(완료)
    - HTTP 요청/응답 메시지 구조 (완료)
- REST 아키텍쳐
    - REST 아키텍쳐의 6가지 특성 (완료)
    - REST의 3가지 구성 요소 (완료)
    - REST 사용 이유 및 장/단점 (완료)

### 2. 방문자 통계 API 가이드 문서 작성

- **문서 정보 및 서비스 개요 작성**
    - 문서 정보 작성 (완료)
    - 서비스 개요 작성 (완료)
- **API 상세 및 결과 코드표 작성**
    - 일자 별 접속자 수 API (완료)
    - 하루 평균 로그인 수 API (완료)
    - 휴일을 제외한 로그인 수 API (완료)
    - 부서 별 로그인 수 API (완료)
    - 결과 코드표 작성 (완료)
- **URI 설계 검토**
    - URI가 소문자로 작성됨 (확인)
    - URI 마지막 문자에 슬래시(/) 포함하지 않음 (확인)
    - URI에 언더바(_) 포함하지 않음 (확인)
    - Resource가 명사로 표현됨 (확인)

### 3. 기타

- 개발 과정 내용 기록
    - [Notion](https://www.notion.so/seul95/_-7aa48417b5c647738809afc1c78b7300)으로 관리 (진행)
        - 1주차 정리 완료



---

## 3주차 주간보고

### 1. 기반 지식 이해

- **스프링 프레임워크 구조 및 흐름** (진행)
⇒ [링크](https://www.notion.so/seul95/Spring-Framework-e40549d4a80945b1ab1fade4ce9f999a) 에서 확인
- **HTTP 프로토콜 및 REST 아키텍쳐** (완료)
⇒ [링크](https://www.notion.so/seul95/HTTP-REST-b4cc1e58c5c64d539b4952630016c700) 에서 확인

### 2. 테스트 통계 API 구현

- **샘플 데이터 생성**
    - `statistc` 스키마 생성 (완료)
    - 요청 정보, 요청 코드 및 사용자 테이블 생성 (완료)
    - 샘플 데이터 생성 (완료)
    → 추후 랜덤 데이터 추가 생성 예정
- **스프링 부트 환경설정**
    - [Spring.io](http://spring.io) 활용하여 라이브러리 의존성 설정 (완료)
    ⇒ Tomcat, MariaDB Driver, JSTL 라이브러리 의존성 수동 추가
    - 환경 설정 파일 작성 (완료)
        - DB 환경 설정
        - View Resolver 설정
        - Server 설정
- **RestController를 활용하여 년도별 총 로그인 수 API 구현**
    - Service, Mapper, VO 생성 (완료)
        - DAO 대신 Mapper 인터페이스 활용
    - Mapper.xml 작성 (완료)
        - MyBatis 동적 쿼리 사용
        - SUBSTR() 함수 활용하여 년도별 데이터 추출
    - Controller 구현 (완료)
        - RestController를 활용하여 응답 바디 JSON 형태로 리턴
    - POSTMAN으로 응답 확인 (완료)

### 3. 기타

- 개발 진행 과정 기록
    - [Notion](https://www.notion.so/seul95/_-7aa48417b5c647738809afc1c78b7300)으로 관리 (진행)
        - 1주차 정리 완료
        - 2주차 정리 완료



---


## 4주차 주간보고

### 1. Basic Auth 구현

- **Spring Security 이해 및 정리 (완료)**
⇒ [링크](https://www.notion.so/seul95/Spring-Security-4ca0e4152bc14890835c9981e8ac9cb1) 에서 확인
- **임시 Basic Auth 구현 (완료)**
→ 하드코딩으로 구현, 추후 디벨롭 예정

### 2. 통계 API 구현

- **SQL문 작성**
→  files 폴더 `sql_api_final.sql` 에서 확인 가능
    - 일자 별 접속자 수 SQL문 작성 (완료)
    - 하루 평균 로그인 수 SQL문 작성 (완료)
    - 휴일을 제외한 로그인 수 SQL문 작성 (완료)
    - 부서 별 로그인 수 SQL문 작성 (완료)
- **SQL문 테스트 (완료)**
- **RestController를 활용하여 API 구현**
    - Service, Mapper, VO 생성 (완료)
        - Lombok 라이브러리 활용하여 VO 메서드 생성
        - DAO 대신 Mapper 인터페이스 활용
    - Mapper.xml 작성 (완료)
    - Controller 구현 (완료)
        - RestController를 활용하여 응답 바디 JSON 형태로 리턴
        - API URI 수정
            - URI Version 1 → Version 2로 수정
            → ex) https://quartz.com/api/v2/access-cnt/day
    - POSTMAN으로 응답 확인 (완료)
- **API 가이드 문서 수정 및 업로드**
→ files 폴더 `4주차_API가이드문서.pdf` 에서 확인 가능
    - API 가이드 문서 수정 및 보완 (완료)
    - Repository 업로드 (완료)
    - API 응답 예제 오타 수정 (완료) 

### 3. API 응답 값을 Excel 파일로 다운로드

- **Apache POI 라이브러리 적용 (완료)**
- **응답 값을 Excel 파일로 다운로드 할 수 있도록 poi 클래스 작성 (완료)**
- **정상 작동 확인 (완료)**

### 4. 기타

- 개발 진행 과정 기록
    - [Notion](https://www.notion.so/seul95/_-7aa48417b5c647738809afc1c78b7300)으로 관리 (진행)
        - 1주차 정리 완료
        - 2주차 정리 완료
        - 3주차 정리 완료
