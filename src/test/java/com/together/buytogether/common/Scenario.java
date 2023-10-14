package com.together.buytogether.common;

import com.together.buytogether.member.feature.api.RegisterMemberApi;
import com.together.buytogether.member.feature.api.SignInMemberApi;
import com.together.buytogether.member.feature.api.SignOutMemberApi;
import com.together.buytogether.post.feature.api.DeletePostApi;
import com.together.buytogether.post.feature.api.RegisterPostApi;
import com.together.buytogether.post.feature.api.UpdatePostApi;
import com.together.buytogether.postcomment.feature.api.RegisterCommentApi;

public class Scenario {
    public static RegisterMemberApi registerMember() {
        return new RegisterMemberApi();
    }

    public SignInMemberApi signInMember() {
        return new SignInMemberApi();
    }

    public SignOutMemberApi signOutMember() {
        return new SignOutMemberApi();
    }

    public RegisterPostApi registerPost() {
        return new RegisterPostApi();
    }

    public UpdatePostApi updatePost() {
        return new UpdatePostApi();
    }

    public DeletePostApi deletePost() {
        return new DeletePostApi();
    }

    public RegisterCommentApi registerComment() {
        return new RegisterCommentApi();
    }
}
