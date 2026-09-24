// Indica a pasta onde o arquivo está guardado dentro do projeto
package Interface.dominio;

// Interface que define o contrato para carregar dados
public interface DataLoader {
     // Método vazio (contrato): quem usar essa interface é obrigado a criar o código deste método
     // Nota: Não precisa de 'public abstract' pois o Java já considera isso por padrão em interfaces
     void load();
}