# blog-search </br>
- Spring Boot, JPA, Gradle </br>
- jar 파일 위치경로 </br>
  https://drive.google.com/file/d/1DznK8FPPANWVz3tk3Ddb0iqP3OIRv4c3/view?usp=share_link
- 호출 API Sample </br>
[키워드 검색] localhost:8080/blogs?query=맛집&page=1&sort=accuracy&size=10 </br>
  - sort: recency(최신순), 기본 값 accuracy </br>
  - page: pageNumber </br>
  - size: pageSize </br>

[인기검색어]  localhost:8080/popular
- 외부 라이브러리 사용 </br>
 com.h2database:h2:1.4.200 => H2 DB연동 </br>
 com.google.code.gson:gson:2.8.9 => String객체 Json Type으로 변환 </br>
