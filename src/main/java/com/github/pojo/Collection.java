package com.github.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Collection {

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date date = Date.from(Instant.now());

    private LocalDateTime localDateTime = LocalDateTime.now();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
