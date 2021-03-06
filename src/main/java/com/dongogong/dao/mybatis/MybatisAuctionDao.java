package com.dongogong.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.dongogong.dao.AuctionPriceDao;
import com.dongogong.dao.mybatis.mapper.AuctionMapper;
import com.dongogong.domain.AuctionPrice;
//import com.dongogong.domain.Photo;
import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

@Repository
public class MybatisAuctionDao implements AuctionPriceDao {
   
   @Autowired
   private AuctionMapper auctionMapper;

   @Override
   public void insertAuction(Post post) throws DataAccessException {
      auctionMapper.auctionRegister(post);
      
   }
   
   @Override
   public void updateAuction(Post post) throws DataAccessException {
      auctionMapper.auctionUpdate(post);
   }
   
   @Override
   public void finishAuction(int postIdx) throws DataAccessException {
      auctionMapper.auctionFinish(postIdx);
   }
   
   @Override
   public String postRegisterId(int postIdx) throws DataAccessException {
      return auctionMapper.postRegisterId(postIdx);
   }
   
   @Override
   public void insertTransaction(Transactions transactions) throws DataAccessException {
      auctionMapper.insertTransaction(transactions);
   }
   
   @Override
   public void auctionPriceFinish(int postIdx) throws DataAccessException {
      auctionMapper.auctionPriceFinish(postIdx);
   }

   @Override
   public List<Post> auctionList() throws DataAccessException {
      return auctionMapper.auctionList();
   }
   
   @Override
   public int myAuctionRegister(String registerId) throws DataAccessException {
      return auctionMapper.myAuctionRegister(registerId);
   }

   @Override
   public Post myAuction(int post_idx) throws DataAccessException {
      return auctionMapper.myAuction(post_idx);
   }

   @Override
   public void attendAuction(AuctionPrice auctionPrice) throws DataAccessException {
      auctionMapper.auctionSend(auctionPrice);
      auctionMapper.updatePostPrice(auctionPrice.getPrice(), auctionPrice.getPostIdx());
   }

   @Override
   public List<AuctionPrice> auctionProgress(int postIdx) throws DataAccessException {
      return auctionMapper.auctionProgress(postIdx);
   }

   @Override
   public AuctionPrice auctionPriceSize() throws DataAccessException {
      return auctionMapper.auctionPriceSize();
   }

   @Override
   public void auctionDelete(int postIdx) throws DataAccessException {
      auctionMapper.auctionDelete(postIdx);
   }

   @Override
   public void auctionPriceDelete(int postIdx) throws DataAccessException {
      auctionMapper.auctionPriceDelete(postIdx);
   }

   @Override
   public Post auctionRegisterId(int postIdx) throws DataAccessException {
      return auctionMapper.auctionRegisterId(postIdx);
   }

   @Override
   public AuctionPrice auctionMax(int postIdx) throws DataAccessException {
      return auctionMapper.auctionMax(postIdx);
   }

   @Override
   public void transactionDelete(int postIdx) throws DataAccessException {
      auctionMapper.transactionDelete(postIdx);
      
   }

}