# RESTful API basic
1. setting.sql 내용을 이용해 rest DB를 세팅한다.
2. application.properties 계정 정보를 수정한다.
3. 프로젝트를 실행한다.

## API DOC
#### GET MYPROFILE
`http://localhost:8080/`
> 나의 프로필 조회

---
#### GET MEMBERLIST 

`http://localhost:8080/member`
> 멤버 리스트 조회
---
#### GET PRODUCTLIST

`http://localhost:8080/product`
> 상품 리스트 조회
---
#### GET PRODUCTDETAIL

`http://localhost:8080/product/{id}`
> 특정 상품 상세정보 조회