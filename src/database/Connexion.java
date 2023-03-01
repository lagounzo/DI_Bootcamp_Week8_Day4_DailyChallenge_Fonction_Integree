/**
 * @Author : N'ZO LAGOU
 *
 * Dans cet exercice, vous appellerez une fonction de chaîne intégrée initcap()qui met en majuscule chaque mot d'une chaîne.
 *
 * Pour appeler la initcap()fonction, procédez comme suit :
 *
 * Tout d'abord, établissez une connexion à la base de données.
 * Deuxièmement, créez un CallableStatementobjet et enregistrez les OUTparamètres.
 * Troisièmement, exécutez l'appel de fonction et obtenez le résultat renvoyé.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private Connection connection = null;

    public Connection getConnecion() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "root2022");
            System.out.println("Connexion établie");
        } catch (SQLException ex) {
            System.out.println("Erreur de connexion à la base de données");
            ex.printStackTrace();
        }

        return connection;
    }
}
