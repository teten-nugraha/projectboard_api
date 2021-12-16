package id.ten.projectboard_api.service;

import id.ten.projectboard_api.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskServiceImpl {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

}
