package kr.ch.oe.service;

import kr.ch.oe.model.Member;
import kr.ch.oe.model.Mokjang;

public interface MokjangService {

	public Mokjang getMokjangByLeader(Member member);
}
