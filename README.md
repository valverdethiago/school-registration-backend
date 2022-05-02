# OT/Metadata Senior Software Engineer - Take-home test


## Challenge Statement

School registration system

Design and implement simple school registration system
- Assuming you already have a list of students
- Assuming you already have a list of courses
- A student can register to multiple courses
- A course can have multiple students enrolled in it.
- A course has 50 students maximum
- A student can register to 5 course maximum

Provide the following REST API:
- Create students CRUD
- Create courses CRUD
- Create API for students to register to courses
- Create abilities for user to view all relationships between students and courses
+ Filter all students with a specific course
+ Filter all courses for a specific student
+ Filter all courses without any students
+ Filter all students without any courses

## Solution

To accomplish the goals described on the assignment a spring application was built with 4 sub-modules 
to implement it using the standard [hexagonal architecture](#hexagonal-architecture):
* school-registration-application - It contains the components that exposes the system functionality 
to the word.  
* school-registration-domain - Module that encapsulates all the domain objects and its business rules
* school-registration-infrastructure - It creates the glue between the application and domain and 
configures the technical aspects (frameworks) of the software
* school-registration-launcher - The launcher is the module that is ran and has the configurations for
the deployment.

## Hexagonal Architecture

Hexagonal architecture is a pattern that is getting some traction nowadays. It's well known as a good way
to provide a clear separation of the business logic from the frameworks and infrastructure details.  

You can find more information about this pattern in 
[this netflix blog post](https://netflixtechblog.com/ready-for-changes-with-hexagonal-architecture-b315ec967749) 
and [wikipedia](https://en.wikipedia.org/wiki/Hexagonal_architecture_(software)). 

# Development environment

To be able to run the dev environment locally without needing to install anything some tasks are provided in the [Makefile](./Makefile):
* dev-start - starts all infrastructure containers available on [this docker-compose](./docker/docker-compose.yml) file;
* dev-stop - stops all infrastructure containers
* stack-start - starts the whole solution including the apps. **Important : the application should be built first**
* stack-stop - stops all containers from the task above
* build - builds the entire application
* run-api - starts the **user-api** module. **Important: the infrastructure containers must be up and running (from task dev-start)**

Once the application is started you should be able to access its swagger page on
[http://localhost:8080](http://localhost:8080) (for development environment) or
[http://localhost:9090](http://localhost:9090) (for docker compose).

# Endpoints documentation

The endpoints documentation could be found [./ENDPOINTS.md](here). 


