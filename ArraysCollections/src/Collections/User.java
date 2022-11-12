package Collections;
import java.util.*;

public class User {
    String nome;
    
    User(String nome){
        this.nome = nome;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(nome, user.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
