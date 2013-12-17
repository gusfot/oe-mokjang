package kr.ch.oe.service;

import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.model.Report;

import org.springframework.stereotype.Service;

@Service
public interface ReportService {
	void report(Report report);

	void insertPersonalReport(PersonalReport personalReport);
}
