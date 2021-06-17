package com.dongogong.service;

import com.dongogong.dao.PostDao;
import com.dongogong.domain.Post;
import com.dongogong.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PostImpl implements PostFacade {

    @Autowired
    private PostDao postDao;
    @Autowired
    private PostRepository postRepository;

    // 전체상품 가져오기
    @Override
    public List<Post> getPostList() {
        return postDao.getPostList();
    }

    //카테고리별 상품출력
    @Override
    public List<Post> getCategory(String borderType) {
        return postDao.getCategory(borderType);
    }


    // 내 상품 가져오기
    @Override
    public List<Post> getPost(String registerId) {
        return postDao.getPost(registerId);
    }

    // 상품 눌렀을때 정보보기
    @Override
    public Post selectPost(int post_idx) {
        return postDao.selectPost(post_idx);
    }

    // 상품 등록
    @Override
    public void registerPost(Post post) {
        postDao.registerPost(post);
    }

    //상품 수정
    @Override
    public void updatePost(Post post) {
        postDao.updatePost(post);
    }

    //상품 삭제
    @Override
    public void postDelete(int postIdx) {
        postDao.postDelete(postIdx);
    }

    //거래 삭제
    @Override
    public void transactionDelete(int postIdx) {
        postDao.transactionDelete(postIdx);

        //릴레이션 삭제
    }

    @Override
    public void relationDelete(int postIdx) {
        postDao.relationDelete(postIdx);

    }

    //채팅 삭제
    @Override
    public void chatDelete(int postIdx) {
        postDao.chatDelete(postIdx);

    }

    @Override
    public Post getPostListSize() {
        return postDao.getPostListSize();
    }

    @Override
    public Post getPostIdx(int postIdx) {
        return postDao.getPostIdx(postIdx);
    }

    @Override
    public void updatePost(int postIdx) {
        postDao.updatePost(postIdx);
    }

    @Override
    public List<Post> cartList(String buyerId) {
        return postDao.cartList(buyerId);
    }

    @Override
    public List<Post> transactionsCheckList(String buyerId) {
        return postDao.transactionsCheckList(buyerId);
    }

    @Override
    public void deleteCartPost(int postIdx) {
        postDao.deleteCartPost(postIdx);
    }

    @Override
    public void updatePostOnChat(Post post) {
        post.setTransactionConfirmation("COMPLETED");
        postRepository.save(post);
    }
}