package book.shop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    // 엔티티를 영구저장하는 환경 이라는 뜻
    // 어플리케이션과 DB 사이에서 객체를 보관하는 가상의 DB 역할
    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);

        return member.getId();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
