package xyz.stankovic;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import xyz.stankovic.health.TemplateHealthCheck;
import xyz.stankovic.resources.HelloWorldResource;

public class FootmarkApplication extends Application<FootmarkConfiguration> {

    public static void main(final String[] args) throws Exception {
        new FootmarkApplication().run(args);
    }

    @Override
    public String getName() {
        return "Footmark";
    }

    @Override
    public void initialize(final Bootstrap<FootmarkConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final FootmarkConfiguration configuration,
                    final Environment environment) {

        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);

        environment.jersey().register(resource);
    }

}
