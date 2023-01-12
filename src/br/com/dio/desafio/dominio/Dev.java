package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Content> firstContent = this.subscribedContents.stream().findFirst();
        if (firstContent.isPresent()) {
            this.completedContents.add(firstContent.get());
            this.subscribedContents.remove(firstContent.get());
        } else {
            System.err.println("You are not subscribed to any content!");
        }
    }

    public double calculateTotalXP() {
        return completedContents.stream().mapToDouble(Content::calculateXP).sum();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dev dev = (Dev) obj;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContents, dev.subscribedContents) && 
                Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, completedContents);
    }
}
