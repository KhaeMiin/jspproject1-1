package japbook.jpashop.repository;

import japbook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

//    @PersistenceContext
    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id) { //단건조회
        return em.find(Member.class, id); //find(type, pk)
    }

    public List<Member> findAll() { //회원 모두 조회
        return em.createQuery("select m from Member m", Member.class)
                //jpql(qlString): sql과 기능적으로는 거의 동일하지만 from의 대상이 테이블을 대상으로 쿼리를 하지만 얘는 Entity객체를 대상으로 함
                .getResultList();
    }

    public List<Member> findByName(String name) { //회원 이름으로 조회
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}
