package False_Authentication.Academia.Guidance.service.impl;

import False_Authentication.Academia.Guidance.entity.InterestedStudent;
import False_Authentication.Academia.Guidance.repository.InterestedStudentRepository;
import False_Authentication.Academia.Guidance.service.InterestedStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestedStudentServiceImpl implements InterestedStudentService {

    private InterestedStudentRepository interestedStudentRepository;
    public InterestedStudentServiceImpl(InterestedStudentRepository interestedStudentRepository){
        super();
        this.interestedStudentRepository = interestedStudentRepository;
    }
    @Override
    public List<InterestedStudent> getAllInterestedStudents(){
        return interestedStudentRepository.findAll();
    }
}
