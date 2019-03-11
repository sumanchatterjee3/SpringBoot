package boot.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.spring.DAO.PeopleManagementDAO;
import boot.spring.model.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDAO peoplemanagementdao;
	
	
}
