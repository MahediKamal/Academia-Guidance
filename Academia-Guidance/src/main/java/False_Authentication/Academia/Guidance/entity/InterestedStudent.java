package False_Authentication.Academia.Guidance.entity;

import javax.persistence.*;

@Entity
@Table(name = "interestedStudent")
public class InterestedStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "country")
    private String country;

    // constructors
    public InterestedStudent(){}
    public InterestedStudent(String name, String country){
        super();
        this.name = name;
        this.country = country;
    }

    // getters setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }

}
