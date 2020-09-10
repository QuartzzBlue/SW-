package com.quartz.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quartz.boot.vo.RequestInfoVO;


/* 마이바티스는 데이터 접근 객체인 DAO를 생성하는 것보다 
 * sqlSessionDaoSupport나 sqlSessionTemplate을 사용하는 것을 권장
 */

@Mapper
public interface ReqInfoMapper {
		
	List<RequestInfoVO> selectLCByYear(String yy) throws Exception;

}
