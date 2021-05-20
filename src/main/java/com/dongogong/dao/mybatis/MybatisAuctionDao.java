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
	
	/*
	@Override
	public void insertPhoto(Photo photo) throws DataAccessException {
		auctionMapper.auctionPhoto(photo);
	}
	 */
	@Override
	public void updateAuction(Post post) throws DataAccessException {
		auctionMapper.auctionUpdate(post);
	}
	
	/*
	@Override
	public void updatePhoto(Photo photo) throws DataAccessException {
		auctionMapper.photoUpdate(photo);
	}
	*/
	@Override
	public void finishAuction(Post post) throws DataAccessException {
		auctionMapper.auctionFinish(post);
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
	public void auctionPriceFinish(AuctionPrice auctionPrice) throws DataAccessException {
		auctionMapper.auctionPriceFinish(auctionPrice);
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

	/*
	@Override
	public AuctionPrice auctionPrice(int post_idx) throws DataAccessException {
		return auctionMapper.auctionPrice(post_idx);
	}

	@Override
	public Post auctionPrice2(int post_idx) throws DataAccessException {
		return auctionMapper.auctionPrice2(post_idx);
	}
	*/

	@Override
	public void attendAuction(AuctionPrice auctionPrice) throws DataAccessException {
		auctionMapper.auctionSend(auctionPrice);
		auctionMapper.updatePostPrice(auctionPrice.getPrice(), auctionPrice.getPostIdx());
		auctionMapper.updateAuctionPrice(auctionPrice.getPrice());
	}

	@Override
	public List<AuctionPrice> auctionProgress(int postIdx) throws DataAccessException {
		return auctionMapper.auctionProgress(postIdx);
	}

	@Override
	public String auctionNickName(String buyerId) throws DataAccessException {
		return auctionMapper.auctionNickName(buyerId);
	}

}
