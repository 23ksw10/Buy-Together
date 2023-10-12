package com.together.buytogether.post.feature.api;

import com.together.buytogether.common.Scenario;
import com.together.buytogether.post.feature.UpdatePost;
import io.restassured.RestAssured;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class UpdatePostApi {
    private Long postId = 1L;
    private String newTitle = "newTitle";
    private String newContent = "newContent";
    private String sessionId = "";

    public UpdatePostApi postId(Long postId) {
        this.postId = postId;
        return this;
    }

    public UpdatePostApi newTitle(String newTitle) {
        this.newTitle = newTitle;
        return this;
    }

    public UpdatePostApi newContent(String newContent) {
        this.newContent = newContent;
        return this;
    }

    public UpdatePostApi sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public Scenario request() {
        UpdatePost.Request request = new UpdatePost.Request(
                newTitle,
                newContent,
                LocalDateTime.now().plusDays(2)
        );

        RestAssured.given().log().all()
                .contentType("application/json")
                .body(request)
                .cookie("JSESSIONID", sessionId)
                .when().put("/posts/{postId}/update", postId)
                .then().log().all()
                .statusCode(HttpStatus.OK.value());
        return new Scenario();
    }
}