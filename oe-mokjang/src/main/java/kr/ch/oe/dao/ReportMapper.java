/**
 * 
 */
package kr.ch.oe.dao;

import java.util.List;

import kr.ch.oe.model.Report;

import org.springframework.stereotype.Repository;

/**
 * @author gusfot
 *
 */
@Repository
public interface ReportMapper {

	void insert(Report report);
	
	Report selectOne(Report report);
	
	List<Report> selectList();
}
