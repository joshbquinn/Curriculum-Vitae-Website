package com.joshbquinn.webcv.data;

import javax.persistence.*;

@Entity
@Table(name = "to_do")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private Boolean completed;

    public ToDo(){

    }

    public ToDo(String title,  Boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public ToDo(Long id, String title,  Boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public void setId(Long id) {
        this.id =id;

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }


}
