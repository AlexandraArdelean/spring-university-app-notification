package message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Instant;

@Component
@RabbitListener(queues = "assignments")
public class AssignmentsMessageReceiver {
    @RabbitHandler
    public void receiveAssignments(String assignmentMessage){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            AssignmentsMessageReceiver assignmentsMessageReceiver=
                    objectMapper.readValue(assignmentMessage, AssignmentsMessageReceiver.class);

        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        System.out.println("Assignment: " + assignmentMessage + "schedules on: " + "[" + Date.from(Instant.now()) + "]" );
    }


}
