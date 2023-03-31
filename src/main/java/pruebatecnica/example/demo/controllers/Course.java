package pruebatecnica.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/user")
public class Course {
    public CourseService courseService;

    @GetMapping
    public List<Course> getAllUsers(){
         return courseService.findAll();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id){
        return courseService.findById(id);

    }

    @PostMapping()
    public ResponseEntity<Course> createCourse(@RequestBody Course courseDetails){
         Course courseSave = courseService.save(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCourse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> courseDelete (@PathVariable Long id){
        courseService.deleteById(id);
        return ResponseEntity.ok("course deleted");
    }


    
}
