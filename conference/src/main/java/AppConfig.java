import com.codewithnas.repository.HibernateSpeakerRepositoryImpl;
import com.codewithnas.repository.SpeakerRepository;
import com.codewithnas.service.SpeakerService;
import com.codewithnas.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return  new HibernateSpeakerRepositoryImpl();
    }
}
