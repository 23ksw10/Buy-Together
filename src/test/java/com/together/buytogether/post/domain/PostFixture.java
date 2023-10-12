package com.together.buytogether.post.domain;

import com.together.buytogether.member.domain.MemberFixture;

import java.time.LocalDateTime;

public class PostFixture {
    private final MemberFixture memberFixture = MemberFixture.aMember();
    private String title = "title";
    private String content = "content";

    private PostStatus status = PostStatus.OPEN;
    private LocalDateTime expiredAt = LocalDateTime.now().plusDays(1);

    public static PostFixture aPost() {
        return new PostFixture();
    }

    public PostFixture title(String title) {
        this.title = title;
        return this;
    }

    public PostFixture content(String content) {
        this.content = content;
        return this;
    }

    public PostFixture status(PostStatus status) {
        this.status = status;
        return this;
    }

    public PostFixture expiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    public Post build() {
        return new Post(
                memberFixture.build(),
                title,
                content,
                status,
                expiredAt
        );
    }
}