### Description

This project demonstrates the problem
with [isolated gradle projects feature](https://docs.gradle.org/current/userguide/isolated_projects.html)
and [maven-publish plugin](https://docs.gradle.org/current/userguide/publishing_maven.html).

### How to reproduce

Run the command:

```bash
./gradlew publishMavenPublicationToMavenLocal
```

It will fail with error:

```
Unknown location: Project ':app' cannot access 'Project.group' functionality on another project ':lib'
```

### Without isolated project features

If we disable the [isolated project feature](https://docs.gradle.org/current/userguide/isolated_projects.html)
in [gradle.properties](https://github.com/dkrasnoff/simple-publish/blob/a14a9da02cebdf32c60e84ddd84795e6f1f0b986/gradle.properties),
then everything works fine. 