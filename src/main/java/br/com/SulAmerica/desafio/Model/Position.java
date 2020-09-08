package br.com.SulAmerica.desafio.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "position")
public class Position {
    private Long id;

    private String positionName;

    private boolean active;

    public Long getId() {
        return id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
