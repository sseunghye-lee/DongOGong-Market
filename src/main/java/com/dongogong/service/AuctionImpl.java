package com.dongogong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dongogong.dao.AuctionPriceDao;
import com.dongogong.domain.AuctionPrice;
import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

@Service
@Transactional
public class AuctionImpl implements AuctionFacade {
	
	@Autowired
	private AuctionPriceDao auctionDao;

	@Override
	public void insertAuction(Post post) {
		auctionDao.insertAuction(post);
	}

	@Override
	public void updateAuction(Post post) {
		auctionDao.updateAuction(post);
	}

	@Override
	public void finishAuction(int postIdx) {
		auctionDao.finishAuction(postIdx);
	}

	@Override
	public String postRegisterId(int postIdx) {
		return auctionDao.postRegisterId(postIdx);
	}

	@Override
	public void insertTransaction(Transactions transactions) {
		auctionDao.insertTransaction(transactions);
	}

	@Override
	public void auctionPriceFinish(int postIdx) {
		auctionDao.auctionPriceFinish(postIdx);
	}

	@Override
	public List<Post> auctionList() {
		return auctionDao.auctionList();
	}

	@Override
	public int myAuctionRegister(String registerId) {
		return auctionDao.myAuctionRegister(registerId);
	}

	@Override
	public Post myAuction(int postIdx) {
		return auctionDao.myAuction(postIdx);
	}

	@Override
	public void attendAuction(AuctionPrice auctionPrice) {
		auctionDao.attendAuction(auctionPrice);
	}

	@Override
	public List<AuctionPrice> auctionProgress(int postIdx) {
		return auctionDao.auctionProgress(postIdx);
	}

	@Override
	public String auctionNickName(String buyerId) {
		return auctionDao.auctionNickName(buyerId);
	}

	@Override
	public AuctionPrice auctionPriceSize() {
		return auctionDao.auctionPriceSize();
	}

	@Override
	public void auctionDelete(int postIdx) {
		auctionDao.auctionDelete(postIdx);
	}

	@Override
	public void auctionPriceDelete(int postIdx) {
		auctionDao.auctionPriceDelete(postIdx);
	}

	@Override
	public Post auctionRegisterId(int postIdx) {
		return auctionDao.auctionRegisterId(postIdx);
	}

	@Override
	public AuctionPrice auctionMax(int postIdx) {
		return auctionDao.auctionMax(postIdx);
	}
/*
	@Override
	public Transactions transactionSize() {
	
		return auctionDao.transactionSize();
	}*/

	@Override
	public void transactionDelete(int postIdx) {
		auctionDao.transactionDelete(postIdx);
		
	}

}
