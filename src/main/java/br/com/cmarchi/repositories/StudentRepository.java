package br.com.cmarchi.repositories;

import br.com.cmarchi.domain.Student;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface StudentRepository extends MongoRepository<Student, UUID> {


    Student findByStudentId(UUID studentId);
}
