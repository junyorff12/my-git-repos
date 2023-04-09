package com.mygitrepos.junyorff12;

import java.util.Objects;

public class Repos {
    public String id;
    public String name;
    public String html_url;

    public Repos(String id, String name, String html_url) {
        this.id = id;
        this.name = name;
        this.html_url = html_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    @Override
    public String toString() {
        return "Repos{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", name_url='" + html_url + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repos repos = (Repos) o;
        return Objects.equals(id, repos.id) && Objects.equals(name, repos.name) && Objects.equals(html_url, repos.html_url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, html_url);
    }
}
