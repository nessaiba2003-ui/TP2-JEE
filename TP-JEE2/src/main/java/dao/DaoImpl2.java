package dao;

import org.springframework.stereotype.Component;

@Component("dao2")  // nous avons déclarer cette classe comme un bean Spring avec l'identifiant "dao2"
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        // on remarque que cette implémentation alternative retourne 1500.0
        return 1500.0;
    }
}