package dao;

import org.springframework.stereotype.Component;

@Component("dao")  // il faut declarer cette classe comme un bean Spring avec l'identifiant "dao"
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        // On remarque que cette implémentation retourne  valeur fixe qui est de 2000.0
        return 2000.0;
    }
}