
import java.util.Objects;

public class Carro {
    String modelo, cor, marca;

    //Construtor
    public Carro(String modelo, String cor, String marca) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca; 
    }
    //Sobrescrevendo o método equals() para comparar objetos Carro

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.modelo);
        hash = 67 * hash + Objects.hashCode(this.cor);
        hash = 67 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        return Objects.equals(this.marca, other.marca);
    }
    
}
