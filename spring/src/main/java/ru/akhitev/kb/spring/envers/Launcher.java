package ru.akhitev.kb.spring.envers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.akhitev.kb.spring.envers.conf.DbConf;
import ru.akhitev.kb.spring.envers.repo.FleetUnitRepo;

public class Launcher {
    private static Logger logger = LoggerFactory.getLogger(Launcher.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DbConf.class);

        FleetUnitRepo repo = context.getBean(FleetUnitRepo.class);
        logger.info("{}", repo.findAll());
    }
}