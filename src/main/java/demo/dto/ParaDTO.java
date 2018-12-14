package demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ParaDTO {
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date birthday;

    @Override
    public String toString() {
        return "ParaDTO{" +
            "name='" + name + '\'' +
            ", birthday=" + birthday +
            '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
