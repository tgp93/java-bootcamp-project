import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorship;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course();
        course1.setTitle("Java course");
        course1.setDescription("Java course description");
        course1.setNumberOfHours(8);

        Course course2 = new Course();
        course2.setTitle("Javascript course");
        course2.setDescription("Javascript course description");
        course2.setNumberOfHours(4);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Mentorship");
        mentorship.setDescription("Mentorship description");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Full-stack Developer Bootcamp");
        bootcamp.setDescription("Full-stack Developer Bootcamp description");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(devCamila.getName() + "'s subscribed content:" + devCamila.getSubscribedContents());
        devCamila.progress();
        System.out.println(devCamila.getName() + "'s subscribed content:" + devCamila.getSubscribedContents());
        System.out.println(devCamila.getName() + "'s completed content:" + devCamila.getCompletedContents());
        System.out.println(devCamila.getName() + "'s XP:" + devCamila.calculateTotalXP());
        
        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(devJoao.getName() + "'s subscribed content:" + devJoao.getSubscribedContents());
        System.out.println(devJoao.getName() + "'s completed content:" + devJoao.getCompletedContents());
        System.out.println(devJoao.getName() + "'s XP:" + devJoao.calculateTotalXP());
    }
}