package org.javalite.db_migrator.maven;

import org.apache.maven.plugin.MojoExecutionException;

import static java.lang.String.format;

/**
 * @goal help
 */
public class HelpMojo extends AbstractMigrationMojo {
    public void executeMojo() throws MojoExecutionException {

        getLog().info("");
        getLog().info("JavaLite DB-Migrator Plugin");
        getLog().info("  Provides a set of utilities for database migrations.");
        getLog().info("");
        getLog().info("This plugin has the following goals:");
        getLog().info("");
        getLog().info("db-migrator:drop");
        getLog().info("  drops database configured in pom");
        getLog().info("db-migrator:create");
        getLog().info("  creates database configured in pom");
        getLog().info("db-migrator:new");
        getLog().info("  creates a new migration file");
        getLog().info("db-migrator:check");
        getLog().info("  checks that no pending migrations remain. " +
                "This can be used in build lifecycle to fail the build if pending migrations are found");
        getLog().info("db-migrator:migrate");
        getLog().info("  migrates all pending migrations");
        getLog().info("db-migrator:validate");
        getLog().info("  validates and prints a report listing pending migrations");
        getLog().info("db-migrator:reset");
        getLog().info("  drops/re-creates the database, and runs all migrations, " +
                "effectively resetting database to pristine state");
        getLog().info("db-migrator:help");
        getLog().info("  prints this message");


    }
}