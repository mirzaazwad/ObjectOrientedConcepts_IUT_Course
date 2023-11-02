package Lab6.ORM;

import Lab6.Model.IModel;
import Lab6.Model.ModelStrategy;

public interface ISQLModel {
    String initDatabase();
    String executeQuery(ModelStrategy model, String query, String... args);
}
