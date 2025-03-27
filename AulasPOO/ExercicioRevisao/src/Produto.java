public class Produto {
    
    private String name;
    private Double preco;
    private Integer quantidade;


    //*gets */
    public String getName() {
        return name;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    /*sets */

    public void setName(String name) {
        this.name = name;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
