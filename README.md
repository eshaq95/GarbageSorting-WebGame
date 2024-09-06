# Environmental Education Game Website (Garbage Sorting)

## Project Overview
This project is an interactive web-based game designed to educate users about garbage sorting and environmental sustainability. It combines a user-friendly frontend interface with a robust backend system, providing an engaging platform for learning about waste management.

## Technologies Used
- Frontend: HTML (2.3%), CSS (3.1%), JavaScript (94.5%)
- Backend: Java (0.1%), Spring Boot
- Database: MyBatis (ORM)
- Build Tool: Maven
- Version Control: Git
- CI/CD: Jenkins

## Project Structure
- `.mvn/wrapper/`: Maven wrapper for build automation
- `frontend/`: Contains the frontend code of the application
  - HTML files (home.html, upload.html, login.html)
  - CSS files (styles.css, main.css, style.css)
  - JavaScript files (jquery.pure.tooltips.js, spop.min.js)
  - Image assets (logo.jpg, backk.jpg, binss.png, etc.)
- `src/`: Source code directory
  - `main/java/`: Java backend code
    - Controllers (e.g., UserController.java)
    - Services (e.g., UserService.java)
    - Models (e.g., User.java)
    - Data mappers (e.g., UserMapper.java)
  - `main/resources/`: Configuration files
    - `application.properties`
  - `test/java/`: Unit tests
- `Jenkinsfile`: Defines the Jenkins pipeline for CI/CD
- `pom.xml`: Maven project configuration file

## Key Features
1. User Authentication:
   - Login functionality for personalized experiences
   - User registration and account management

2. Garbage Sorting Game:
   - Interactive interface for learning about waste classification
   - Image upload functionality for identifying and sorting garbage items

3. Educational Content:
   - Informative resources about environmental sustainability
   - Visual aids and icons representing different types of waste

4. Multimedia Experience:
   - Background music and sound effects (bgm1.mp3, bgm2.mp3, 12780.wav)
   - Rich graphical interface with various image assets

5. Responsive Design:
   - User-friendly layout adaptable to different devices


## Team Collaboration
This project was developed collaboratively, utilizing:
- Git for version control
- Jenkins for continuous integration and deployment
- Agile methodologies for project management

## Testing
- Unit tests for backend services and controllers (UserServiceTest.java, UserControllerTest.java)
- [Add information about any frontend or integration tests]

## Future Enhancements
- Extend game to include all aspects of sustainability 

## Contributors
- Eshaq Rahmani
- Students in Team Project with me


## Acknowledgments
- Forked from siazon/GarbageSorting (Team project student's GitHub)
