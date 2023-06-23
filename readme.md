How to run tests:
Pre-requirements
Next software must be installed:
- JDK 1.8
  - Windows: https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html
  - Linux: https://docs.oracle.com/javase/8/docs/technotes/guides/install/linux_jdk.html
  - MacOS: https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html
- Maven: https://www.baeldung.com/install-maven-on-windows-linux-mac
- Allure: https://docs.qameta.io/allure/

Download project from git.

- Run test from command line with maven

1. Go to project directory
2. Run command line(windows) or terminal(linux, mac os)
3. Type command:
    # Run all tests:
    - mvn clean test

    # Run a single test class.
    - mvn clean -Dtest=YourClassName test

     # Run a single test package.
    - mvn clean -Dtest=yourPackage.*Test test

    # Run different browser.
    - mvn clean -Dbrowser=chrome test
    - mvn clean -Dbrowser=firefox test

    # Headless mode
    - mvn -Dheadless=true test

    Run allure report:
    - allure serve allure-results