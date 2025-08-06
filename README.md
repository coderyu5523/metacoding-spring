# Spring Boot 시작 프로젝트 (Gradle)

이 프로젝트는 Spring Boot를 처음 시작하는 분들을 위한 기본 템플릿입니다. Gradle을 사용하여 빌드합니다.

## 프로젝트 구조

```
spring-begin/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/springbegin/
│   │   │       ├── SpringBeginApplication.java
│   │   │       └── controller/
│   │   │           └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── build.gradle
├── gradlew
├── gradlew.bat
└── gradle/wrapper/
    └── gradle-wrapper.properties
```

## 실행 방법

### 1. Gradle Wrapper를 사용한 실행 (권장)
```bash
# 프로젝트 빌드
./gradlew build

# 애플리케이션 실행
./gradlew bootRun
```

### 2. Windows에서 실행
```cmd
# 프로젝트 빌드
gradlew.bat build

# 애플리케이션 실행
gradlew.bat bootRun
```

### 3. IDE에서 실행
- `SpringBeginApplication.java` 파일을 열고 `main` 메서드를 실행

## 테스트

애플리케이션이 실행되면 다음 URL로 접속하여 테스트할 수 있습니다:

- **홈페이지**: http://localhost:8080/
- **Hello API**: http://localhost:8080/hello
- **Hello API (파라미터 포함)**: http://localhost:8080/hello?name=스프링

## 포함된 기능

- ✅ Spring Boot 3.2.0
- ✅ Spring Web (REST API)
- ✅ Spring DevTools (개발 편의)
- ✅ 기본 REST 컨트롤러
- ✅ 애플리케이션 설정
- ✅ Gradle Wrapper

## Gradle 명령어

```bash
# 프로젝트 빌드
./gradlew build

# 애플리케이션 실행
./gradlew bootRun

# 테스트 실행
./gradlew test

# 의존성 확인
./gradlew dependencies

# 프로젝트 정리
./gradlew clean
```

## 다음 단계

이 기본 프로젝트를 바탕으로 다음과 같은 기능들을 추가할 수 있습니다:

1. **데이터베이스 연동**: Spring Data JPA 추가
2. **보안**: Spring Security 추가
3. **템플릿 엔진**: Thymeleaf 추가
4. **API 문서화**: Swagger/OpenAPI 추가
5. **테스트 코드**: JUnit, Mockito 활용

## 요구사항

- Java 17 이상
- Gradle 8.0 이상 (Gradle Wrapper가 자동으로 관리) 