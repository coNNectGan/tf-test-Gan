package com.tecforte.blog.repository;
import com.tecforte.blog.domain.Blog;
import com.tecforte.blog.domain.Entry;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Spring Data  repository for the Entry entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

    @Query("select a from Entry a where a.blog.id = :blogId")
    List<Entry> findByBlogId(@Param("blogId") Long blogId);


}
