package japbook.jpashop;

import javax.persistence.Entity;

/**
 * -   @Entity: 테이블에 대응되는 도메인 클래스를 의미, JPA가 동작할 때, 데이터를 다루는 작업 단위이기도 함
 * -   @Table: 테이블을 생성할 때 사용할 정보를 기술할 수 있음, 기술하지 않으면 클래스 명으로 테이블을 생성
 * -   @Id:  **Primary Key**를 지정
 * -   @GeneratedValue: Primary Key 컬럼의 데이터를 삽입할 때, 사용할 전략,  **GenerationType.IDENTITY**로 지정 시 PK 생성 전략을 데이터베이스에 위임
 * -   @Enumerated: Enum 타입을 사용시 지정
 */
//@Entity
public class Member {

}
